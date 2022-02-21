package com.emst.Fudocs.filter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.bind.annotation.RequestBody;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.emst.Fudocs.constants.CmsConstants;
import com.emst.Fudocs.payload.request.LoginRequest;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CustomeAuthenticationFilter extends UsernamePasswordAuthenticationFilter {

	private final Logger log = LoggerFactory.getLogger(CustomeAuthenticationFilter.class);

	private AuthenticationManager authenticationManager;
	

	public CustomeAuthenticationFilter(AuthenticationManager authenticationManager) {
		this.authenticationManager = authenticationManager;
	}

	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
			throws AuthenticationException {

		
		//String username = request.getParameter("username");
		//String password = request.getParameter("password");
		
		/*
		 * String username = request.getHeader("username"); String password =
		 * request.getHeader("password");
		 */
		String dateas=CustomHttpServletRequestWrapper(request);
		String datea = dateas.replaceAll("\\s", "");
		String username = datea.substring(datea.indexOf("username:") + 9);;
		username = username.substring(0, username.indexOf(","));
		String password = datea.substring(datea.indexOf(",") + 10);
		
		System.out.println(username);

		log.info("Username is {}", username);
		log.info("Password is {}", password);

		UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(username,
				password);

		return authenticationManager.authenticate(authenticationToken);

	}

	@Override
	protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain,
			Authentication authentication) throws IOException, ServletException {

		User user = (User) authentication.getPrincipal();

		Algorithm algorithm = Algorithm.HMAC256("secret".getBytes());
		String accessToken = JWT.create().withSubject(user.getUsername())
				.withExpiresAt(new Date(System.currentTimeMillis() + 10 * 60 * 1000))
				.withIssuer(request.getRequestURL().toString())
				.withClaim("roles",
						user.getAuthorities().stream().map(GrantedAuthority::getAuthority).collect(Collectors.toList()))
				.sign(algorithm);

		String refreshToken = JWT.create().withSubject(user.getUsername())
				.withExpiresAt(new Date(System.currentTimeMillis() + 30 * 60 * 1000))
				.withIssuer(request.getRequestURL().toString())
				.withClaim("roles",
						user.getAuthorities().stream().map(GrantedAuthority::getAuthority).collect(Collectors.toList()))
				.sign(algorithm);

		/**
		response.setHeader("access_token", accessToken);
		response.setHeader("refresh_token", refreshToken);
		**/
		Map<String, String> token = new HashMap<>();
		if (user.getAuthorities().toString().contains(CmsConstants.ROLE_ADMIN)) {
			token.put("role", CmsConstants.ROLE_ADMIN);
		}else if (user.getAuthorities().toString().contains(CmsConstants.ROLE_DEVELOPER)) {
			token.put("role", CmsConstants.ROLE_DEVELOPER);
		}else if (user.getAuthorities().toString().contains(CmsConstants.ROLE_USER)) {
			token.put("role", CmsConstants.ROLE_USER);
		}
		
		token.put("access_token", accessToken);
		token.put("refresh_token", refreshToken);
		
		response.setContentType(MediaType.APPLICATION_JSON_VALUE);
		new ObjectMapper().writeValue(response.getOutputStream(), token);
	}
	public String CustomHttpServletRequestWrapper(HttpServletRequest request) {

	    StringBuilder stringBuilder = new StringBuilder();  
	    BufferedReader bufferedReader = null;  
	    String body=null;

	    try {  
	        InputStream inputStream = request.getInputStream(); 

	        if (inputStream != null) {  
	            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));  

	            char[] charBuffer = new char[128];  
	            int bytesRead = -1;  

	            while ((bytesRead = bufferedReader.read(charBuffer)) > 0) {  
	                stringBuilder.append(charBuffer, 0, bytesRead);  
	            }  
	        } else {  
	            stringBuilder.append("");  
	        }  
	    } catch (IOException ex) {  
	        logger.error("Error reading the request body...");  
	    } finally {  
	        if (bufferedReader != null) {  
	            try {  
	                bufferedReader.close();  
	            } catch (IOException ex) {  
	                logger.error("Error closing bufferedReader...");  
	            }  
	        }  
	    }  

	    body = stringBuilder.toString().trim(); 
	    body = body.replace("{", ""); 
	    body = body.replace("}", "");
	    body = body.replace("\"", "");
	    return body;
	}

}

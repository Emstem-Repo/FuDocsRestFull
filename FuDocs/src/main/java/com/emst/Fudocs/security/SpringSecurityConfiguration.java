package com.emst.Fudocs.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.emst.Fudocs.filter.CustomAuthorizationFilter;
import com.emst.Fudocs.filter.CustomeAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfiguration extends WebSecurityConfigurerAdapter{
	
	@Autowired
	UserDetailsService userDetailsService;
	
	
	  @Autowired private BCryptPasswordEncoder bcryptPasswordEncoder;
	 
	
	
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(bcryptPasswordEncoder);
	}
	
	@Override
	public void configure(HttpSecurity http) throws Exception {
		CustomeAuthenticationFilter customeAuthenticationFilter = new CustomeAuthenticationFilter(authenticationManagerBean());
		customeAuthenticationFilter.setFilterProcessesUrl("/loginapi/login");
		http.csrf().disable();
		http.cors().and().csrf().disable();
		
		http.authorizeHttpRequests().antMatchers("/loginapi/login/").permitAll();
		http.authorizeRequests().antMatchers("/academicYearMaster/**")
		.hasAnyAuthority("ADMIN");
		http.authorizeRequests().antMatchers("/academicYearMaster/**")
		.hasAnyAuthority("ADMIN");
		http.authorizeRequests().antMatchers("/criteria1/**")
		.hasAnyAuthority("ADMIN","USER");
		
		http.authorizeHttpRequests().anyRequest().authenticated();
		http.addFilter(customeAuthenticationFilter);
		http.addFilterBefore(new CustomAuthorizationFilter(), UsernamePasswordAuthenticationFilter.class);
	}



}

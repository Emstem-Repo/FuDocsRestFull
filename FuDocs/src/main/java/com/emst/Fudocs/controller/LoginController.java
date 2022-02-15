package com.emst.Fudocs.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emst.Fudocs.dto.AcademicYearDTO;
import com.emst.Fudocs.model.User;
import com.emst.Fudocs.service.UserService;


@RestController
@RequestMapping("/loginapi")
public class LoginController {
	
	private Logger log = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	private UserService service;
	
	@GetMapping("/login")
	public ResponseEntity<User> adminLogin(){
		log.info("inside add academicyear");
		User user=service.getUser("abc");
		return new ResponseEntity<>(user,HttpStatus.OK);
		
	}

}

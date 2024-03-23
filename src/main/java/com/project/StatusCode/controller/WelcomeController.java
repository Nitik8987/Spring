package com.project.StatusCode.controller;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/status")
	public ResponseEntity<String> welcomeMsg() {
		
		String msg = "Welcome To PostMan";
		return new ResponseEntity<String>(msg,HttpStatus.OK);
		
	}
}

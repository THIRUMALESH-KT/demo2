package com.demo2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employe")
public class controller {

	@GetMapping("/hello")
	public ResponseEntity<Object> hello(){
		return ResponseEntity.ok("welcome to hello page");
	}
}

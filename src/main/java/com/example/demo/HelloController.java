package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpServerErrorException;

import java.util.Date;

@RestController
public class HelloController {

	@GetMapping("/")
	public ResponseEntity index() {

		return new ResponseEntity("Some Internal Exception", HttpStatus.INTERNAL_SERVER_ERROR);
	}

}

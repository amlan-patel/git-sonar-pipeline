package com.learning.controller;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	@GetMapping
	public String welcome() {
		return "Hello World!";
	}
	
	@GetMapping("/hello/{name}")
	public String hello(@PathParam("name") String name) {
		return "Hello " + name;
	}
	
}

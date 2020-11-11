package com.rubywebworks.springboot.quickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication   //This is a spring boot app
@RestController          //This is a REST controller
public class CourseApiApp {

	public static void main(String[] args) {
		// minimal spring boot app needs this line to declare this class as the entry point
		SpringApplication.run(CourseApiApp.class, args);
	}

	@GetMapping("/hello")   //mapping /hello web url to this method, defaults to GET method.
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}
}
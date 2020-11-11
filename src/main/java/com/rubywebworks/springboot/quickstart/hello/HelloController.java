package com.rubywebworks.springboot.quickstart.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController          //This is a REST controller
public class HelloController {
	
	@GetMapping("/hello")   //mapping /hello web url to this method, defaults to GET method.
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

}

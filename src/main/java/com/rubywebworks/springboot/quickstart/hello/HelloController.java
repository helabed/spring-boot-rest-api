package com.rubywebworks.springboot.quickstart.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController          // This is a REST controller, just because it is in the classpath, Spring will know
                         // about this class and all its url mappings. It does so by scanning the classes in
                         // the classpath and extracting meaning using the @annotations.
public class HelloController {
	
	@GetMapping("/hello")   //mapping /hello web url to this method, defaults to GET method.
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	@RequestMapping("/bonjour")//mapping /bonjour web url to this method sayHi(), defaults to GET method.
	public String sayHi() {
        return "Hi";
	}

}

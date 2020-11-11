package com.rubywebworks.springboot.quickstart.topic;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")//mapping /topics web url to this method getAllTopics(), defaults to GET method.
	public String getAllTopics() {
        return "All Topics";
	}
}
package com.rubywebworks.springboot.quickstart.topic;


import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

  @RequestMapping("/topics") // mapping /topics web url to this method getAllTopics(), defaults to GET method.
                             // Spring MVC auto magically converts the List<Topic> into JSON and returns it to the
                             // caller, in this case the web browser.
  public List<Topic> getAllTopics() {
        return Arrays.asList(
                     new Topic("spring", "Spring Framework", "Introduction to the Spring Framework"),
                     new Topic("java", "Core Java", "Introduction to Core Java"),
                     new Topic("javascript", "Javascript Programming", "Introduction to JavaScript Programming")
            );
  }
}

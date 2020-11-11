package com.rubywebworks.springboot.quickstart.topic;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
  
  @Autowired   // marks this instance as needing to be dependency injected into this class.
  private TopicService topicService;

  @RequestMapping("/topics") // mapping /topics web url to this method getAllTopics(), defaults to GET method.
                             // Spring MVC auto magically converts the List<Topic> into JSON and returns it to the
                             // caller, in this case the web browser.
  public List<Topic> getAllTopics() {
    return topicService.getAllTopics();
  }

  @RequestMapping("/topics/{topicId}")
  public Topic getTopic(@PathVariable("topicId") String id) {
    return topicService.getTopic(id);
  }
}
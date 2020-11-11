package com.rubywebworks.springboot.quickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication   //This is a spring boot app
public class CourseApiApp {

  public static void main(String[] args) {
    // minimal spring boot app needs this line to declare this class as the entry point
    SpringApplication.run(CourseApiApp.class, args);
  }
}

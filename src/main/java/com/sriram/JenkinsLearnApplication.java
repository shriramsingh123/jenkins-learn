package com.sriram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsLearnApplication {

	@GetMapping("/jenkin")
	public String message(){
		return "##########Jenkins Running successfully #######3#";
	}

	public static void main(String[] args) {
		SpringApplication.run(JenkinsLearnApplication.class, args);
	}

}

package com.htc.aws.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitHubActionsController {

	@RequestMapping("/Welcome")
	public String Common() {
		String Message = "Deployment of Spring Boot with GitHub Actions";
		return Message;
		
	}
}

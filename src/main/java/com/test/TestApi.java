package com.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApi {

	@Value("${test}")
	private String test;

	@Value("${password}")
	private String password;

	@GetMapping("/test")
	public String test() {
		return test;
	}

	@GetMapping("/password")
	public String password() {
		return password;
	}
}

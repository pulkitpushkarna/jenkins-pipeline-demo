package com.jenkins.pipeline.demo.jenkinspipelinedemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
public class JenkinsPipelineDemoApplication {

	@Value("${app.version}")
	String appVersion;

	@Value("${app.env}")
	String appEnv;

	@GetMapping("/")
	public Map<String,String> index(){
		Map<String,String> map= new HashMap<>();
		map.put("appVersion",appVersion);
		map.put("appEnv",appEnv);
		return map;
	}

	public static void main(String[] args) {
		SpringApplication.run(JenkinsPipelineDemoApplication.class, args);
	}

}

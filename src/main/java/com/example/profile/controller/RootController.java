package com.example.profile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.profile.entity.Config;

@RestController
public class RootController {

	@Autowired
	private Config config;
	
	@RequestMapping("/test")
	public String test(){
		return config.toString();
	}
}

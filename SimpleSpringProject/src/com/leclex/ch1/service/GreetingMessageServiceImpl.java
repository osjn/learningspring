package com.leclex.ch1.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingMessageServiceImpl implements GreetingMessageService {
	public String greetUser() {
		return "Welcom to Chapter-1 of book Learning Spring Application Development";
	}
}
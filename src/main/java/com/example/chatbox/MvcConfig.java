package com.example.chatbox;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/home").setViewName("chat");
		registry.addViewController("/").setViewName("chat");
		registry.addViewController("/chat").setViewName("chat");
		registry.addViewController("/login").setViewName("login");
	}

}
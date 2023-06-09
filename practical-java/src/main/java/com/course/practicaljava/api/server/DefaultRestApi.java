package com.course.practicaljava.api.server;

import java.time.LocalTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class DefaultRestApi {

	private Logger LOG = LoggerFactory.getLogger(DefaultRestApi.class);

	@GetMapping(value = "/welcome")
	public String welcome() {
		LOG.info("Holaaaa ");
		return "Bienvenido a Spring Booooooooooot";
	}

	@GetMapping(value = "/time")
	public String time() {
		return LocalTime.now().toString();
	}
}

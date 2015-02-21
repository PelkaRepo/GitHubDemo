package org.pelka.demo.gitdemo.rest.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * This controller will enable REST endpoints for all related services and
 * expose data for consumption.
 * 
 * @author arnoldpelka
 *
 */
@RestController
public class MyController {
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	public MyController(long incrementAndGet, String format) {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Basic Spring request mapping that will allow for Hello World to be
	 * printed based on the controller bean.
	 * 
	 * @param name
	 *            Any person's name entered by an end-user; defaults to World if
	 *            no REST query is inserted
	 * @return Greeting response
	 */
	@RequestMapping("/")
	public MyController greeting(
			@RequestParam(value = "name", defaultValue = "World") String name) {
		return new MyController(counter.incrementAndGet(), String.format(
				template, name));
	}
}
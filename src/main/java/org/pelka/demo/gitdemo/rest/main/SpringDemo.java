/**
 * 
 */
package org.pelka.demo.gitdemo.rest.main;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * The orchestration for all spring-based commands will occur here
 * 
 * @author arnoldpelka
 *
 */
@ComponentScan
@EnableAutoConfiguration
public class SpringDemo {
	final static Logger logger = Logger.getLogger(SpringDemo.class);

	/**
	 * Main method for orchestrating Spring context-based applications
	 * 
	 * @param args Command line arguments (currently, this application
	 * does not require any)
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringDemo.class, args);
	}

}

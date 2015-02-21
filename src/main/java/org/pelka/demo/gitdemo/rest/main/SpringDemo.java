/**
 * 
 */
package org.pelka.demo.gitdemo.rest.main;

import org.apache.log4j.Logger;
import org.pelka.demo.gitdemo.rest.config.AppConfig;
import org.pelka.demo.gitdemo.rest.service.MyService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * The orchestration for all spring-based commands will occur here
 * 
 * @author arnoldpelka
 *
 */
public class SpringDemo {
	final static Logger logger = Logger.getLogger(SpringDemo.class);

	/**
	 * Main method for orchestrating Spring context-based applications
	 * 
	 * @param args Command line arguments (currently, this application
	 * does not require any)
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(AppConfig.class);
		ctx.scan("org.pelka.demo.gitdemo.rest.config");
	    ctx.refresh();
	    
	    MyService myService = ctx.getBean(MyService.class);
	    myService.doStuff();
	}

}

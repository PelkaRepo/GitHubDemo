package org.pelka.demo.gitdemo.rest.config;

import org.pelka.demo.gitdemo.rest.service.MyService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * The main annotated application configuration context for Spring
 * used by this web service.
 * 
 * @author arnoldpelka
 *
 */
@Configuration
@ComponentScan(basePackages = "org.pelka.demo.gitdemo.rest.config")
public class AppConfig {
	@Bean
    public MyService myService() {
        return new MyService();
    }
}

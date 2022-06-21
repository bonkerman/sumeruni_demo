package com.nortal.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.event.EventListener;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;

@SpringBootApplication
@Log4j2
public class DemoApplication {

	@Autowired
	private ApplicationContext applicationContext;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void doSomethingAfterStartup() {
		log.info("Hello world, I have just started up and will print beans");
		final String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		for (final String beanDefinitionName : beanDefinitionNames) {
			log.info(beanDefinitionName);
		}

	}
}

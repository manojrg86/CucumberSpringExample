package com.automation.core.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.automation.core.framework.AppConfig;

public class Execute {

	public static void main(String[] args) throws Throwable{
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		RunJunit runner = context.getBean(RunJunit.class);
		runner.runCucumberTests();
	}
}

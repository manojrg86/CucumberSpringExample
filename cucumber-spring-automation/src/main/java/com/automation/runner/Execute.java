package com.automation.runner;

import org.junit.runner.JUnitCore;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.automation.framework.AppConfig;

public class Execute {

	public static void main(String[] args) throws Throwable{
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		RunJunit runner = context.getBean(RunJunit.class);
        runner.runTests();
		//new RunJunit().runTests();
		//JUnitCore junitCore = new JUnitCore(); 
		//junitCore.run(RunTests.class);
	}
}

package com.automation.core.runner;

import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.springframework.stereotype.Component;


@Component
public class RunJunit {

	public void runCucumberTests() {
		JUnitCore junitCore = new JUnitCore(); 
		//junitCore.addListener(new TextListener(System.out)); 
		junitCore.run(CucumberTests.class);
	}
}

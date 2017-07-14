package com.automation.core.runner;

import org.junit.runner.JUnitCore;

public class Runner {
	public void run(){
		JUnitCore jUnitCore=new JUnitCore();
		jUnitCore.run(CucumberConfig.class);
	}
}

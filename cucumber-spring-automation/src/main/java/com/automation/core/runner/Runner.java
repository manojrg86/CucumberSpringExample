package com.automation.core.runner;

import org.junit.runner.JUnitCore;

public class Runner {
	public static void main(String args[]){
		JUnitCore jUnitCore=new JUnitCore();
		jUnitCore.run(CucumberConfig.class);
	}
}

package com.project.steps;

import org.springframework.beans.factory.annotation.Autowired;

import com.automation.commonutils.ScenarioContext;
import com.automation.framework.Stepdefs;

import cucumber.api.java.en.Then;

@Stepdefs
public class RandomStep {

	@Autowired
	ScenarioContext scenarioContext;
	
	@Then("I create the shipment")
	public void createShipment(){
		System.out.println("I create the shipment");
		System.out.println("RandomStep-scenarioContexts********:"+scenarioContext.toString());
		scenarioContext.context.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));
	}
}

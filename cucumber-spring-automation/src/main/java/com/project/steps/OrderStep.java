package com.project.steps;


import org.springframework.beans.factory.annotation.Autowired;

import com.automation.core.commonutils.ScenarioContext;
import com.automation.core.framework.Stepdefs;
import com.project.manager.SampleManager;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

@Stepdefs
public class OrderStep {
	
	@Autowired
	ScenarioContext scenarioContext;
	
	@Autowired
	SampleManager manager;
	
	@Before
	public void beforeScenario(Scenario scenario){
		System.out.println("before scenario: "+scenario.getName());
		System.out.println("i am object: "+System.identityHashCode(this));
	}

	@Given("I have \"(.*?)\" item available in ship node \"(.*?)\"")
	public void getItemForOrder(String itemType,String shipNodes){
		manager.print();
		System.out.println("OrderStep-manager********:"+manager.toString());
		System.out.println("OrderStep-scenarioContext********:"+scenarioContext.toString());
		
		scenarioContext.put(shipNodes, shipNodes);
	}

	@Then("I place the order with (\\d+) shipping")
	public void placeOrder(long shippingMethod){
		System.out.println("I place the order with \"(.*?)\" shipping");
		try {
			Thread.sleep(shippingMethod);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("I schedule the order")
	public void scheduleOrder(){
		System.out.println("I schedule the order");
	}

	@Then("I release the order")
	public void releaseOrder(){
		System.out.println("I release the order");
	}

	

}

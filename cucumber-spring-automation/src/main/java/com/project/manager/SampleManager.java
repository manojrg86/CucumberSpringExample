package com.project.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;

import com.automation.commonutils.HttpService;
import com.automation.framework.AppConfig;
import com.automation.framework.Stepdefs;

@Service
public class SampleManager {

	@Autowired
	HttpService httpService;
	
	public void print(){
		httpService.print();
		System.out.println("httpService********:"+httpService.toString());
	}
}

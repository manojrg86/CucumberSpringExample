package com.project.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.automation.core.commonutils.HttpService;

@Service
public class SampleManager {

	@Autowired
	HttpService httpService;
	
	public void print(){
		httpService.print();
		System.out.println("httpService********:"+httpService.toString());
	}
}

package com.automation.core.framework;

import java.io.IOException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.automation.core.runner.RunJunit;

@Configuration
@PropertySources({@PropertySource(value = "${runProperties}", ignoreResourceNotFound=true)})
@ComponentScan(
		basePackageClasses = {},//Stepdefs.class},
		basePackages = {"com.automation.core.commonutils","${packages}"})
public class AppConfig {

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() throws IOException {
		PropertySourcesPlaceholderConfigurer properties = new PropertySourcesPlaceholderConfigurer();
		properties.setIgnoreUnresolvablePlaceholders(true);
		return properties;
	}
	
	@Bean
	public RunJunit runJunit(){
		return new RunJunit();
	}
	
}

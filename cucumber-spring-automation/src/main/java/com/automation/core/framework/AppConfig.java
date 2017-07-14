package com.automation.core.framework;

import java.io.IOException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySources({@PropertySource(value = "${runProperties}", ignoreResourceNotFound=true)})
@ComponentScan(
		basePackages = {"com.automation.core.commonutils","${servicePackages}"})
public class AppConfig {

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() throws IOException {
		PropertySourcesPlaceholderConfigurer properties = new PropertySourcesPlaceholderConfigurer();
		properties.setIgnoreUnresolvablePlaceholders(true);
		return properties;
	}
	
}

package com.tests;

import org.junit.runner.RunWith;

import com.automation.core.reports.Reports;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/main/resources",
		plugin = {Reports.ALLURE,Reports.CUCUMBER_HTML,Reports.CUCUMBER_JSON})
public class CucumberTest {
}
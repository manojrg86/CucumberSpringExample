package com.automation.core.framework;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Scope;

/*
 * Adds the scope for cucumber scenario
 * Usage @ScenarioScope
 */
@Scope("cucumber-glue")
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ScenarioScope {

}

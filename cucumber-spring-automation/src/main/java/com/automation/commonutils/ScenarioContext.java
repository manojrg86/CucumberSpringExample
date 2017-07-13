package com.automation.commonutils;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
public class ScenarioContext {
	
    public Map<String, Object> context = new HashMap<String, Object>();

    public Object get(String key) {
        return context.get(key);
    }

    public <T> T get(String key, Class<T> clazz) {
        Object value = context.get(key);

        if (clazz.isInstance(value)) {
            return clazz.cast(value);
        }

        throw new IllegalStateException("Expected class for '" + value + "' is: " + clazz.getName());
    }

    public void put(String key, Object value) {
        context.put(key, value);
    }

    public boolean containsKey(String key) {
        return context.containsKey(key);
    }
}

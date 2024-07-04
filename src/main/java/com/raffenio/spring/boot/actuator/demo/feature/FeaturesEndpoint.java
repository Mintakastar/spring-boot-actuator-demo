package com.raffenio.spring.boot.actuator.demo.feature;

import org.springframework.boot.actuate.endpoint.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * this class is to enable: http://localhost:9001/actuator/features.
 */
@Component
@Endpoint(id = "features")
public class FeaturesEndpoint {

    private Map<String, Feature> features = new ConcurrentHashMap<>();

    @ReadOperation //GET
    public Map<String, Feature> features() {
        return features;
    }

    @ReadOperation//get
    public Feature feature(@Selector String name) {
        return features.get(name);
    }

    @WriteOperation //POST
    public void configureFeature(@Selector String name, Feature feature) {
        features.put(name, feature);
    }

    @DeleteOperation//Delete
    public void deleteFeature(@Selector String name) {
        features.remove(name);
    }

    public static class Feature {
        private Boolean enabled;

        // [...] getters and setters
    }

}
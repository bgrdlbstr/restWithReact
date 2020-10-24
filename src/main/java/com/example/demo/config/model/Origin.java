package com.example.demo.config.model;


import java.util.List;

public class Origin {
    private String mapping;
    private List<String> origin;
    private List<String> verb;

    public String getMapping() {
        return mapping;
    }

    public void setMapping(String mapping) {
        this.mapping = mapping;
    }

    public List<String> getOrigin() {
        return origin;
    }

    public void setOrigin(List<String> origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Origin{" +
                "mapping='" + mapping + '\'' +
                ", origin=" + origin +
                ", verb=" + verb +
                '}';
    }

    public List<String> getVerb() {
        return verb;
    }

    public void setVerb(List<String> verb) {
        this.verb = verb;
    }
}

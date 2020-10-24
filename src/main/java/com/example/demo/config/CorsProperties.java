package com.example.demo.config;

import com.example.demo.config.model.Origin;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@ConfigurationProperties("cors")
public class CorsProperties {
    private List<Origin> origins = new ArrayList<>();

    public List<Origin> getOrigins() {
        return origins;
    }

    public void setOrigins(List<Origin> origins) {
        this.origins = origins;
    }

    @Override
    public String toString() {
        return "CorsProperties{" +
                "origins=" + origins +
                ", originsSize=" + origins.size() +
                '}';
    }


}

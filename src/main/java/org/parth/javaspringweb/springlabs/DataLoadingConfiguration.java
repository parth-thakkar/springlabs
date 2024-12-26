package org.parth.javaspringweb.springlabs;

import org.parth.javaspringweb.springlabs.services.DataLoadService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class DataLoadingConfiguration {

    @Bean()
    //@DependsOn("PropertyServices")
    public DataLoadService dataLoadService(){
        DataLoadService dl = new DataLoadService();
        return dl;
    }
}

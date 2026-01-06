package com.hariharan.config;

import com.hariharan.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean//(name = {"com2", "desktop1", "Beast"})
    public Desktop desktop(){
        return new Desktop();
    }

}

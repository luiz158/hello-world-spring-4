package demo.config;

import demo.services.HelloWorldService;
import demo.services.HelloWorldServiceEnglishImpl;
import demo.services.HelloWorldServiceSpanishImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by Bheesma on 4/20/2017.
 */
@Configuration
public class HelloWorldConfig {

    @Bean
    @Profile({"English","default"})
    public HelloWorldService helloWorldServiceEnglish(){
        return new HelloWorldServiceEnglishImpl();
    }
    @Bean
    @Profile("Spanish")
    public HelloWorldService helloWorldServiceSpanish(){
        return new HelloWorldServiceSpanishImpl();
    }
}

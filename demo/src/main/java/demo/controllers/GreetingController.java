package demo.controllers;

import demo.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by Bheesma on 4/16/2017.
 */
@Controller
public class GreetingController {
    private HelloWorldService helloWorldService;
    private HelloWorldService helloWorldServiceTamil;
    @Autowired
    @Qualifier("spanishHello")
    public void setHelloWorldServiceSpanish(HelloWorldService helloWorldServiceSpanish) {
        this.helloWorldServiceSpanish = helloWorldServiceSpanish;
    }

    private HelloWorldService helloWorldServiceSpanish;
    @Autowired
    @Qualifier("helloWorldServiceTamil")
    public void setHelloWorldServiceTamil(HelloWorldService helloWorldServiceTamil) {
        this.helloWorldServiceTamil = helloWorldServiceTamil;
    }

    @Autowired
    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }


    public String sayHello(){
        System.out.println("Bean methodname injection status : "+helloWorldServiceTamil.getGreeting());
        System.out.println("Bean name injections status :"+helloWorldServiceSpanish.getGreeting());
        return helloWorldService.getGreeting();

    }
}

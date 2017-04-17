package demo.controllers;

import demo.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by Bheesma on 4/16/2017.
 */
@Controller
public class GreetingController {
    private HelloWorldService helloWorldService;
    @Autowired
    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public String sayHello(){
        return helloWorldService.getGreeting();
    }
}

package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Bheesma on 4/16/2017.
 */
public class InjectedByConstructor {
    HelloWorldService helloWorldService;
    @Autowired
    public InjectedByConstructor(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public void sayHello(){
        helloWorldService.sayHello();
    }
}

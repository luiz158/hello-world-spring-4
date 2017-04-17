package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Bheesma on 4/16/2017.
 */
@Component
public class SetterBasedService {
    HelloWorldService helloWorldService;
    @Autowired
    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }
    public void sayHello(){
        helloWorldService.sayHello();
    }
}

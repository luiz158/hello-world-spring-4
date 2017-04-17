package demo;

import jdk.nashorn.internal.objects.annotations.Setter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Set;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
        HelloWorldServiceImpl helloWorld = (HelloWorldServiceImpl) ctx.getBean("helloWorldServiceImpl");
        helloWorld.sayHello();
        InjectedByConstructor injectedByConstructor =(InjectedByConstructor)ctx.getBean("injectedByConstructor");
        injectedByConstructor.sayHello();
        SetterBasedService setterBasedService = (SetterBasedService)ctx.getBean("setterBasedService");
        setterBasedService.sayHello();
    }
}

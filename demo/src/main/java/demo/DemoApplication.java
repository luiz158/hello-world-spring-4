package demo;

import demo.controllers.GreetingController;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Set;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
        GreetingController greetingController = (GreetingController)ctx.getBean("greetingController");
        System.out.println(greetingController.sayHello());
    }
}

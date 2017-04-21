package demo.services;

/**
 * Created by Bheesma on 4/20/2017.
 */
public class HelloWorldFactory {

    public HelloWorldService createHelloWorldService(String language){
        HelloWorldService service = null;
        switch (language){
            case "English":
                service = new HelloWorldServiceEnglishImpl();
                break;
            case "Spanish":
                service = new HelloWorldServiceSpanishImpl();
                break;
            case "Tamil":
                service = new HelloWorldServiceTamilImpl();
                break;
            case "Hindi":
                service = new HelloWorldServiceHindiImpl();
                break;
            default: new HelloWorldServiceEnglishImpl();
        }
        return service;
    }
}

package demo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Bheesma on 4/20/2017.
 */

public class HelloWorldServiceHindiImpl implements HelloWorldService {
    @Override
    public String getGreeting() {
        return "Namashkaar Dhuniyaa!";
    }
}

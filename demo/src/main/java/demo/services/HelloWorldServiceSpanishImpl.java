package demo.services;

import com.sun.xml.internal.ws.developer.Serialization;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Bheesma on 4/16/2017.
 */
@Service
@Profile("Spanish")
public class HelloWorldServiceSpanishImpl implements HelloWorldService {
    @Override
    public String getGreeting() {
        return "Hola Mundo!!";
    }
}

package cm.spring.noxml;

import org.springframework.stereotype.Component;

@Component
public class Football implements Sport {
    public void name() {
        System.out.println("I'm Football");
    }
}

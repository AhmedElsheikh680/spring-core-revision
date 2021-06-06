package cm.spring.noxml;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class SportImpl implements Sport {
    public void name() {
        System.out.println("I'm Sport");
    }
}

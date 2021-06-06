package cm.spring.lifecycle;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Admin implements Person{
    public void name() {
        System.out.println("I'm Admin");
    }
}

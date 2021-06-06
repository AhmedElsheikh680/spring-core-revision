package cm.spring.annotation;

import org.springframework.stereotype.Component;

@Component
public class User implements Company{
    public void test() {
        System.out.println("I'm User");
    }
}

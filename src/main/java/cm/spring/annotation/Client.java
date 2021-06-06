package cm.spring.annotation;

import org.springframework.stereotype.Component;

@Component
public class Client implements Company{
    public void test() {
        System.out.println("I'm Client");
    }
}

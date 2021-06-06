package cm.spring.annotation;

import org.springframework.stereotype.Component;

@Component
public class Student implements Company{
    public void test() {
        System.out.println("I'm Student");
    }
}

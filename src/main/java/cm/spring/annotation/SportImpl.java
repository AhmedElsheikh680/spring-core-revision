package cm.spring.annotation;

import org.springframework.stereotype.Component;

@Component
public class SportImpl implements Sport{
    public void mySport() {

        System.out.println("Sporting Is Very Good");
    }
}

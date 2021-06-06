package cm.spring.annotation;


import org.springframework.stereotype.Component;

@Component("master")
public class MasterImpl implements Master{
    public void start() {
        System.out.println("I'm Maaster");
    }
}

package cm.spring.lifecycle;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
public class Admin implements Person{

    @PostConstruct
    public void initMethod(){
        System.out.println("Connected To DB");
    }

    public void name() {
        System.out.println("I'm Admin");
    }

    @PreDestroy
    public void destroyMethod(){
        System.out.println("Not Connected To DB");
    }
}

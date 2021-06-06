package cm.spring.annotation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("master")
public class MasterImpl implements Master{

    private Sport sport;

    @Autowired
    public MasterImpl(Sport sport) {
        this.sport = sport;
    }

    public void start() {
        System.out.println("I'm Maaster");
    }

    public void callMySport() {
        this.sport.mySport();
    }
}

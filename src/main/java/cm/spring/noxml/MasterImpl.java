package cm.spring.noxml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class MasterImpl implements Master {

//    @Autowired
//    @Qualifier("football")
    private Sport sport;

    public MasterImpl(Sport sport) {
        this.sport = sport;
    }
    //    @Autowired
//    public MasterImpl(Sport sport) {
//        this.sport = sport;
//    }

    public void name() {
        System.out.println("I'm Master");
    }

    public void callMySport() {
        sport.name();
    }
}

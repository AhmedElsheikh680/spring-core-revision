package cm.spring.annotation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("master")
public class MasterImpl implements Master{

//    @Autowired
//    private Sport sport;


    @Autowired
    @Qualifier("user")
    private Company company;

//   @Autowired
//
//    public void setCompany(Company company) {
//        this.company = company;
//    }
    //    @Autowired
////    public MasterImpl(Sport sport) {
////        this.sport = sport;
////    }

//    @Autowired
//    public void setSport(Sport sport) {
//        this.sport = sport;
//    }

    public void start() {
        System.out.println("I'm Maaster");
    }

    public void name() {
        company.test();
    }

    public void callMySport() {
//        this.sport.mySport();
    }
}

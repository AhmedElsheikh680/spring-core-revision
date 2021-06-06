package cm.spring.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
        Master master = appCon.getBean("master", Master.class);
        master.callMySport();

//        ClassPathXmlApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Sport sport = appCon.getBean("sportImpl", Sport.class);
//        sport.mySport();
        appCon.close();
    }
}

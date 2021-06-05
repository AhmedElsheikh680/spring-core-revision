package cm.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
        Sport football = appCon.getBean("mySport", Sport.class);
        football.start();

//        Sport sport = new Volleyball();
//        sport.start();

//        Football football  = new Football();
//        football.start();
//
//        Basketball basketball = new Basketball();
//        basketball.start();
    }
}

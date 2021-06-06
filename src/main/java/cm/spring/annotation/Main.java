package cm.spring.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
        Master master = appCon.getBean("master", Master.class);
        master.start();
    }
}

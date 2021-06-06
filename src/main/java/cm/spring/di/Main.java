package cm.spring.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person  person = appCon.getBean("myPerson", Person.class);
        person.start();

        appCon.close();
    }
}

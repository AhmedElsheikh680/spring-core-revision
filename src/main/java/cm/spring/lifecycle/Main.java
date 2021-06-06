package cm.spring.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person admin = appCon.getBean("admin", Person.class);
        admin.name();

        Person admin2 = appCon.getBean("admin", Person.class);
        admin2.name();
        System.out.println(admin);
        System.out.println(admin2);
        System.out.println(admin == admin2);
        appCon.close();
    }
}

package cm.spring.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

//        ClassPathXmlApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Person  person = appCon.getBean("myPerson", Person.class);
//        person.start();

        ClassPathXmlApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = appCon.getBean("myUser", User.class);
//        User user2 = appCon.getBean("myUser", User.class);
//        System.out.println(user);
//        System.out.println(user2);
//        System.out.println(user == user2);
        System.out.println(user.getEmail());
        System.out.println(user.getTeam());


        appCon.close();
    }
}

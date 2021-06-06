package cm.spring.noxml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext appCon = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Master master = appCon.getBean("masterImpl", Master.class);
        master.name();
        master.callMySport();
    }
}

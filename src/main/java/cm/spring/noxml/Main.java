package cm.spring.noxml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext appCon = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Manger manger = appCon.getBean("manger", Manger.class);
        System.out.println(manger.getEmail());
        System.out.println(manger.getTeam());
//        Master master = appCon.getBean("myMaster", Master.class);
//        master.name();
//        master.callMySport();

        appCon.close();
    }
}

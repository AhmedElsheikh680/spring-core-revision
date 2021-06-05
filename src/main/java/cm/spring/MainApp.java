package cm.spring;

public class MainApp {
    public static void main(String[] args) {

        Football football  = new Football();
        football.start();

        Basketball basketball = new Basketball();
        basketball.start();
    }
}

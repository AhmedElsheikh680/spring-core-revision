package cm.spring.di;

public class UserImpl implements User {

    private Person person;

//    public UserImpl( Person person){
//        this.person = person;
//    }

    public void start() {
        System.out.println(" I'm User");
    }

    public void setPerson(Person person){
        this.person = person;
    }

    public void getPerson(){
        this.person.start();
    }
}

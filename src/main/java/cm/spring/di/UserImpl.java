package cm.spring.di;

public class UserImpl implements User {

    private Person person;
    private String email;
    private String team;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
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

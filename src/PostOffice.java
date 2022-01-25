import java.util.ArrayList;
import java.util.List;

public class PostOffice implements Subject {

    private ArrayList<Mail> allMail;
    private ArrayList<Observer> observers;

    public PostOffice(){
        this.allMail = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    public void addMail(Mail mail){
        System.out.println("Add e-mail on PostOffice");
        this.allMail.add(mail);
        notifySub();
    }

    public List<Mail> getState(){
        return this.allMail;
    }

    @Override
    public void attach(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void dettach(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void notifySub() {
        System.out.println("Notify all observers");
        for (Observer o: observers){
            o.update(this);
        }
    }
}

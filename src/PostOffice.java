import java.util.ArrayList;

public class PostOffice implements Subject {

    private ArrayList<Mail> allMail;
    private ArrayList<Observer> observers;

    public PostOffice(){
        this.allMail = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    public void addMail(Mail mail){
        this.allMail.add(mail);
        notifySub();
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
        for (Observer o: observers){
            o.update(this);
        }
    }
}

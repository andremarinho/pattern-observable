public interface Subject {
    void attach(Observer o);
    void dettach(Observer o);
    void notifySub();
}

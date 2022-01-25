public class Main {

    public static void main(String[] args) {
       PostOffice postOffice = new PostOffice();
       Person chris = new Person("Chris");
       Person john = new Person("Jonh");
       postOffice.attach(chris);
       postOffice.attach(john);
       Mail mail = new Mail("Jonh", "Hello", "only say goodbye!");
       postOffice.addMail(mail);
    }
}

import java.util.ArrayList;
import java.util.List;

public class Person implements Observer {
    private String nome;

    public Person(String nome){
        this.nome = nome;
    }

    public void checkMail(List<Mail> listMail){
        for (Mail mail: listMail){
            if (nome.compareTo(mail.receiverName()) == 0){
                System.out.println(nome+ ": "+mail.content());
            }
        }
    }

    @Override
    public void update(Object obj) {
        if (obj instanceof PostOffice ){
           PostOffice pos = (PostOffice) obj;
           checkMail(pos.getState());
        }
    }
}

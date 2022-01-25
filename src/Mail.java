public class Mail {
    private String name;
    private String subject;
    private String content;

    public Mail(String name, String subject, String content){
        this.name = name;
        this.content = content;
    }

    public String receiverName(){
        return this.name;
    }

    public String content(){
        return this.content;
    }
}

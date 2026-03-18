public class Editor {

    private String content ="";

    public void write(String text){
        this.content += text;
    }

    public String getContent(){
        return content;
    }

    public Snap save(){
        return new Snap(content);
    }

    public void restore(Snap s){
        this.content = s.getContent();
    }
}

package Memento_Design;

public class Snap {

    private final String content;

    Snap(String content){
        this.content = content;
    }

    public String getContent(){
        return content;
    }
}

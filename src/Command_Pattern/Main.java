package Command_Pattern;

public class Main {

    void main(){
TextEditor edit = new TextEditor();

Button button = new Button(new Red(edit));
button.click();

Button bold = new Button(new Bold(edit));
bold.click();
    }
}

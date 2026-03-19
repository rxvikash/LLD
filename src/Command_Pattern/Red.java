package Command_Pattern;

public class Red implements Command{


    TextEditor edit;

    Red(TextEditor edit){
        this.edit = edit;
    }

    @Override
    public void execute() {
        edit.red();
    }
}

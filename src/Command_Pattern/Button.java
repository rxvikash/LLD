package Command_Pattern;

public class Button {

    Command cmd;

    Button(Command cmd){
        this.cmd = cmd;
    }


    public void click(){
        cmd.execute();
    }
}

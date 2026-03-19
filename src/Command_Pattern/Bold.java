package Command_Pattern;

public class Bold implements Command{

   TextEditor edit;

   Bold(TextEditor edit){
       this.edit = edit;
   }

    @Override
    public void execute() {
   edit.bold();
    }
}

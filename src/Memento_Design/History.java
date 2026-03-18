package Memento_Design;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {

    Deque<Snap> undo = new ArrayDeque<>();
    Deque<Snap> redo = new ArrayDeque<>();

    public void save(Editor txt){
        undo.push(txt.save());
        redo.clear();
    }

    public void undo(Editor txt){
        if(undo.size()>1){
            Snap s = undo.pop();
            redo.push(s);
            txt.restore(undo.peek());
        }

    }


    public void redo(Editor txt){
        if(!redo.isEmpty()){
            Snap s = redo.pop();
            undo.push(s);
            txt.restore(s);
        }
    }
}

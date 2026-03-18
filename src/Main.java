//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Editor txt = new Editor();
    History his = new History();

    txt.write("Hello");
    his.save(txt);

    txt.write("World");
    his.save(txt);

    System.out.println(txt.getContent());

    his.undo(txt);

    System.out.println(txt.getContent());

    his.redo(txt);
    System.out.println(txt.getContent());
}


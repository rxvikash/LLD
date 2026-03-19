package Observer;

public interface Subject {

    void attach(Observer os);

    void detach(Observer os);

    void notifytemp();



}

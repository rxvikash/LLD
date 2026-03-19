package Observer;

public class Tab implements Observer{

    @Override
    public void update(float temp) {
        System.out.println("Current temp is" + temp);
    }
}

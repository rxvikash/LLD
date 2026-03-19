package Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {

    private float temp;

    private List<Observer> device;

    WeatherStation(){
        device = new ArrayList<>();
    }

    public void temp(float temp){
        this.temp = temp;
    }


    @Override
    public void attach(Observer os) {
       device.add(os);
    }

    @Override
    public void detach(Observer os) {
    device.remove(os);
    }

    @Override
    public void notifytemp() {

        for(Observer os : device ){
            os.update(temp);
        }

    }
}

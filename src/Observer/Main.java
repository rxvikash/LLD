package Observer;

public class Main {

    void main(){

        WeatherStation ws = new WeatherStation();

       Mobile mm = new Mobile();
       Tab tab = new Tab();

   ws.attach(mm);
   ws.attach(tab);
ws.temp(23);
ws.notifytemp();
ws.detach(tab);
ws.notifytemp();
        }

    }


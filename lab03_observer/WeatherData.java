import java.util.ArrayList;

public class WeatherData implements WeatherSubject{
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList<>();
    }
    
    @Override
    public void registerObserver(WeatherObserver o) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void removeObserver(WeatherObserver o) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void notifyObservers() {
        // TODO Auto-generated method stub
        
    }
    public void measurementsChanged(){
        notifyObservers();
    }
    
}

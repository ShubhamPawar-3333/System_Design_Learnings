package WithObserverPattern.Subject;
import java.util.ArrayList;
import java.util.List;

import WithObserverPattern.Observer.Observer;

public class WeatherStation implements Subject{
    private List<Observer> observers = new ArrayList<>();
    private String weather;

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(){
        for(Observer observer: observers){
            observer.updateWeather(weather);
        }
    }

    public void setWeather(String weather){
        this.weather = weather;
        notifyObservers(); // Ensures observers get updates immediately
    }

    public String getWeather(){
        return weather;
    }
}
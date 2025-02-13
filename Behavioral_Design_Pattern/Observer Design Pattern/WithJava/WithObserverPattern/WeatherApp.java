package WithObserverPattern;

import WithObserverPattern.Observer.PhoneDisplay;
import WithObserverPattern.Observer.TVDisplay;
import WithObserverPattern.Subject.WeatherStation;

public class WeatherApp {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        TVDisplay tvDisplay = new TVDisplay();
        PhoneDisplay phoneDisplay = new PhoneDisplay();

        weatherStation.addObserver(phoneDisplay);
        weatherStation.addObserver(tvDisplay);

        weatherStation.setWeather("Holocast");
        
    }
}

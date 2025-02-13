package WithoutObserverPattern;

public class WeatherApp {
    public static void main(String[] args) {
        PhoneDisplay phoneDisplay = new PhoneDisplay();
        TVDisplay tvDisplay = new TVDisplay();
        WeatherStation weatherStation = new WeatherStation(phoneDisplay, tvDisplay);
        
        weatherStation.setWeather("Sunny");
    }
}
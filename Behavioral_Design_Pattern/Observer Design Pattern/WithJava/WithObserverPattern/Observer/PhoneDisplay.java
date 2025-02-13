package WithObserverPattern.Observer;

public class PhoneDisplay implements Observer{
    private String weather;

    //Set Weather
    public void updateWeather(String weather){
        this.weather = weather;
        display();
    }

    // Get weather
    public String getWeather(){
        return weather;
    }

    public void display(){
        System.out.println("Phone Display: Today's weather is " + weather);
    }
}

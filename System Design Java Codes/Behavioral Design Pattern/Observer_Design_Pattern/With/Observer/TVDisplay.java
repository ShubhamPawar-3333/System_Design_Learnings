package WithObserverPattern.Observer;

public class TVDisplay implements Observer {
    private String weather;

    //Setter method
    public void updateWeather(String weather){
        this.weather = weather;
        display();
    }

    //Getter Method
    public String getWeather(){
        return weather;
    }

    public void display(){
        System.out.println("TV Display: Today's weather is " + weather);
    }

}

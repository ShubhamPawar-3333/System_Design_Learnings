package WithoutObserverPattern;

class WeatherStation {
    public String weather;
    private PhoneDisplay phoneDisplay;
    private TVDisplay tvDisplay;

    public WeatherStation(PhoneDisplay phoneDisplay, TVDisplay tvDisplay) {
        this.phoneDisplay = phoneDisplay;
        this.tvDisplay = tvDisplay;
    }

    public void setWeather(String newWeather) {
        this.weather = newWeather;
        phoneDisplay.update(newWeather);
        tvDisplay.update(newWeather);
    }
}

from Observer.PhoneDisplay import PhoneDisplay
from Observer.TVDisplay import TVDisplay
from Subject.WeatherStation import WeatherStation

def main():
    weatherStation1 = WeatherStation()
    
    ws1Devices = [PhoneDisplay(), TVDisplay()]
    
    for device in ws1Devices:
        weatherStation1.addObserver(device)
    
    weatherStation1.setWeather("Holocasty")

if __name__ == "__main__":
    main()
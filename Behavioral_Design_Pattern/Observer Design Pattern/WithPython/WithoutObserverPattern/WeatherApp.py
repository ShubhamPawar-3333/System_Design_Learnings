from WeatherStation import WeatherStation
from PhoneDisplay import PhoneDisplay
from TVDisplay import TVDisplay

if __name__ == "__main__":
    phoneDisplay = PhoneDisplay()
    tvDisplay = TVDisplay()
    
    weatherStation = WeatherStation(phoneDisplay, tvDisplay)
    
    weatherStation.setWeather("Holocasty")
    
    
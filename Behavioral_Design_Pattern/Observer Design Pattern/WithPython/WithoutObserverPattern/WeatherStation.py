
import PhoneDisplay
import TVDisplay

class WeatherStation:   
    def __init__(self, phoneDisplay, tvDisplay):
        self.phoneDisplay = phoneDisplay
        self.tvDisplay = tvDisplay
        
    def setWeather(self, weather):
        self.phoneDisplay.update(weather)
        self.tvDisplay.update(weather)
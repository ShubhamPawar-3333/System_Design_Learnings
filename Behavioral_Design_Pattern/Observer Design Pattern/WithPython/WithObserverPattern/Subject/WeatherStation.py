from Observer.Observer import Observer
from Subject.Subject import Subject

class WeatherStation(Subject):
    def __init__(self):
        super().__init__()
    
    def setWeather(self, weather):  # ✅ Method to update weather
        self.weather = weather  # ✅ This will trigger the setter and notify observers
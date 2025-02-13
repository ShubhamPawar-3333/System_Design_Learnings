from abc import ABC, abstractmethod

class Observer(ABC):
    def __init__(self):
        self._weather = None
        
    @property
    def weather(self):
        return self._weather
    
    @weather.setter   
    def weather(self, weather):
        if not weather:
            raise ValueError("No Value Found")
        self._weather = weather
    
    def update(self, weather):
        self.weather = weather
        self.display() # Calls the specific display method of each subclass
    
    @abstractmethod
    def display(self):
        pass
    
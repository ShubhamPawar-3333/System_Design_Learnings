from abc import ABC, abstractmethod
from Observer import Observer

class Subject(ABC):
    def __init__(self):
        self._weather = None
        self.observers = []

    def addObserver(self, observer):
        self.observers.append(observer)
    
    def removeObserver(self, observer):
        self.observers.remove(observer)
    
    # Weather Getter
    @property
    def weather(self):
        return self._weather

    # Weather Setter
    @weather.setter
    def weather(self, weather):
        self._weather = weather
        self.notifyObservers()
        
    def notifyObservers(self):
        for observer in self.observers:
            observer.update(self._weather)
    
    
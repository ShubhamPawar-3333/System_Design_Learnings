from Observer.Observer import Observer

class TVDisplay(Observer):
    def __init__(self):
        super().__init__() # Initialize base class attributes
    
    def display(self):
        print(f"TV's Display: Today's Weather is {self.weather}")
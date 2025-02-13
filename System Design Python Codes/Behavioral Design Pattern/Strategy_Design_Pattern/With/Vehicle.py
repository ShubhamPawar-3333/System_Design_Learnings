import Strategy.DriveStrategy as DriveStrategy

class Vehicle:
    def __init__(self, driveObj:DriveStrategy):
        self.driveObj = driveObj
        
    def drive(self):
        self.driveObj.drive()
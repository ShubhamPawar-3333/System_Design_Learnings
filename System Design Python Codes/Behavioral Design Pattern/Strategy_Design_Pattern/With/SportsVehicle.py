from Strategy.SportsDriveStrategy import SportsDriveStrategy
from Vehicle import Vehicle

class SportsVehicle(Vehicle):
    def __init__(self):
        super().__init__(SportsDriveStrategy())
from Strategy.NormalDriveStrategy import NormalDriveStrategy
from Vehicle import Vehicle


class PassengerVehicle(Vehicle):
    def __init__(self):
        super().__init__(NormalDriveStrategy())
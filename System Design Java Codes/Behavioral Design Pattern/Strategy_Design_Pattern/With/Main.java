package WithStrategyPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new PassengerVehicle();
        car.drive();

        Vehicle mahindraThar = new OffRoadVehicle();
        mahindraThar.drive();
    }
}
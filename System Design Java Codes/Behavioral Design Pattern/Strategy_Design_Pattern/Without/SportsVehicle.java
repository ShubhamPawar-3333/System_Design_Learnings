package WithoutStrategyPattern;

public class SportsVehicle extends Vehicle {
    @Override
    public void drive(){
        //Different drive logic
        System.out.println("Sports Drive Capability");
    }
}
import java.util.concurrent.CancellationException;

public class Car extends Vehicle {
    public static void main(String[] args) {

        Car car = new Car();
        car.setColor("red");
        car.setNumberOfPassengers(2);
        car.setCargoCapacity(0);
        car.setFuelCapacity(2);
        System.out.println("You have a " +car.getColor()+"car " + car.getNumberOfPassengers() + car.getCargoCapacity() + car.getFuelCapacity());
}

}

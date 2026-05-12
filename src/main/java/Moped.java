public class Moped extends Vehicle {
    public static void main(String[] args) {
        Moped moped = new Moped();
        moped.setColor("red");
        moped.setNumberOfPassengers(2);
        moped.setCargoCapacity(0);
        moped.setFuelCapacity(2);
        System.out.println("You have a " +moped.getColor()+"Moped " + moped.getNumberOfPassengers() + moped.getCargoCapacity() + moped.getFuelCapacity());
    }


}

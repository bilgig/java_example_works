package inheritance_homework02;

public class Truck extends Vehicle{
    double cargoCapacity;
    public Truck(String brand, String model, int year, double cargoCapacity) {
        super(brand, model, year);
        this.cargoCapacity=cargoCapacity;
    }

    @Override
    void start() {
        System.out.println("Truck is starting");
    }

    @Override
    void stop() {
        System.out.println("Truck is stopping");
    }
}

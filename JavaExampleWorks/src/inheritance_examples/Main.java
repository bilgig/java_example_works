package inheritance_examples;

public class Main {
    public static void main(String[] args) {
        Car car=new Car("Reanult","Megane",12,4);
        Motorcycle motorcycle=new Motorcycle("Honda","civic",6,true);
        Truck truck=new Truck("BMW","C4",2,30);
        car.start();
        car.stop();
        car.numDoors=5;
        System.out.println("Car numDoors: "+car.numDoors);
        motorcycle.start();
        motorcycle.stop();
        motorcycle.hasSidecar=false;
        System.out.println("Motorcycle numDoors: "+motorcycle.hasSidecar);

        truck.start();
        truck.stop();
        truck.cargoCapacity=40;
        System.out.println("Truck numDoors: "+truck.cargoCapacity);

    }

}

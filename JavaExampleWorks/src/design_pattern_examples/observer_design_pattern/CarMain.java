package design_pattern_examples.observer_design_pattern;

public class CarMain {
    public static void main(String[] args) {
        Customer customer1=new Customer();
        customer1.setCustomerName("Bilgi");

        Customer customer2=new Customer();
        customer1.setCustomerName("Fatih");

        Car car=new Car();
        car.setCarBrand("Mercedes");
        car.setCarModel("EQC");
        car.setCarColor("Grey");
        car.setCarAge(0);
        car.setAvailable(false);
        car.registerObserver(customer1);
        car.registerObserver(customer2);
        car.setAvailable(true);
        car.setAvailable(false);
        car.removeObserver(customer1);
        car.setAvailable(true);


    }

}

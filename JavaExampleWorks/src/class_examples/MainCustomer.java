package class_examples;

public class MainCustomer {
    public static void main(String[] args) {
        MainCustomer mainCustomer=new MainCustomer();
        double harcanan=2000;
        Customer customer1=new Customer();
        customer1.bakiye=5000;
        customer1.isPremium=true;
        mainCustomer.buyMachine(customer1,harcanan);
        Customer customer2=new Customer();
        customer2.bakiye=3000;
        customer2.isPremium=true;
        mainCustomer.buyMachine(customer2,harcanan);

    }
    public void buyMachine(Customer customer, double harcanan) {
        //MainCustomer mainCustomer=new MainCustomer();

        if (customer.bakiye < harcanan) {
            System.out.println("harcanan bakiyenizden fazladır.");
        } else {

            if (customer.isPremium) {
                customer.bakiye = customer.harca(customer.bakiye, harcanan) + (harcanan / 100) * 10;
                System.out.println("Kalan bakiye miktar: " + customer.bakiye);
            } else {
                customer.bakiye = customer.harca(customer.bakiye, harcanan);
                System.out.println("Kalan bakiye miktar: " + customer.bakiye);
            }
        }
    }

}

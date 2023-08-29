package design_pattern_examples.observer_design_pattern;

public class Customer implements Observer{
    private String customerName;
    private Subject subject;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update(String carBrand, String carModel, String carColor, int carAge) {
        System.out.println("Hello"+" "+carBrand+" "+"brand"+" "+carModel+" "+"model"+" "+carColor+" "+"color"+" "+carAge+" "+"age"+" "+"car price has dropped");
    }
}

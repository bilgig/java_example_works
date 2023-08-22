package class_examples.lamb;

public class Lamp {
    boolean isOn;
/*    public void turnOn(){
        isOn=true;
    }
    public void turnOff(){
        isOn=true;
    }*/
    public void changeStatus(){
        isOn=!isOn;
    }
    public void soutLampStatus(){
        System.out.println("Lamba status is: "+isOn);
    }
}

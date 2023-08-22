package class_examples.lamb;

public class Main {
    public static void main(String[] args) {
        Lamp lamObject=new Lamp();
        lamObject.isOn=false;
        lamObject.soutLampStatus();

        //lamObject.turnOn();
        lamObject.changeStatus();
        lamObject.soutLampStatus();
    }
}

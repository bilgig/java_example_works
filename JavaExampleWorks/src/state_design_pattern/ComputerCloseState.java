package state_design_pattern;

public class ComputerCloseState implements ComputerState{
    @Override
    public void onOpen() {
        System.out.println("the computer is off but now it is on");
    }

    @Override
    public void onClose() {
        System.out.println("you are trying to turn off the computer it is already off");

    }

}

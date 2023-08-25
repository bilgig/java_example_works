package design_pattern_examples.state_design_pattern;

public class ComputerOpenState implements ComputerState {

    @Override
    public void onOpen() {
        System.out.println("You are trying to turn on the computer, but the computer is already on");
    }

    @Override
    public void onClose() {
        System.out.println("Computer turns on but turns off.");

    }

}

package design_pattern_examples.state_design_pattern;

public class Main {
    public static void main(String[] args) {
        ComputerContext context=new ComputerContext();
        System.out.println("initial state of the computer: "+ context.getComputerState().getClass().getName());
        System.out.println();
        context.onClose();
        context.onOpen();
        System.out.println("****************************************");
        System.out.println("current state of the computer: "+context.getComputerState().getClass().getName());
        context.onOpen();
        context.onClose();
        System.out.println();
        System.out.println("computer's latest status: "+context.getComputerState().getClass().getName());

    }
}

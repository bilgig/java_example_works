package design_pattern_examples.state_design_pattern;

public class ComputerContext {
    private ComputerState computerState;

    public ComputerContext() {
        setComputerState(new ComputerCloseState());
    }

    public void onOpen(){
        computerState.onOpen();
        if(computerState instanceof ComputerCloseState){
            setComputerState(new ComputerOpenState());
            System.out.println("the internal state of the computer was as follows: "+ computerState.getClass().getName());
        }
    }
    public void onClose(){
        computerState.onClose();
        if (computerState instanceof ComputerOpenState){
            setComputerState((new ComputerCloseState()));
            System.out.println("the internal state of the computer was as follows:"+computerState.getClass().getName());
        }
    }

    public ComputerState getComputerState() {
        return computerState;
    }

    public void setComputerState(ComputerState computerState) {
        this.computerState = computerState;
    }
}

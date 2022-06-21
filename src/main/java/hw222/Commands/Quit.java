package hw222.Commands;

public class Quit implements ICommand {
    @Override
    public Object getName(){
        return getClass().getSimpleName();
    };

    @Override
    public void getCommand() {
        System.exit(-1);
    }
}
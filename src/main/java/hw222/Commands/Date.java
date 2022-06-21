package hw222.Commands;

import java.time.LocalDate;

public class Date implements ICommand {
    @Override
    public Object getName(){
        return getClass().getSimpleName();
    };

    @Override
    public void getCommand() {
        System.out.println(LocalDate.now());
    }
}
package hw222.Commands;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time implements ICommand {
    @Override
    public Object getName(){
       return getClass().getSimpleName();
    };

    @Override
    public void getCommand() {
        System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }
}
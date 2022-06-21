package hw222;

import hw222.Commands.ICommand;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;
import java.util.Set;

public class ShellManager {
    @Autowired
    private Set<ICommand> commands;

    public void run() {

        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print(">");
            String[] cmd = in.nextLine().trim().split(" ");
            for (ICommand command : commands) {
                if (command.getName().equals(cmd[0])) {
                    command.getCommand();
                }
            }
        }
    }
}
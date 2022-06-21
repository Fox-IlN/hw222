package hw222.SpringConfig;

import hw222.ShellManager;
import hw222.Commands.Time;
import hw222.Commands.Date;
import hw222.Commands.Quit;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Time getTime() {
        return new Time();
    }

    @Bean
    public Date getDate() {
        return new Date();
    }

    @Bean
    public Quit getQuit() {
        return new Quit();
    }

    @Bean
    public ShellManager getShellManager() {
        return new ShellManager();
    }
}

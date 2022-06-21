package hw222;

import hw222.SpringConfig.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Startup
{
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(Config.class);
        ShellManager shellManager = appContext.getBean(ShellManager.class);
        shellManager.run();
        appContext.close();
    }
}

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import tool.main.MainFrame;

public class StartToolMain {

    public static void main(String[] args) {
        ApplicationContext context = new GenericXmlApplicationContext("appContext.xml");

        new MainFrame();
    }
}

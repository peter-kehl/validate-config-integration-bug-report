package your.pack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class App {
    public static void main( String args[]) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class);
        /*Conf conf = context.getBean(Conf.class);
        System.out.println("conf is of class " +conf.getClass() );
        System.out.println( "conf value: " +conf.getValue() );
        System.out.println( "another conf value: " +conf.getAnother() );*/
    }
}
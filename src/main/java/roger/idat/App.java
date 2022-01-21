package roger.idat;

import roger.idat.config.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@EnableConfigurationProperties({FileStorageProperties.class})
@SpringBootApplication
public class App {
    public static void main (String[] args){
        SpringApplication.run(App.class, args);
    }
}

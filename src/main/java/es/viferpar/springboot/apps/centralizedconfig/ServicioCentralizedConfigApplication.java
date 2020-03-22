package es.viferpar.springboot.apps.centralizedconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ServicioCentralizedConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServicioCentralizedConfigApplication.class, args);
    }

}

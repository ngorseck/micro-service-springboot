package sn.ias.EureukaServerRegistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EureukaServerRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(EureukaServerRegistryApplication.class, args);
	}

}

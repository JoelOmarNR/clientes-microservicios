package pe.joelneyramos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class KpideclienteMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(KpideclienteMicroserviceApplication.class, args);
	}

}

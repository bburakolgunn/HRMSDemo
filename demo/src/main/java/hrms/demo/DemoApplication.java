package hrms.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.setProperty("org.apache.commons.logging.LogFactory","org.apache.commons.logging.impl.LogFactoryImpl");
		SpringApplication.run(DemoApplication.class, args);
	}

}

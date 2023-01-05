package laposte.SpringTuto;

import org.apache.catalina.connector.Response;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import laposte.SpringTuto.model.Book;
import org.springframework.http.MediaType;


@EnableJpaRepositories("laposte.SpringTuto.repository")
@EntityScan("laposte.SpringTuto.model")
@SpringBootApplication
public class SpringTutoApplication {
	public static void main(String[] args) {

		SpringApplication.run(SpringTutoApplication.class, args);
		System.out.println("Fini");
	}

}

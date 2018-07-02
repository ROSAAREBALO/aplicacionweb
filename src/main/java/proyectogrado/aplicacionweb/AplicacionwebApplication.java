package proyectogrado.aplicacionweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class AplicacionwebApplication {
	@RequestMapping("/")
	String home(){
		return "hello worldddd";

	}

	public static void main(String[] args) {
		SpringApplication.run(AplicacionwebApplication.class, args);
	}
}

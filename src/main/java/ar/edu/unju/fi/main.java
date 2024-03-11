package ar.edu.unju.fi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "paquete.de.tus.repositorios")
public class TuClasePrincipal {
    public static void main(String[] args) {
        SpringApplication.run(TuClasePrincipal.class, args);
    }
}

public class main {

	public main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

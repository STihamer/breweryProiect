package guru.sfg.beer.order.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({"guru.sfg.beer.order.service.web.mappers"})
@EntityScan("guru.sfg")
@EnableJpaRepositories("guru.sfg.beer.order.service.repositories")
@SpringBootApplication
public class BeerOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeerOrderServiceApplication.class, args);
	}

}

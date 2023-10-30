package br.com.system.food;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@ComponentScan
@SpringBootApplication
@EnableTransactionManagement
@EnableJpaRepositories
@EntityScan(basePackages = {"br.com.system.food.domain"})
@OpenAPIDefinition(info = @Info(title = "Food System API", version = "0.0.1", description = "Food Syastem API"))
public class FoodSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodSystemApplication.class, args);
	}


}

package br.edu.infnet.playerrank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PlayerrankApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlayerrankApplication.class, args);
	}

}

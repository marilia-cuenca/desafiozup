package br.com.desafiozup.CadastroDeCarros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class CadastroDeCarrosApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadastroDeCarrosApplication.class, args);
	}

}

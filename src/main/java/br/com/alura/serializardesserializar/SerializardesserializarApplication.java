package br.com.alura.serializardesserializar;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SerializardesserializarApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SerializardesserializarApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("teste");
	}
}

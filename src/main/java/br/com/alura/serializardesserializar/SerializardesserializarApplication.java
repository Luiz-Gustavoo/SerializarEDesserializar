package br.com.alura.serializardesserializar;

import br.com.alura.serializardesserializar.services.Contador;
import br.com.alura.serializardesserializar.services.LerNumero;
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
		LerNumero lerNumero = new LerNumero();
		int numeroDigitado = lerNumero.lerNumero();

		Contador contarNumero = new Contador();
		contarNumero.contador(numeroDigitado);
	}
}

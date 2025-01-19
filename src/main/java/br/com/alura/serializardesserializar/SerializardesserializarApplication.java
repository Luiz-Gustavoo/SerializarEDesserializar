package br.com.alura.serializardesserializar;

import br.com.alura.serializardesserializar.Modelos.Tarefas;
import br.com.alura.serializardesserializar.services.ConverteDados;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

@SpringBootApplication
public class SerializardesserializarApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SerializardesserializarApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		File arquivo = new File("Tarefas.json");

		//DESSERIALIZAR - JSON em um objeto Tarefas
		String json = "{ \"descricao\": \"ir no mercado\", \"concluida\": true, \"pessoaResponsavel\": \"fulano\" }";

		ConverteDados converteDados = new ConverteDados();
		Tarefas tarefaConvertida = converteDados.desserializar(json, Tarefas.class);
		System.out.println("JSON convertido em objeto: ");
		System.out.println(tarefaConvertida);

		//SERIALIZAR - objeto Tarefas em um arquivo JSON
		Tarefas tarefaJSON = new Tarefas("Fazer comida", false, "Outra pessoa");
		converteDados.serializar(tarefaJSON, arquivo);

		Scanner lerArquivoJSON = new Scanner(arquivo);

		while (lerArquivoJSON.hasNextLine()) {
			String textoArquivo = lerArquivoJSON.nextLine();
			System.out.println(textoArquivo);
		}



	}
}

package br.com.alura.serializardesserializar;

import br.com.alura.serializardesserializar.Modelos.Tarefas;
import br.com.alura.serializardesserializar.services.Contador;
import br.com.alura.serializardesserializar.services.LerNumero;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.cfg.MapperBuilder;
import com.google.gson.Gson;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileWriter;

@SpringBootApplication
public class SerializardesserializarApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SerializardesserializarApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		Gson gson = new Gson();
		File arquivo = new File("tarefas.json");
		File arquivo2 = new File("tarefas2.txt");

		// USANDO JACKSON
		Tarefas tarefa1 = new Tarefas("Lavar louça", false, "alguém");
		Tarefas tarefa2 = new Tarefas("Lavar carro", true, "eu");
		mapper.writeValue(arquivo, tarefa1); // escrever o conteúdo do objeto no arquivo tarefas.json (serializar)
		mapper.writeValue(arquivo, tarefa2);

		Tarefas tarefaObj = mapper.readValue(arquivo, Tarefas.class); // transformar o conteúdo do arquivo em um objeto Tarefas (desserializar)
		System.out.println(tarefaObj);

		System.out.println("----------------------------------------------------------------------------------------");

		//USANDO GSON
		Tarefas tarefa3 = new Tarefas("comer", true, "outra pessoa");

		String tarefa3Convertida = gson.toJson(tarefa3);
		System.out.println(tarefa3Convertida);

		FileWriter escreverArquivo = new FileWriter(arquivo2);
		escreverArquivo.write(tarefa3Convertida);
		escreverArquivo.close();


	}
}

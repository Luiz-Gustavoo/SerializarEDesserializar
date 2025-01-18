package br.com.alura.serializardesserializar;

import br.com.alura.serializardesserializar.Modelos.Tarefas;
import br.com.alura.serializardesserializar.services.ConverteDados;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

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
		System.out.println(tarefaConvertida);

		//SERIALIZAR - objeto Tarefas em um arquivo JSON
		String escreverTarefa = converteDados.serializar(arquivo, tarefaConvertida);



//		System.out.println("----------------------------------------------------------------------------------------");
//		//USANDO GSON
//
//		Gson gson = new Gson();
//
//		Tarefas tarefa3 = new Tarefas("comer", true, "outra pessoa");
//
//		String tarefa3Convertida = gson.toJson(tarefa3);
//		System.out.println(tarefa3Convertida);



	}
}

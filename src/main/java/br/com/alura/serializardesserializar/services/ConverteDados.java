package br.com.alura.serializardesserializar.services;

import br.com.alura.serializardesserializar.Modelos.Tarefas;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ConverteDados {
    private ObjectMapper objectMapper = new ObjectMapper();

    public <T> T desserializar(String json, Class<T> classe) {

        try {
            return objectMapper.readValue(json, classe);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public String serializar(File arquivo, Tarefas classe) {
        try {
            objectMapper.writeValue(arquivo, classe);
            return "arquivo escrito";
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

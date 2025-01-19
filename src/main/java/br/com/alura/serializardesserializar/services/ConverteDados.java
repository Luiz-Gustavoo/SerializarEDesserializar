package br.com.alura.serializardesserializar.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ConverteDados {
    private ObjectMapper objectMapper = new ObjectMapper();

    public <T> T desserializar(String json, Class<T> classe) { // JSON em um objeto Tarefas

        try {
            return objectMapper.readValue(json, classe);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public <T> void serializar(T objeto, File arquivo ) { // Objeto Tarefas em um arquivo JSON
        try {
            objectMapper.writeValue(arquivo, objeto);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

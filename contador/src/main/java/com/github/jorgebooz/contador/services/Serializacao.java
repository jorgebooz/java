package com.github.jorgebooz.contador.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.jorgebooz.contador.model.Tarefa;
import java.io.File;

public class Serializacao {
    private final ObjectMapper objectMapper;


    public Serializacao() {
        this.objectMapper = new ObjectMapper();
    }

    public String SerializarParaJson(Tarefa tarefa){
        try{
            return objectMapper.writeValueAsString(tarefa);
        } catch(Exception e){
            throw new RuntimeException("Erro ao serializar o objeto", e);
        }
    }

    public Tarefa desserializarJson(String json){
        try{
            return objectMapper.readValue(json, Tarefa.class);
        }catch(Exception e){
            throw new RuntimeException("Erro ao desserializar o JSON", e);
        }
    }

    public void serializarObjetoParaArquivo(Tarefa tarefa){
        try{
            File arquivo = new File("tarefa.json");
            objectMapper.writeValue(arquivo, tarefa);
            System.out.println("Arquivo Json criado com sucesso: " + arquivo.getAbsolutePath());
        }catch(Exception e){
            throw new RuntimeException("Erro ao serializar objeto para arquivo json", e);
        }

    }
}

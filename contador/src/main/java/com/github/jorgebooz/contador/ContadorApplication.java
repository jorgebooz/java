package com.github.jorgebooz.contador;

import com.github.jorgebooz.contador.model.Tarefa;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;
import com.github.jorgebooz.contador.services.Contador;
import com.github.jorgebooz.contador.services.Serializacao;

@SpringBootApplication
public class ContadorApplication implements CommandLineRunner {

	Scanner scanner = new Scanner(System.in);
	Contador contador = new Contador();
	Serializacao serializacao = new Serializacao();


	public static void main(String[] args) {
		SpringApplication.run(ContadorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

			//Testando o contador
			/*try {
				System.out.println("Digite um número inteiro: ");
				int numero = scanner.nextInt();
				contador.FazerContagem(numero);
			} catch (Exception e){
				System.out.println("Não foi inserido um numero inteiro" + e.getMessage());
			}*/

		//Testando o serializador e desserializador
		Tarefa tarefa = new Tarefa("Concluir a formação Java da Alura", false, "Jorge");
		String json = serializacao.SerializarParaJson(tarefa);
		System.out.println(json);

		String texto = tarefa.toString();
		System.out.println(texto);

		serializacao.serializarObjetoParaArquivo(tarefa);
	}
}

package br.com.fiap.exercicio01.view;

import java.util.Scanner;
import br.com.fiap.exercicio01.model.Cor;
import br.com.fiap.exercicio01.model.Lancha;

public class Exercicio {

	//main CTRL + espaço
	public static void main(String[] args) {
		//Instanciar uma Cor
		Cor azul = new Cor("Azul", 0, 0, 255);
		
		//Instanciar uma Lancha
		Lancha bote = new Lancha();
		
		//Pedir os valores da lancha para o usuário:
		//Instanciar o objeto que lê o teclado
		Scanner sc = new Scanner(System.in);
		
		//Ler o modelo 
		System.out.println("Digite o modelo");
		String modelo = sc.next() + sc.nextLine();
		//Setar o modelo no bote
		bote.setModelo(modelo);
		
		//Ler a quantidade de lugares
		System.out.println("Digite a qtd de lugares");
		int qtdLugares = sc.nextInt();
		//Setar a qtd de lugares no bote
		bote.setQuantidadeLugares(qtdLugares);
		
		//Exibir os valores dos atributos da cor e da lancha
		System.out.println("Cor:");
		System.out.println(azul.getNome() + " " + azul.getR() + azul.getG() + azul.getB());
		System.out.println("Lancha:");
		System.out.println("Modelo: " + bote.getModelo());
		System.out.println("Lugares: " + bote.getQuantidadeLugares());
		System.out.println("Comprimento: " + bote.getComprimento());
		System.out.println("Ano: " + bote.getAnoFabricacao());
		System.out.println("Motores: " + bote.getQuantidadeMotores());
		System.out.println("Cor: " + bote.getCor());
		
	}//main
}//class
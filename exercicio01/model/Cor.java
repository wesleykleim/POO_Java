package br.com.fiap.exercicio01.model;

public class Cor {

	//Atributos
	private String nome;
	private int r;
	private int g;
	private int b;
	
	//Construtores
	public Cor(int r, int g, int b) {
		this.r = r;
		this.g = g;
		this.b = b;
	}
	
	public Cor(String nome, int r, int g, int b) {
		this(r,g,b);
		this.nome = nome;
	}
	
	//Getters e Setters
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
}
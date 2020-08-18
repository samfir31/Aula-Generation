package pca;

import java.util.Scanner;

public class Pessoa {
	private String nome;
	private String endereco;
	private String telefone;
	Scanner ler = new Scanner(System.in);
	public Pessoa() {
		
	}
	void entrada() {
		System.out.println("Digite o nome");
		nome = ler.next();
		System.out.println("Digite o endereco");
		endereco = ler.next();
		System.out.println("Digite o telefone");
		telefone = ler.next();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	

}

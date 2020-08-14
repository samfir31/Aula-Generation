package Pac;

public class Cliente {
	private String nome;
	private int idade;
	private String cidade;
	private String estado;
	private String endereco;	
	
	

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	void nom () {
		System.out.println("Digite o Nome: ");
		
		
	}
	void ida () {
		System.out.print("Digite Sua idade: ");
		
	}
	void cid () {
		System.out.print("Digite Sua cidade: ");
		
	}
	void est () {
		System.out.print("Digite Seu estado: ");
		
	}
	void en () {
		System.out.print("Digite Seu endereco: ");
		
	}
	void apresentando() {
		System.out.println("Seu nome é "+nome);
		System.out.println("Sua idade é "+idade);
		System.out.println("Sua cidade é "+cidade);
		System.out.println("Seu estado é "+estado);
		System.out.println("Seu endereco é "+endereco);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}

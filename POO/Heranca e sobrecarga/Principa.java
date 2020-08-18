package pca;

public class Principa {

	public static void main(String[] args) {
		Fornecedor fornecedor = new Fornecedor();
		fornecedor.entrada();
		fornecedor.obterSaldo();
		System.out.println(fornecedor.getNome());
		System.out.println(fornecedor.getEndereco());
		System.out.println(fornecedor.getTelefone());
		System.out.println(fornecedor.getValorCredito());
	}

}

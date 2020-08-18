package pca;

public class Testa_Empregado {
	public static void main(String[] args) {
	Empregado emp = new Empregado();
	emp.entrada();
	emp.calcularSalario();
	System.out.println(emp.getNome());
	System.out.println(emp.getEndereco());
	System.out.println(emp.getTelefone());
	System.out.println(emp.getCodigoSetor());
	System.out.println(emp.getSalarioBase());
}
}
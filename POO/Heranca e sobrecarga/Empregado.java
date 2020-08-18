package pca;

public class Empregado extends Pessoa {
	private int codigoSetor;
	private double salarioBase;
	private double imposto;
	
	public Empregado (){
		
	}
	void entrada() {
		System.out.println("Digite o codigo do Setor");
		codigoSetor = ler.nextInt();
		System.out.println("Digite o Salario base");
		salarioBase = ler.nextDouble();
		System.out.println("Digite o imposto");
		imposto = ler.nextDouble();
	}
	
	public double calcularSalario() {
	double imp;
	imp = (imposto*100)/salarioBase;
	salarioBase = salarioBase-imp;
	return salarioBase;
}
	public int getCodigoSetor() {
		return codigoSetor;
	}
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public double getImposto() {
		return imposto;
	}
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
}
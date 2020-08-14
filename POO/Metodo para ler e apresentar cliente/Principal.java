package Pac;
import java.util.*;
public class Principal {
	public static void main (String args[]) {
		String nome,cidade,estado,endereco;
		int idade;
		Scanner ler = new Scanner(System.in);
		Cliente cliente = new Cliente();		
		cliente.nom();
		nome = ler.next();
		cliente.setNome(nome);
		cliente.ida();
		idade = ler.nextInt();
		cliente.setIdade(idade);
		cliente.cid();
		cidade = ler.next();
		cliente.setCidade(cidade);
		cliente.est();
		estado = ler.next();
		cliente.setEstado(estado);
		cliente.en();
		endereco = ler.next();
		cliente.setEndereco(endereco);
		
		cliente.apresentando();
		
	}
}

package br.com.main;

import br.com.entities.Cliente;
import br.com.entities.Conta;
import br.com.entities.ContaPlus;
import br.com.entities.ContaSalario;
import br.com.service.Agencia;

public class program {

	
	
	public static void main(String[] args) {
			
		Cliente c1 = new Cliente("Fabricio Longo Bucco Pinheiro","13496102720","longobuccofbc@gmail.com");
		Cliente c2 = new Cliente("vanilce Longo Bucco Pinheiro","188636772839","vannilongobuccofbc@gmail.com");
		
		ContaSalario conta1 =new ContaSalario(c1);
		ContaSalario conta2 =new ContaSalario(c2);
		
		conta1.depositar(10000);
		conta1.depositar(10000);
		conta1.depositar(10000);
		
		conta1.transferir(200, conta2);
		
		
		conta1.mostrarExtrato();
		conta2.mostrarExtrato();
		
		Agencia.salvarConta(conta1);
		Agencia.salvarConta(conta2);
		Agencia.mostrarContas();
		
		
		
	
		
		
	}

}

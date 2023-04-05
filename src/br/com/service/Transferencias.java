package br.com.service;

import br.com.entities.Conta;

public class Transferencias {

	private Conta conta;
	

	public Transferencias() {
		
	}

	public Transferencias(Conta conta) {
		this.conta = conta;
		
	}

	public void sacar(double valor) {
		if (valor <= this.conta.getSaldo()) {
			this.conta.setSaldo(this.conta.getSaldo() - valor);
			
		} else {
			System.out.println("saldo insufici�nte!");

		}
	}

	public void depositar(double valor) {
		if (valor > 0) {
			this.conta.setSaldo(this.conta.getSaldo()+valor);
			
		}else {
			System.out.println("n�o foi poss�vel fazer o deposito");
		}
	}
	
	public void transferir(Double valor, Conta contaAReceber) {
		if(valor <= this.conta.getSaldo()) {
			this.conta.setSaldo(this.conta.getSaldo()-valor);
			contaAReceber.setSaldo(contaAReceber.getSaldo()+valor);
			
		} else {
			System.out.println("transfer�ncia n�o pode ser feita!!!");
		}
	}


	
	
	
	
	
	
	
}

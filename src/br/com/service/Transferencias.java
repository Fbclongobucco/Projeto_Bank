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
			System.out.println("saldo insuficiênte!");

		}
	}

	public void depositar(double valor) {
		if (valor > 0) {
			this.conta.setSaldo(this.conta.getSaldo()+valor);
			
		}else {
			System.out.println("não foi possível fazer o deposito");
		}
	}
	
	public void transferir(Double valor, Conta contaAReceber) {
		if(valor <= this.conta.getSaldo()) {
			this.conta.setSaldo(this.conta.getSaldo()-valor);
			contaAReceber.setSaldo(contaAReceber.getSaldo()+valor);
			
		} else {
			System.out.println("transferência não pode ser feita!!!");
		}
	}


	
	
	
	
	
	
	
}

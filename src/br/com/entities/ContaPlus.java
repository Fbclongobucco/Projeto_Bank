package br.com.entities;

public class ContaPlus extends Conta {
	
	private Double limiteEmprestimo;
	
	public ContaPlus() {
		super();
	
	}

	public ContaPlus(Cliente cliente) {
		super(cliente);
		this.limiteEmprestimo = 500.00;
		
	}

	public Double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}
	
	

	public void pegaEmpresitmo(double valor) {
		if (valor <= this.limiteEmprestimo) {
			this.setSaldo(this.getSaldo()+valor);
			this.limiteEmprestimo = this.getLimiteEmprestimo()-valor;
		}else {
			System.out.println("limite indisponível");
		}
	}

	@Override
	public String toString() {
		return "ContaSalario Numero da conta=" + getIdConta() + ", Nome do Titular=" + getCliente() 
		+ ", Saldo= "
		+ getSaldo() + ", Data/hora=" + getData() + "";
	}
	
	
	
}

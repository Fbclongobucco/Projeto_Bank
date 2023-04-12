package br.com.entities;

import java.util.ArrayList;

import br.com.service.Transferencias;

public class ContaPlus extends Conta {
	
	
	private ArrayList<String> extrato;
	private Transferencias transfer;
	
	private Double limiteEmprestimo;
	
	
	public ContaPlus() {
		super();
	
	}

	public ContaPlus(Cliente cliente) {
		super(cliente);
		this.transfer =new Transferencias(this);
		this.extrato= new ArrayList<String>();
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
	
	public void depositar(double valor) {
		String deposito = "foi feito um deposito de "+valor+" na sua conta /  "+this.getData();
		extrato.add(deposito);
		this.transfer.depositar(valor);
		
	}
	
	public void sacar(double valor) {
		String deposito = "foi feito um saque de "+valor+" na sua conta  /  "+this.getData();
		extrato.add(deposito);
		this.transfer.sacar(valor);
		
	}
	
	public void transferir(double valor, Conta conta) {
		String transferencia = "foi feita uma transferência de "+valor+" pra conta de "+conta.getCliente()
		+".";
		extrato.add(transferencia);
		this.transfer.transferir(valor, conta);
				
	}
	
	public void mostrarExtrato() {
		for (String ext: extrato) {
			System.out.println(ext);
		}
		System.out.println("E seu saldo é de "+this.getSaldo());
		
	}

	
}

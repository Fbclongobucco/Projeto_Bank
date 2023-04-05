package br.com.entities;



import java.util.ArrayList;

import br.com.service.Transferencias;

public class ContaSalario extends Conta{

	private Transferencias transfer;
	private ArrayList<String> extrato;
	
	
	public ContaSalario() {
		super();
		
	}

	public ContaSalario(Cliente cliente) {
		super(cliente);
		this.transfer =new Transferencias(this);
		this.extrato= new ArrayList<String>();
		
		
	}

	@Override
	public Integer getIdConta() {
		// TODO Auto-generated method stub
		return super.getIdConta();
	}

	@Override
	public String getCliente() {
		// TODO Auto-generated method stub
		return super.getCliente();
	}



	@Override
	public double getSaldo() {
		// TODO Auto-generated method stub
		return super.getSaldo();
	}

	@Override
	public void setSaldo(double saldo) {
		// TODO Auto-generated method stub
		super.setSaldo(saldo);
	}

	@Override
	public String getData() {
		return super.getData();
		// TODO Auto-generated method stub
		
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

package br.com.entities;



import br.com.service.Transferencias;

public class ContaSalario extends Conta{

	Transferencias transfer;
	
	
	public ContaSalario() {
		super();
		
	}

	public ContaSalario(Cliente cliente) {
		super(cliente);
		this.transfer =new Transferencias(this);
		
		
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
		this.transfer.depositar(valor);
	}
	
	public void sacar(double valor) {
		this.transfer.sacar(valor);
	}
	
	public void transferir(double valor, Conta conta) {
		this.transfer.transferir(valor, conta);
	}
}

package br.com.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

import br.com.utils.Utils;

public abstract class Conta {
	
	private Integer idConta; 
	private Cliente cliente;
	private double saldo=0.0;
	private Date data;
	private String dataHora;
	
	
	
	

	
	public Conta() {
		
	}
       

	public Conta(Cliente cliente) {
		this.cliente = cliente;
		this.data=  new Date();
		this.dataHora = Utils.dataFormat.format(data);
		this.idConta = this.cliente.getId();
		
		
		}
	
	

	public Integer getIdConta() {
		return idConta;
	}



	public String getCliente() {
		return cliente.getNome();
	}



	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public String getData() {
		
		return dataHora;
	}

	}

	
	


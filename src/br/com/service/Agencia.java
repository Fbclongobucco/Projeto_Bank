package br.com.service;

import java.util.ArrayList;
import java.util.List;

import br.com.entities.Conta;

public class Agencia {

	private static List<Conta> contaList = new ArrayList<Conta>();

	public static void salvarConta(Conta conta) {

		contaList.add(conta);

	}

	public static void excluirConta(Conta conta) {
		contaList.remove(conta);
	}

	public static void mostrarContas() {
		System.out.println("contas abentas nessa agencia:");
		System.out.println("---------------------");
		
		for (Conta conta : contaList) {

			System.out.println(conta.toString());
		}
	}

}

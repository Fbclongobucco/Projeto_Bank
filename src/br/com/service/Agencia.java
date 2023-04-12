package br.com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.entities.Cliente;
import br.com.entities.Conta;
import br.com.entities.ContaSalario;

public class Agencia {

	private static List<Conta> contaList = new ArrayList<Conta>();
	Scanner sc = new Scanner(System.in);

	public static Conta criarContaSalario() {
		Scanner sc = new Scanner(System.in);
		String nome;
		String cpf;
		String email;

		System.out.print("digite seu nome completo: ");
		nome = sc.nextLine();
		System.out.print("digite o seu CPF: ");
		cpf = sc.nextLine();
		System.out.print("digite seu email: ");
		email = sc.nextLine();

		Cliente cliente = new Cliente(nome, cpf, email);
		ContaSalario contaSalario = new ContaSalario(cliente);

		return contaSalario;

	}

	public static void salvarConta(Conta conta) {

		contaList.add(conta);

	}

	public static void excluirConta(Conta conta) {
		contaList.remove(conta);
	}

	public static void criadorDeContas() {
		Conta conta = criarContaSalario();
		salvarConta(conta);

	}

	public static void mostrarContas() {
		System.out.println("contas abentas nessa agencia:");
		System.out.println("---------------------");

		for (Conta conta : contaList) {

			System.out.println(conta.toString());
			System.out.println("---------------------");

		}

	}

	public static void operacoes() {
		Scanner sc = new Scanner(System.in);
		Integer opcoes;
		System.out.println("---------------------");
		System.out.println("--menu de operações--");
		System.out.println("---------------------");
		System.out.println("- para criar conta digite: 1");
		System.out.println("- para excluir conta ditete: 2");
		System.out.println("- para sair digite: 3");
		opcoes = sc.nextInt();

		switch (opcoes) {

		case 1:
			
			System.out.println("deseja criar um conta? 1 para sim e 0 para não");
			Integer in = sc.nextInt();
			while (in == 1) {
				Conta conta =criarContaSalario();
				Agencia.salvarConta(conta);
				System.out.println("deseja criar outra conta?");
				in = sc.nextInt();
			}

			break;
		case 2:

			System.out.println("Bunda de Cassinha!");
			break;
		case 3:
			System.exit(0);
		}

	}

}

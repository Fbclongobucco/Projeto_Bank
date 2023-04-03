package br.com.main;

import java.util.Scanner;

import br.com.entities.Cliente;
import br.com.entities.ContaPlus;

public class program {

	
	
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		String[] vect = sc.nextLine().split(" ");
		
		for (String stc: vect) {
			System.out.println(stc);
		}
		
	
		sc.close();
	
		
		
	}

}

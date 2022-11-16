package org.generation.italy;
import java.util.Scanner;


public class passwordGenrator {
	public static void main(String[] Args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Inserire nome");
		String nome = in.nextLine();
		
		System.out.println("Inserire cognome");
		String cognome = in.nextLine();
		
		System.out.println("Inserire giorno di nascita");
		int day = in.nextInt();
		
		System.out.println("Inserire mese di nascita");
		int month = in.nextInt();
		
		System.out.println("Inserire anno di nascita");
		int year = in.nextInt();
		
		int halfPassword = day + month + year;
		
		System.out.println("La tua password è: ");
		System.out.println(nome + "-" + cognome + "-" + halfPassword );
		
		
	}
	
}

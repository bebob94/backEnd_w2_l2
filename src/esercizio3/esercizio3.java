package esercizio3;

import java.util.*;

public class esercizio3 {
	private static Scanner input = new Scanner(System.in);
	private static Integer numeroElementi;
	private static Map<String, Integer> rubrica = new HashMap<>();
	public static void main(String[] args) {
		inserimentoCoppia();
		eliminazioneCoppia();
		trovaNmuero();
		trovaPersona();
		System.out.println();
	}

	// <<<<<<<<<<<<<<<<<MODULO INSERIMENTOCOPPIA CHIAVE VALORE>>>>>>>>>>>>>>>>>
	public static void inserimentoCoppia() {
		System.out.println("Inserisci il numero di elementi: ");
		numeroElementi = input.nextInt();
		input.nextLine();
		for (int i = 0; i < numeroElementi; i++) {
			System.out.println("Inserisci il nome: ");
			String name = input.nextLine();
			System.out.println("Inserisci il numero: ");
			Integer numeroTelefono = input.nextInt();
			input.nextLine();
			rubrica.put(name, numeroTelefono);
		}
		System.out.println(rubrica);

	}

	public static void eliminazioneCoppia() {
		
			System.out.println("Inserisci il nome da eliminare: ");
			String name = input.nextLine();
			if (rubrica.containsKey(name)) {
				rubrica.remove(name);
			}
		
		System.out.println(rubrica);
	
	}
	
	public static void trovaNmuero() {
		System.out.println("Inserisci il numero corrispondente al nome da trovare: ");
		Integer numeroTelefono = input.nextInt();
		input.nextLine();
		
		for(Map.Entry<String, Integer> entry: rubrica.entrySet()) {
			if(entry.getValue().equals(numeroTelefono)) {
				System.out.println("il numero: #" + numeroTelefono + " corrisonde al contatto #" + entry.getKey().toUpperCase());
				return;
			}
		}
		System.out.println("il numero: #" + numeroTelefono+ " non è presente in rubrica" );
		
		
	}
	public static void trovaPersona() {
		System.out.println("Inserisci il nome corrispondente al numero da trovare: ");
		String nomePersona= input.nextLine();
		for(Map.Entry<String, Integer> entry: rubrica.entrySet()) {
			if(entry.getKey().equals(nomePersona)) {
				System.out.println("il nome: #" + nomePersona.toUpperCase() + " corrisonde al contatto #" + entry.getValue());
				return;
			}
		}
		System.out.println("il nome: #" + nomePersona.toUpperCase() + " non è presente in rubrica" );	
	}
		
}

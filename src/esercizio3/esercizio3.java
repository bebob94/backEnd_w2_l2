package esercizio3;

import java.util.*;

public class esercizio3 {
	private static Scanner input = new Scanner(System.in);
	private static Integer numeroElementi;
	
	public static void main(String[] args) {
		Map<String, Integer> rubrica = inserimentoCoppia();
		eliminazioneCoppia(rubrica);
		trovaNmuero(rubrica);
		trovaPersona(rubrica);
		System.out.println(rubrica);
	}

	// <<<<<<<<<<<<<<<<<MODULO INSERIMENTOCOPPIA CHIAVE VALORE>>>>>>>>>>>>>>>>>
	public static Map<String, Integer> inserimentoCoppia() {
		System.out.println("Inserisci il numero di elementi: ");
		numeroElementi = input.nextInt();
		input.nextLine();
		Map<String, Integer> rubrica = new HashMap<>();
		for (int i = 0; i < numeroElementi; i++) {
			System.out.println("Inserisci il nome: ");
			String name = input.nextLine();
			System.out.println("Inserisci il numero: ");
			Integer numeroTelefono = input.nextInt();
			input.nextLine();
			rubrica.put(name, numeroTelefono);
		}
		System.out.println(rubrica);
		return rubrica;
	}

	public static Map<String, Integer> eliminazioneCoppia(Map<String, Integer> Rubrica) {
		
			System.out.println("Inserisci il nome da eliminare: ");
			String name = input.nextLine();
			if (Rubrica.containsKey(name)) {
				Rubrica.remove(name);
			}
		
		System.out.println(Rubrica);
		return Rubrica;
	}
	
	public static void trovaNmuero(Map<String, Integer> Rubrica) {
		System.out.println("Inserisci il numero da trovare: ");
		Integer numeroTelefono = input.nextInt();
		input.nextLine();
		
		for(Map.Entry<String, Integer> entry: Rubrica.entrySet()) {
			if(entry.getValue().equals(numeroTelefono)) {
				System.out.println("il numero: " + numeroTelefono + " corrisonde al contatto " + entry.getKey());
				return;
			}
		}
		System.out.println("il numero: " + numeroTelefono+ " non è presente in rubrica" );
		
		
	}
	public static void trovaPersona(Map<String, Integer> Rubrica) {
		System.out.println("Inserisci il nome della persona da trovare: ");
		String nomePersona= input.nextLine();;
		for(Map.Entry<String, Integer> entry: Rubrica.entrySet()) {
			if(entry.getKey().equals(nomePersona)) {
				System.out.println("il nome: " + nomePersona + " corrisonde al contatto " + entry.getValue());
				return;
			}
		}
		System.out.println("il nome: " + nomePersona + " non è presente in rubrica" );	
	}
		
}

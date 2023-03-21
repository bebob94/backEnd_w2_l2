package esercizio1;

	import java.util.HashSet;
	import java.util.Scanner;
	

	public class esercizio1 {
	
	    public static void main(String[] args) {
	        gestisciParole();
	    }

	    //<<<<<<<<<<<<<<<<<<<<FUNZIONE PER GESTIRE LE PAROLE>>>>>>>>>>>>>>>>>>>>
	    private static void gestisciParole() {
	        Scanner input = new Scanner(System.in);
	        System.out.println("Inserisci il numero di parole: ");
	        int n = input.nextInt();
	        input.nextLine();

	        HashSet<String> parole = new HashSet<>();
	        HashSet<String> paroleDuplicate = new HashSet<>();
	        for (int i = 1; i <= n; i++) {
	            System.out.println("Inserisci la parola #" + i + ": ");
	            String parola = input.nextLine();
	            if (!parole.add(parola)) {
	                paroleDuplicate.add(parola);
	            }
	        }

	        System.out.println("Parole duplicate: " + paroleDuplicate);
	        System.out.println("Numero di parole distinte: " + parole.size());
	        System.out.println("Elenco delle parole distinte: " + parole);
	    }
	}



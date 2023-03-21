	package esercizio2;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;
	import java.util.Random;
	import java.util.Scanner;

	public class esercizio2 {
		private static Scanner input = new Scanner(System.in);
		
	    public static void main(String[] args) {
	    	

	        List<Integer> lista = creaListaCasuale();
	        System.out.println("Lista originale: " + lista);

	        List<Integer> listaDoppia = creaListaDoppia(lista);
	        System.out.println("Lista doppia: " + listaDoppia);

	        System.out.print("Stampare valori in posizioni pari? (true/false): ");
	        boolean stampaPari = input.nextBoolean();
	        stampaPosizioni(listaDoppia, stampaPari);
	    }
	    
	    //<<<<<<<<<<<<<<<<<<FUNZIONE CHE CREA UNA LISTA DI NUMERI CASUALI>>>>>>>>>>>>>>>>>>
	    private static List<Integer> creaListaCasuale() { 
		    System.out.print("Inserisci il numero di elementi: ");
		    int n = input.nextInt();
	        Random rand = new Random();
	        List<Integer> lista = new ArrayList<>();
	        for (int i = 0; i < n; i++) {
	            lista.add(rand.nextInt(101)); 
	        }
	        Collections.sort(lista); 
	        return lista;
	    }
	    
	    //<<<<<<<<<<<<<<<<<<FUNZIONE CHE CREA UNA COPIA INVERTITA DELLA  LISTA>>>>>>>>>>>>>>>>>>
	    private static List<Integer> creaListaDoppia(List<Integer> lista) {
	        List<Integer> listaDoppia = new ArrayList<>(lista);
	        Collections.reverse(lista);
	        listaDoppia.addAll(lista);
	        return listaDoppia;
	    }
	    
	    //<<<<<<<<<<<<<<<<<<FUNZIONE CHE STAMPA I NUMERI PARI O I NUMERI DISPARI DELLA LISTA>>>>>>>>>>>>>>>>>>
	    private static void stampaPosizioni(List<Integer> lista, boolean stampaPari) {
	        System.out.print("Valori in posizioni " + (stampaPari ? "pari" : "dispari") + ": ");
	        for (int i = stampaPari ? 0 : 1; i < lista.size(); i += 2) {
	            System.out.print(lista.get(i) + " ");
	        }
	        System.out.println();
	    }
	}


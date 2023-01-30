package org.lessons.java.shop;

import java.util.Scanner;

public class Catalogo {

	public static void main(String[] args) {
		
//	int n = 3;
//	Prodotto[] catalogoProdotti = new Prodotto [n];
//	
//	for (int i=1; i<n ;i++) {
//		catalogoProdotti[i].toString();
//	}

	String userCommand = "";
		
		while (!userCommand.equals("x"))  {
			
			Scanner s=new Scanner (System.in);
			
			System.out.println("Benarrivato utente. Cosa vuoi fare?");
			System.out.println("n - per inserire un prodotto");
			System.out.println("v - per visualizzare la lista dei prodotti");			
			System.out.println("x - per uscire");
			userCommand=(s.nextLine());

			if (userCommand.equals("v")) {
			
				System.out.println();

				
			}
			
			if (userCommand.equals("n")) {
				
				String nome = "";
				String brand = "";
				double prezzo = 0;
				
				System.out.println("Stai inserendo un nuovo prodotto.");
				System.out.println("Inserisci il nome del prodotto.");				
				nome=(s.nextLine());
				System.out.println("Inserisci la marca del prodotto.");				
				brand=(s.nextLine());
				System.out.println("Inserisci il prezzo netto del prodotto.");				
				prezzo=(s.nextDouble());				

				while (!userCommand.equals("b")) {
				
					System.out.println("Che tipo di prodotto vuoi inserire?");
					System.out.println("sp per smartphone;");
					System.out.println("tv per televisore");
					System.out.println("hp per cuffie");
					System.out.println("b per tornare indietro");
					userCommand=(s.nextLine());
				
					if (userCommand.equals("sp")) {
			
						int memoria = 0;
						
						System.out.println("Stai inserendo uno smartphone");
						System.out.println("Prego inserire la memoria interna in gb");
						memoria=(s.nextInt());				
	//					mobileCodeImei è autogenerato
						
						Smartphone p= new Smartphone (nome,brand,prezzo,memoria);
						
						System.out.println("Ecco i dati che hai inserito");			
						System.out.println("Nome prodotto: " + (p.getProdName()));
						System.out.println("Codice prodotto: " + (p.getProdCode()));						
						System.out.println("Prezzo prodotto: " + (p.getProdPrice()) + "€");						
						System.out.println("Prezzo ivato prodotto: " + (p.getTaxedPrice()) + "€");		
						userCommand="b";

	
					}	
					
					if (userCommand.equals("tv")) {
						
						float pollici = 0;
						boolean smart = false;

						System.out.println("Stai inserendo un televisore");
						System.out.println("Prego inserire le dimensioni schermo in pollici: ");
						pollici=(s.nextFloat());				
						System.out.println("Il televisore è una smart TV?");
						System.out.println("y : sì");
						System.out.println("altrimenti premere invio");
						userCommand=(s.nextLine());
						userCommand=(s.nextLine());
						if (userCommand.equals("y"))smart=true;

						Television q= new Television (nome,brand,prezzo,pollici,smart);
						
						System.out.println("Ecco i dati che hai inserito");			
						System.out.println("Nome prodotto: " + (q.getProdName()));
						System.out.println("Codice prodotto: " + (q.getProdCode()));						
						System.out.println("Prezzo prodotto: " + (q.getProdPrice()) + "€");						
						System.out.println("Prezzo ivato prodotto: " + (q.getTaxedPrice()) + "€");										
						userCommand="b";	
					}	
					
					if (userCommand.equals("hp")) {
						System.out.println("TO DO");			
						userCommand="b";	
					
				}					
			}
			s.close();
		};
			
		System.out.println("Arrivederci utente, grazie per aver scelto LeppoEngine.");
		
		}
	}
}


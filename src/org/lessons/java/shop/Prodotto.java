//	Creare la classe Prodotto che gestisce i prodotti dello shop.
//	Un prodotto è caratterizzato da:
//	- codice (numero intero)
//	- nome
//	- marca
//	- prezzo
//	- iva
//	Usate opportunamente i livelli di accesso (public, private), i costruttori, i metodi getter e setter ed eventuali altri metodi di “utilità” per fare in modo che:
//	- il codice prodotto sia accessibile solo in lettura
//	- gli altri attributi siano accessibili sia in lettura che in scrittura
//	- il prodotto esponga sia un metodo per avere il prezzo base che uno per avere il prezzo comprensivo di iva formattato

//	Lo shop gestisce diversi tipi di prodotto:
//	- Smarphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria
//	- Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no
//	- Cuffie, caratterizzate dal colore e se sono wireless o cablate
//	Utilizzate l’ereditarietà per riutilizzare il codice di Prodotto nella stesura delle classi che gestiscono i vari sotto tipi di prodotto.
//	BONUS: create una classe Catalogo con metodo main, in cui chiedete all’utente di valorizzare un catalogo di prodotti con dati inseriti tramite scanner.
//	Durante la richiesta di valorizzazione chiedete all’utente se sta inserendo uno Smarphone o un Televisore o Cuffie e in base alla scelta dell’utente utilizzate il costruttore opportuno.
//	Al termine dell’inserimento stampate il catalogo (fate l’override del metodo toString per restituire le informazioni da stampare per ogni classepackage org.lessons.java.shop;

package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
	
	private int prodCode;
	private String prodName, prodBrand;
	private double prodPrice;
	private double prodTax;

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdBrand() {
		return prodBrand;
	}

	public void setProdBrand(String prodBrand) {
		this.prodBrand = prodBrand;
	}

	public double getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}

	public double getProdTax() {
		return prodTax;
	}

	public void setProdTax(double prodTax) {
		this.prodTax = prodTax;
	}

	public String getProdCode() {
		String code = prodName+"-"+prodCode;
		return code;
	}
	
	double getTaxedPrice() {
		return prodPrice*(1+prodTax);
	}
	
	public Prodotto(String prodName, String prodBrand, double prodPrice) {
		super();
		Random r=new Random();
		this.prodCode = r.nextInt(99999);
		this.prodName = prodName;
		this.prodBrand = prodBrand;
		this.prodPrice = prodPrice;
		this.prodTax = 0.21;
		
		}
	
}
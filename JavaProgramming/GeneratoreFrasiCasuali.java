/******************************** 

Il programma prende come dati tre liste di descrizioni
casualmente ne prende una da ciascuna lista, 
e compone una frase con i vari elementi ottenuti casualmente.

********************************/


public class GeneratoreFrasiCasuali {
	public static void main(String[] args){
	//fare tre set di descrizioni da cui scegliere

	String[] listaUno = {"simpatico", "amico dell'AI", "cretino", "raccoglitore di zangoni", "renziano", 
                        "pessimo", "un po' mucculone" };
	String[] listaDue = {"brutto", "amico della Mara", "onesto", "tragattino", "massone", "incompetente", "affabile"};
	String[] listaTre = {"carino", "architetto dell'amore", "docile", "esperto di strutture dati", "drogato di java"};


	//trovare quante descrizioni ci sono in ogni lista
 	int lunghezzaUno = listaUno.length;
 	int lunghezzaDue = listaDue.length;
 	int lunghezzaTre = listaTre.length;

	//generare tre numeri random, e memorizzarli
	java.util.Random randomGenerator = new java.util.Random();
	int random1 = randomGenerator.nextInt(lunghezzaUno);
	int random2 = randomGenerator.nextInt(lunghezzaDue);
	int random3 = randomGenerator.nextInt(lunghezzaTre);

	//costruire la frase con gli elementi generati
	String frase = "Giovane disinibito " + listaUno[random1] + " ma " + listaDue[random2] + " è alla ricerca di " + listaTre[random3] + " maturo";

	//stampare il risultato
	System.out.println("La frase generata automaticamente è: ");
	System.out.println(" ");
	System.out.println(frase);

	}
}
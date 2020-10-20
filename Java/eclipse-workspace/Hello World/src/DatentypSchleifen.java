/*
 * rv15@tu-clausthal.de
 * Vorname: René
 * Nachname: Voutta
 */

import javax.swing.JOptionPane;

/**
 * Die Klasse soll die WEltbevölkerung aufzählen. Zudem soll eine Zahl n abgefragt werden, die angibt
 * wieviele Zahlen bei der Auflistung übersprungen werden sollen.
 * 
 * @author René Voutta
 * @version 1.0
 *
 */

public class DatentypSchleifen {
	
	public static void main (String[] args) {
		
		String answer = JOptionPane.showInputDialog(null, "Wie viele Zahlen sollen übersprungen werden?", "Zahl auswählen", JOptionPane.PLAIN_MESSAGE); // Wer einer Eingabe wird per JOptionPane geholt.
		long n = Long.parseLong(answer); // Parsen des Strings vom JOptionPane zu einem Long-Datentyp
		
			
		for (long i = 0; i < 7694561082l; i=i+n) { //Die Zahl 7694561082 ist für den int-Datentyp zu groß. Hier sollte man den long-Datntyp verwenden.
			
			System.out.println(i);
	
		}
				
	}

}

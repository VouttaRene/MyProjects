/*
 * rv15@tu-clausthal.de
 * Vorname: Ren�
 * Nachname: Voutta
 */

import javax.swing.JOptionPane;

/**
 * Die Klasse soll die WEltbev�lkerung aufz�hlen. Zudem soll eine Zahl n abgefragt werden, die angibt
 * wieviele Zahlen bei der Auflistung �bersprungen werden sollen.
 * 
 * @author Ren� Voutta
 * @version 1.0
 *
 */

public class DatentypSchleifen {
	
	public static void main (String[] args) {
		
		String answer = JOptionPane.showInputDialog(null, "Wie viele Zahlen sollen �bersprungen werden?", "Zahl ausw�hlen", JOptionPane.PLAIN_MESSAGE); // Wer einer Eingabe wird per JOptionPane geholt.
		long n = Long.parseLong(answer); // Parsen des Strings vom JOptionPane zu einem Long-Datentyp
		
			
		for (long i = 0; i < 7694561082l; i=i+n) { //Die Zahl 7694561082 ist f�r den int-Datentyp zu gro�. Hier sollte man den long-Datntyp verwenden.
			
			System.out.println(i);
	
		}
				
	}

}

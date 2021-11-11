package de.hfu;

import java.util.Scanner;
/**
 * toUpperCase2 wandelt den eingegebenen Text in UpperCase um
 * und gibt in auf der Kommandozeile aus.
 * @author domi
 *
 */
public class toUpperCase2 {
	public static void main(String args[]) {
		/**
		 * main methode
		 */
	Scanner sc=new Scanner(System.in);
	System.out.println("Input Text: ");
	String Eingabe= sc.nextLine();
	sc.close();
	Eingabe = Eingabe.toUpperCase();
	System.out.println("Text in Upper Case: " + Eingabe);
	}
}

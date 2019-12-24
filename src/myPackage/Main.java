package myPackage;

import java.util.ArrayList;

public class Main {
	 public static void main(String [] args) {
		 
		 Carte carte1 = new Carte("Ion Creanga");
		 carte1.setBase("Capra cu trei iezi",10);
		 carte1.afisareAll();
		 
		 Revista rev1 = new Revista(101, "24 decembrie 2019");
		 rev1.setBase("Men's Health", 500);
		 rev1.afisareAll();
		 
		 ArrayList<Element> myArr = new ArrayList<Element>();
		
		 Biblioteca biblioteca1 = new Biblioteca();
		 biblioteca1.addElement(myArr, carte1);
		 biblioteca1.addElement(myArr, rev1);
		 biblioteca1.toString();
		 biblioteca1.afisareElemente(myArr);
	 }
}

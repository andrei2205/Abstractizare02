package myPackage;

import java.util.ArrayList;

public class Biblioteca {
	{
	Carte carte2 = new Carte("Mihai Eminescu");
	Revista revista2 = new Revista(189, "1 aprilie");
	}
	
	public void addElement(ArrayList<Element> adaugareArray ,Element object)
	{
		
		adaugareArray.add(object);
	}
	
	public void afisareElemente(ArrayList<Element> afisareArray )
	{
		afisareArray.toString();
		for (Element element : afisareArray) {
			System.out.println(element);
		}
	}
}

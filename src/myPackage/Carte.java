package myPackage;

public class Carte extends Element{ 
	private String autor;

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Carte(String autor) {
		super();
		this.autor = autor;
	}

	@Override
	public void afisareAll() {
		
		System.out.println(autor + " | " + Element.titlu + " | " + Element.numarDeExemplareDisponibile);
	}

	@Override
	public void setBase(String titlu1, int numarDeExemplareDisponibile1) {
		titlu = titlu1;
		numarDeExemplareDisponibile = numarDeExemplareDisponibile1;
	}

	@Override
	public String toString() {
		return ("Titlu:" + titlu + " | " + "NumarDeExemplareDisponobile" + numarDeExemplareDisponibile + " | " + "autor" + autor);
	}

}

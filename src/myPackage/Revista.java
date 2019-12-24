package myPackage;

public class Revista extends Element{
     int numarulRevistei;
     String dataAparitiei;
	public int getNumarulRevistei() {
		return numarulRevistei;
	}
	public void setNumarulRevistei(int numarulRevistei) {
		this.numarulRevistei = numarulRevistei;
	}
	public String getDataAparitiei() {
		return dataAparitiei;
	}
	public void setDataAparitiei(String dataAparitiei) {
		this.dataAparitiei = dataAparitiei;
	}
	
	public Revista(int numarulRevistei, String dataAparitiei) {
		super();
		this.numarulRevistei = numarulRevistei;
		this.dataAparitiei = dataAparitiei;
	}
	@Override
	public void afisareAll() {
		System.out.println(titlu + " | " + numarDeExemplareDisponibile + " | " + numarulRevistei + " | " + dataAparitiei);
	}

	@Override
	public void setBase(String titlu1, int numarDeExemplareDisponibile1) {
		titlu = titlu1;
		numarDeExemplareDisponibile = numarDeExemplareDisponibile1;
	}
	@Override
	public String toString() {
		return ("Titlu:" + titlu + " | " + "NumarDeExemplareDisponobile" + numarDeExemplareDisponibile + " | " + "numarul unic al revistei " + numarulRevistei + " | " + "dataAparitiei" + dataAparitiei);
	}
	
	
}

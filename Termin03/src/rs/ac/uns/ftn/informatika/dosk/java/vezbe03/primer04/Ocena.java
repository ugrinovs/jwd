package rs.ac.uns.ftn.informatika.dosk.java.vezbe03.primer04;

class Ocena {

	protected int studentskaOcena;
	protected String predmet;
	
	/** KONSTRUKTORI ****/
	public Ocena() {
	}

	public Ocena(String predmet, int studentskaOcena) {
		this.studentskaOcena = studentskaOcena;
		this.predmet = predmet;
	}
	
	public Ocena(Ocena original) {
		studentskaOcena = original.studentskaOcena;
		predmet = original.predmet;
	}
	
	public String vratiTekstualnuReprezentacijuZaIspis() {
		return "Iz predmeta " + predmet + " je dobio " + studentskaOcena;
	}
}

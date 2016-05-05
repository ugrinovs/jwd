package rs.ac.uns.ftn.informatika.dosk.java.vezbe03.primer05;

class Ocena {

	int studentskaOcena;
	String predmet;
	
	/** KONSTRUKTORI ****/
	Ocena() {
		super();
	}

	Ocena(String predmet, int studentskaOcena) {
		this.studentskaOcena = studentskaOcena;
		this.predmet = predmet;
	}
	
	Ocena(Ocena original) {
		studentskaOcena = original.studentskaOcena;
		predmet = original.predmet;
	}
	
	String vratiTekstualnuReprezentacijuZaIspis() {
		return "Iz predmeta " + predmet + " je dobio " + studentskaOcena;
	}
}

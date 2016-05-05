package rs.ac.uns.ftn.informatika.dosk.java.vezbe03.primer05;

import java.util.ArrayList;


//klasa
class Student {

	//atributi
	String index;
	String imeIPrezime;
	String grad;
	ArrayList<Ocena> ocene = new ArrayList<Ocena>();
	
	/** KONSTRUKTORI ****/
	
	// konstruktor bez parametra
	Student(){
		
	}
	
	//konstruktor sa vise parametara
	Student(String index, String imeIPrezime, String grad) {
		this.index = index;
		this.imeIPrezime = imeIPrezime;
		this.grad = grad;
	}
	
	Student(String index, String imeIPrezime, String grad, ArrayList<Ocena> ocene) {
		this.index = index;
		this.imeIPrezime = imeIPrezime;
		this.grad = grad;
		this.ocene = ocene;
	}
	
	//copy konstruktor sa parametrom tipa Student
	Student(Student original) {
		index = original.index;
		imeIPrezime = original.imeIPrezime;
		grad = original.grad;
		
		ArrayList<Ocena> originalOcene  = original.ocene;
		
		for (int i = 0; i < originalOcene.size(); i++) {
			//moramo da kreiramo nove objekte i za ocene
			//laksi nacin preko copy konstruktora
			ocene.add(new Ocena (originalOcene.get(i)));
//			ocene[i] = new Ocena (originalOcene[i]);
		}
	}
	
	String vratiTekstualnuReprezentacijuZaIspis() {
		String ispis = "Student " + imeIPrezime + " sa indeksom " + index + " zivi u gradu " + grad;
		
		if(ocene.isEmpty()==false){
			ispis = ispis +"\n";
			for (int i = 0; i < ocene.size(); i++) {
				ispis+="\t"+ocene.get(i).vratiTekstualnuReprezentacijuZaIspis()+"\n";
			}
		}

		return ispis;
	}
	
	
	//metode
	double izracunajProsek(){	
		double retVal = 0;
		if(ocene.isEmpty())
			return retVal;
		
		int suma = 0;
		for (int i = 0; i < ocene.size(); i++) {
			suma+=ocene.get(i).studentskaOcena;
		}
		//zasto stoji (double)?
		retVal = (double)suma/ocene.size();
		return retVal;
	}
	
	int pronadjiNajmanjuOcenu(){	
		int retVal = 0;
		//TODO pronaci najmanju ocenu
		return retVal;
	}
	
	//dodao metodu koja ce ispisati sve studentove ocene
	void ispisiOcene(){
		if(ocene.isEmpty())
			return;
		
		for (int i = 0; i < ocene.size(); i++) {
			System.out.println(ocene.get(i).vratiTekstualnuReprezentacijuZaIspis());
		}
	}
}

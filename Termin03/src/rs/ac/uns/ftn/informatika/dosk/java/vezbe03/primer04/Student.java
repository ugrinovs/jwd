package rs.ac.uns.ftn.informatika.dosk.java.vezbe03.primer04;


//klasa
class Student {

	//atributi
	protected String index;
	protected String imeIPrezime;
	protected String grad;
	protected Ocena[] ocene;
	
	/** KONSTRUKTORI ****/
	
	// konstruktor bez parametra
	public Student(){
		ocene = new Ocena [4];
	}
	
	//konstruktor sa vise parametara
	public Student(String index, String imeIPrezime, String grad) {
		this.index = index;
		this.imeIPrezime = imeIPrezime;
		this.grad = grad;
		ocene = new Ocena [4];
	}
	
	public Student(String index, String imeIPrezime, String grad, Ocena[] ocene) {
		this.index = index;
		this.imeIPrezime = imeIPrezime;
		this.grad = grad;
		this.ocene = ocene;
	}
	
	//copy konstruktor sa parametrom tipa Student
	public Student(Student original) {
		index = original.index;
		imeIPrezime = original.imeIPrezime;
		grad = original.grad;
		
		Ocena [] originalOcene  = original.ocene;
		ocene = new Ocena [originalOcene.length];
		
		for (int i = 0; i < originalOcene.length; i++) {
			//moramo da kreiramo nove objekte i za ocene
			ocene[i] = new Ocena ();
			ocene[i].studentskaOcena = originalOcene[i].studentskaOcena;
			ocene[i].predmet = originalOcene[i].predmet;
			
			//laksi nacin preko copy konstruktora
//			ocene[i] = new Ocena (originalOcene[i]);
		}
	}
	
	//metode
	public String vratiTekstualnuReprezentacijuZaIspis() {
		String ispis = "";
		//prebaci kod iz main metode
		
		return ispis;
	}
	
	public boolean isti(Student st) {
		boolean isti = false;
		if(index.equals(st.index))
			isti = true;
		return isti;
	}
	
	
	public double izracunajProsek(){	
		double retVal = 0;
		if(ocene == null)
			return retVal;
		
		int suma = 0;
		for (int i = 0; i < ocene.length; i++) {
			suma+=ocene[i].studentskaOcena;
		}
		//zasto stoji (double)?
		retVal = (double)suma/ocene.length;
		return retVal;
	}
	
	public int pronadjiNajmanjuOcenu(){	
		int retVal = 0;
		//TODO pronaci najmanju ocenu
		return retVal;
	}
	
	//dodao metodu koja ce ispisati sve studentove ocene
	public void ispisiOcene(){
		if(ocene == null)
			return;
		
		for (int i = 0; i < ocene.length; i++) {
			System.out.println(ocene[i].vratiTekstualnuReprezentacijuZaIspis());
		}
	}

	//set i get metode
	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public String getGrad() {
		return grad;
	}

	public void setGrad(String grad) {
		this.grad = grad;
	}

	public Ocena[] getOcene() {
		return ocene;
	}

	public void setOcene(Ocena[] ocene) {
		this.ocene = ocene;
	}
}

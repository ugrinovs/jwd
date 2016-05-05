package rs.ac.uns.ftn.informatika.dosk.java.vezbe03.primer04;

public class Test {

	static Student[] nizObjekata = new Student[3];

	public static void ispisiStudente(Student[] niza){
		for (int i = 0; i < nizObjekata.length; i++) {
			Student st = nizObjekata[i];
			//ispis vrednosti
			//TODO u narednoj liniji ispisati sve podatke o studentima (osim ocena)
			System.out.println("Student sa indeksom " + st.index );
//			st.ispisiOcene();
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		//pozivanje konstruktora bez parametra
		Student student1 = new Student();
		student1.index = "e10002";
		student1.imeIPrezime = "Marko Markovic";
		student1.grad = "Loznica";
		
		Ocena[] ocene = new Ocena [4];
		//kreiranje pojedinacnih objekata za ocene
		ocene[0] = new Ocena();
		ocene[0].studentskaOcena = 7;
		ocene[0].predmet = "Matematika";
		ocene[1] = new Ocena();
		ocene[1].studentskaOcena = 9;
		ocene[1].predmet = "Fizika";
		ocene[2] = new Ocena();
		ocene[2].studentskaOcena = 8;
		ocene[2].predmet = "Hemija";
		ocene[3] = new Ocena();
		ocene[3].studentskaOcena = 10;
		ocene[3].predmet = "Biologija";
		
		student1.ocene = ocene;
		nizObjekata[0] = student1;
		
		//pozivanje konstruktora sa vise parametara
//		Ocena [] student2Oc = new Ocena[2];
//		student2Oc[0] = new Ocena("Matematika", 6);
//		student2Oc[1] = new Ocena("Informatika", 8);
		Student student2 = new Student("e24", "Petar Petrovic", "Novi Sad");
		nizObjekata[1] = student2;
		
		/*pozivanje copy konstruktora sa parametrom tipa Student
		copy konstruktor omogucava preuzimanje svih vrednosti iz originala
		pravljenje kopija svih vrednosti */
		Student kopija = new Student(student1);
		kopija.index = "NNNNNNNNNN";
		nizObjekata[2] = kopija;

		ispisiStudente(nizObjekata);
		
		System.out.println("Zavrsen rad sa konstruktorima");
	}

}

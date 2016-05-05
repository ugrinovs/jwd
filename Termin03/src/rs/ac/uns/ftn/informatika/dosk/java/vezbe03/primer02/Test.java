package rs.ac.uns.ftn.informatika.dosk.java.vezbe03.primer02;

public class Test {

	public static void main(String[] args) {
		//e10002,Marko Markovic,Loznica,Matematika;9!Fizika;7!Biologija;10
		Student stud = new Student();
		stud.index = "e10002";
		stud.imeIPrezime = "Marko Markovic";
		stud.grad = "Loznica";
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
		stud.ocene = ocene;
		
		System.out.println("Student " + stud.imeIPrezime);
		System.out.println("Prosecna ocena je " + stud.izracunajProsek());
		System.out.println("Najmanja ocena je " + stud.pronadjiNajmanjuOcenu());
		stud.ispisiOcene();

	}

}

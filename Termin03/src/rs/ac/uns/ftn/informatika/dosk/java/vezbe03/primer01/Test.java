package rs.ac.uns.ftn.informatika.dosk.java.vezbe03.primer01;

public class Test {

	public static void main(String[] args) {
		//kreiramo objekat student koji je instanca klase Student
		Student stud = new Student();
		//postavimo atribute na odredjene vrednosti
		//e10002|Marko Markovic|Loznica|7;9;8;10
		stud.index = "e10002";
		stud.imeIPrezime = "Marko Markovic";
		stud.grad = "Loznica";
		int[] ocene = {7,9,8,10};
		stud.ocene = ocene;
		
		System.out.println("Student " + stud.imeIPrezime);
		//pozivamo metode
		System.out.println("Prosecna ocena je " + stud.izracunajProsek());
		System.out.println("Najmanja ocena je " + stud.pronadjiNajmanjuOcenu());
		

		Student stud2 = new Student();
		stud2.index = "e10003";
		stud2.imeIPrezime = "Petar petrovic";
		stud2.grad = "Novi Sad";
		int[] ocene2 = {5,5,6,6};
		stud2.ocene = ocene2;
		
//		stud2 = stud;
//		stud = null;
//		stud2 = null;
		System.out.println("Student " + stud2.imeIPrezime);
		System.out.println("Prosecna ocena 2 studenta je " + stud2.izracunajProsek());
		
	}

}

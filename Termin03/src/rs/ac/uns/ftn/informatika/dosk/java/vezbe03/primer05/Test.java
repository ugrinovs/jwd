package rs.ac.uns.ftn.informatika.dosk.java.vezbe03.primer05;

import java.util.ArrayList;

public class Test {
	
	public static ArrayList<Student> studenti = new ArrayList<Student>();
	
	public static void ispisiStudente(ArrayList<Student> lista){
		System.out.println("******************************");
		//ispis svih studenata 1 NACIN
		for (int i = 0; i < studenti.size(); i++) {
			System.out.println(studenti.get(i).vratiTekstualnuReprezentacijuZaIspis());
		}
		System.out.println("******************************");
		//ispis svih studenata 1 NACIN
		for (Student st : studenti) {
			System.out.println(st.vratiTekstualnuReprezentacijuZaIspis());
		}
	}
	
	public static void main(String[] args) {

		//e10002|Marko Markovic|Loznica|7;Matematika!9;Fizika!8;Hemija!10;Biologija
		
		Student st1 = new Student("RS 01/11", "Petar Petrovic","Novi Sad");
		Student st2 = new Student("RS 02/11", "Marko Markovic","Novi Sad");
		Student st3 = new Student("RS 02/11", "Jovan Jovanovic","Novi Sad");
				
		//dodavanje studenata
		studenti.add(st1);
		studenti.add(st2);
		studenti.add(1, st3);
		
		studenti.set(0, new Student("RS 04/11", "Danijel Danilovic", "Vrsac"));
	
		ispisiStudente(studenti);
		
		System.out.println("******************************");
		//uklanjanje elemenata iz liste, ne i brisanje
		studenti.remove(2);
		System.out.println("Broj studenata je:"+studenti.size());
		
		//uklanjanje svih elemenata iz liste
		studenti.clear();
		System.out.println("Broj studenata je:"+studenti.size());
	}
}

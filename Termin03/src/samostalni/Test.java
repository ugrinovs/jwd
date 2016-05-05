package samostalni;

public class Test {
	
	public static void ispisiPredmete(Predmet[] predmeti){
		for(int i = 0; i < predmeti.length; i++){
			System.out.println(predmeti[i].vratiTekstualnuReprezentacijuZaIspis());
		}
	}
	public static void ispisiRezultate(Rezultat[] rezultat){
		System.out.println("Br. Indeks | Ime i Prezime | Sifra pred. | Predmet | Bodovi Usm. | Bodovi T. | Prosek | Ocena");
		for(int i = 0; i < rezultat.length; i++){
			System.out.println(rezultat[i].vratiTekstualnuReprezentacijuZaIspis());
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predmet[] predmeti = new Predmet[4];
		predmeti[0] = new Predmet("PR01", "Matematika", "6");
		predmeti[1] = new Predmet("PR01", "Fizika", "6");
		predmeti[2] = new Predmet("PR01", "Elektrotehnika", "4");
		predmeti[3]  = new Predmet("PR01", "Informatika", "10");
		
		Rezultat[] rezultat = new Rezultat[10];
		rezultat[0] = new Rezultat("E1 01/11", "Srđanov Konstantin", "PR01", "Matematika", 88, 89, 88.5, 9);
		rezultat[1] = new Rezultat("E1 01/11", "Srđanov Konstantin", "PR02", "Fizika", 85, 55, 70, 7);
		rezultat[2] = new Rezultat("E1 02/12", "Baki Strahinja", "PR02", "Fizika", 80, 45, 62.5, 5);
		rezultat[3] = new Rezultat("E1 03/13", "Trajković Nebojša", "PR01", "Matematika", 94, 96, 95, 10);
		rezultat[4] = new Rezultat("E2 01/11", "Sekulić Miloš", "PR01", "Matematika", 83, 88, 85.5, 9);
		rezultat[5] = new Rezultat("E2 01/11", "Sekulić Miloš", "PR03", "Elektrotehnika", 89, 91, 90, 9);
		rezultat[6] = new Rezultat("E2 01/11", "Sekulić Miloš", "PR04", "Informatika", 100, 98, 99, 10);
		rezultat[7] = new Rezultat("E2 02/12", "Askin Vuk", "PR02", "Fizika", 45, 47, 46, 5);
		rezultat[8] = new Rezultat("E2 02/12", "Askin Vuk", "PR03", "Elektrotehnika", 56, 55, 55.5, 6);
		rezultat[9] = new Rezultat("E2 03/13", "Klainić Marko", "PR03", "Elektrotehnika", 25, 0, 25, 5);
		
		ispisiPredmete(predmeti);
		System.out.println();
		ispisiRezultate(rezultat);
		
	}

}

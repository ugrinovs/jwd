
public class zadatak {
	public static void main(String args[]){
		float tezinaPaketa = 10.5f;
		String posiljaocIme = "Stefan";
		String posiljaocPrezime = "Ugrinov";
		String posiljaocAdresa = "Kotorska 73/a";
		String primaocIme = "Petar";
		String primaocPrezime = "Petrovic";
		String primaocAdresa = "Jevrejska 55";
		String preporuceno = "Da";
		System.out.println("Posiljaoc " + posiljaocIme + " " + posiljaocPrezime + ", " + posiljaocAdresa + ", salje paket primaocu: "
				+ " " + primaocIme + " " + primaocPrezime + ", " + primaocAdresa + ".");
		System.out.println("Tezina paketa je: " + tezinaPaketa + " kg.");
		System.out.println("Poslati preporuceno: "+ preporuceno + ".");
	}
}

package rs.ac.uns.ftn.informatika.dosk.java.vezbe02.primer01;

public class FormatizovaniIspis {

	public static void main(String[] args) {

		//formatizovani ispis na ekran
		System.out.printf("Ispis celog broja %d \n", 10);
		System.out.printf("Ispis karaktera %c \n", 'A');
		System.out.printf("Ispis karaktera %c \n", 66);
		System.out.printf("Ispis razlomljenog broja %f \n", 3.13);
		System.out.printf("Ispis razlomljenog broja preciznosti 2 decimale %5.2f \n\n", 3.123456789);
		
		System.out.println("Ispis vise atributa");
		System.out.printf("%d,   %c,   %f 	%s \n\n", 10, 'A', 3.13, "ABCD");
		
		System.out.println("Poravnjanja");
		System.out.printf("%10d \n", 1);
		System.out.printf("%10d \n", 100);
		System.out.printf("%-10d\n", 100);
		System.out.printf("%10d \n", 1000000);
	}

}

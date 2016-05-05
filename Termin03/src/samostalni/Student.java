package samostalni;

public class Student {

	String indeks;
	String imeIPrezime;
	
	public Student(String indeks, String imeIPrezime) {
		this.indeks = indeks;
		this.imeIPrezime = imeIPrezime;
	}

	public Student() {
	}
	
	public Student(Student student) {
		indeks = student.indeks;
		imeIPrezime = student.imeIPrezime;
	}
	
}

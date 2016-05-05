FTN / Katedra za informatiku
Kurs iz Jave, 2014.
=================================

1. Opis vežbe
-------------------
Upoznavanje sa funkcijama, osnovnim konceptima objektno orijentisanog programiranja u Javi, klasom Math,
vrstama kolekcija i klasom ArrayList u Javi, ključna reč static, Klasa Object, metode toString i equals. 

2. Sadržaj vežbe
-------------------
Rad sa funkcijama,
Klase, atributi, metode, definisanje prava pristupa za atibute i metode,
Kolekcije - Liste
Stički i nestatički atributi i metode.
Object - equals, hashCode, toString, getClass, redefinisanje metoda za postojeće klase.

3. Literatura
-------------------
materijali/slajdovi03.pdf
materijali/vezba03.pdf

4. Primeri
-------------------

primer01 - Klase, atributi, metode, predefinisane vrednosti atributa, null literal  
primer02 - Nizovi referenca na objekte, Atributi koji nisu primitivni tipovi 
	tj. atributi koji sadrze referencu ka drugim objektima 
primer03 - prava pristupa, get i set metode 
primer04 - Konstruktori
primer05 - Zamena niz objekata sa listom objekata, rad sa klasom ArrayList, tipizirane i netipizirane liste
primer06 - statički atributi i metode

5. Zadatak na času
-------------------
Zad01
Po ugledu na kalsu Student napraviti klasu predmet.
Podaci za predmet su šifra predmeta, naziv, broj ESBP poena koje nosi predmet.
Obezbediti da su svi atributi zaštićeni, da postoje više konstuktora 
(bez parametara, parametri koji su atributi klase, referenca na objekat), 
metode vratiTekstualnuReprezentacijuZaIspis(), isti(Predmet pred) i set/get metode za atibute klase.
Identifikator (jedinstvena vrednost) predmeta je šifra predmeta.
Napraviti test klasu za rad sa predmetima. Lista predmeta se kreira i ispisuje.
Test podatke preuzeti (prekopirati) iz fajla predmeti.csv.

Zad02
Modelovati entitet Rezultat ispita. 
Rezultat ispita su opisani poljima indeks studenta, ime i prezime studenta, sifra predmeta, naziv predmeta,
broj bodova na teoriji, broj bodova na prakticnom delu ispita, prosecan broj bodova i konacna ocena.
Obezbediti da su svi atributi zaštićeni, da postoje više konstuktora 
(bez parametara, parametri koji su atributi klase, referenca na objekat), 
metode vratiTekstualnuReprezentacijuZaIspis(), isti(Predmet pred) i set/get metode za atibute klase.
Sta bi bio Identifikator (jedinstvena vrednost) Rezultat ispita?
Napraviti test klasu. Test podatke preuzeti (prekopirati) iz fajla rezultati.csv.

Da li bi moglo da se napravi veza između Rezultat ispita i Studenta i Predmeta?
Ako mislite da je moguce, izmeniti klasu Rezultat ispita tako da sadrzi atrubut student tipa Student i predmet tipa Predmet,
a iz klase se uklanjaju atributi indeks studenta, ime i prezime studenta, sifra predmeta, naziv predmeta.
Izmeni metode vratiTekstualnuReprezentacijuZaIspis() i isti(RezultatIspita rez).

6. Domaći zadatak
-------------------
Dom01
Modelovati entitet Profesor. Podaci za profesora su JMBG, ime i prezime, grad, zvanje, plata, predmet na kome je angazovan.
Obezbediti da su svi atributi zaštićeni, da postoje više konstuktora 
(bez parametara, parametri koji su atributi klase, referenca na objekat), 
metode vratiTekstualnuReprezentacijuZaIspis(), isti(Predmet pred) i set/get metode za atibute klase. 
Identifikator (jedinstvena vrednost) profesora je JMBG.
Napraviti test klasu. Test podatke preuzeti (prekopirati) iz fajla profesori.csv.

Dom02
Modelovati entitet Artikal. Napraviti test klasu za rad sa artiklima. Lista artikla se kreira i ispisuje.  
Napraviti test klasu. Test podaci su:
s01|Coko plazma|Bambi|85.30|akcija
s02|Smoki|Stark|55.00|nije na akciji
s03|Cipsi|Marbo|115.20|nije na akciji
s04|Krem Bananica|Stark|11.00|akcija

Dom03
Modelira se košarkaški savez.
•	Klub ima svoju šifru i naziv. U klubu igra više igrača, a ne mora da igra ni jedan.
•	Igrač ima svoju šifru, ime i prezime. Igrač igra u tačno jednom klubu.
•	Sudija ima svoju šifru, ime i prezime.
•	Klub igra utakmicu sa drugim klubom. Za svaku utakmicu se zna datum i vreme odigravanja, klub koji je bio domacin, 
		klub koji je bio gost, broj koseva koje su postigli domaćin i gost i sudije koje su sudile utakmicu.
		Svaka utakmica između dva kluba ima svoju šifru. 
		Jednu utakmicu može da sudi više sudija, a mora da sudi bar jedan.
		Klub kao domaćin može da igra sa više klubova, a ne mora ni sa jednim. 
		Klub kao gost može da igra sa više klubova, a ne mora da igra ni sa jednim.
		
Napraviti test klasu za evidenciju utakmica. 
Klasa sadrži liste klubova, igrača, sudija i utakmica.
Po popunjavanju lista ispisati sve klubove i njihove igrace, sve sudije i sve utakmice. 

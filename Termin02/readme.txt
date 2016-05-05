FTN / Katedra za informatiku
Kurs iz Jave, 2014.
=================================

1. Opis vežbe
-------------------
Upoznavanje sa naredbama za kontrolu toka programa, 
nizovima, formatima ispisa, upoznavanje sa funkcijama

2. Sadržaj vežbe
-------------------
formatizovani ispis na ekran,
kontrola toka programa, switch, for, while, break, continue, 
nizovi – jednodimenzionalni i višedimenzionalni, čitanje args main metode, 
ispis i obrada nizova kroz for petlju,
rad sa funkcijama


3. Literatura
-------------------
materijali/slajdovi02.pdf
materijali/vezba02.pdf

4. Primeri
-------------------
primer01 - Formatizovani ispis primitivnih tipova na ekran
primer02 - Kontrola toka programa
primer03 - Nizovi
primer04 - Kreiranje funkcije koja računa hipotenuzu pravouglog trougla.

5. Zadatak na času
-------------------
Korišenjem for petlje prebrojati koliko četvrtina ima izmedju broja -1 i 1.5. 
Ispisati odgovarajucu poruku na ekran

6. Zadatak na času
-------------------
Pronaći maksimalni element niza 10, 4, 6, 11, 15, 2 

7. Zadatak na času
-------------------
Implementirati aplikaciju koja će za kupljene artikle omogućiti prikaz fiskalnog isečka (računa).
Na računu prvo ispisati ime prodavnice (npr. Megamarket Metro), a zatim stavke računa. Na kraju računa ispisati ukupnu cena bez pdv-a i sa pdv-om (pdv 20%).

Ime prodavnice se prosledjuje prilikom pokretanja programa kroz args main metode.
Staka rečuna definisana sa nazivom artikla, količinom, cenom po komadu.

Ukupna cena se računa, a ostalo je skladišteno pomoću lokalnih promenljivih tipa niz.

8. Domaći zadatak
-------------------
Ispisati sve neparne brojeve do broja 13

9. Domaći zadatak
-------------------
Ispisati sve parne brojeve do broja 15 do broja 19

10. Domaći zadatak
-------------------
Proširiti zadatak sa časa tako da postoji i informacija o tome u čemu je izražena količina (kilogramima, litrima, komadima).
Neki artikli mogu biti na akciji od 10%. 
Neki proizvodi imaju 10%, a neki 20% pdv-a, a neki su oslobođeni pdv-a.
Prilikom obračuna ukupne cene (bez pdv-a i sa pdv-om) voditi računa o akcijama i različitim stopama pdv-a.

10. Domaći zadatak
-------------------
U xls fajlu rasporedKolizije prikazana je inicijalna verzija rasporeda predavanja. 
Raspored sadrzi kolizije koje se ogledaju u preklapanju zauzeća kabineta, preklapanju angazmana predavaca.
Potrebno je detektovati i ispisati sve kolizije ako je pretpostavka da su termini sortirani po početku održavanja. 
1. Sve kolizije preklapanja zauzeća kabineta
2. Sve kolizije preklapanja zauzeća predavaca
3. Sve kolizije preklapanja zauzeća predavaca (Voditi računa da između termina predavanja mora postojati 15 minuta pauze)
4. Sve kolizije preklapanja zauzeća predavaca ako se razmatra i kartica SIT - Lozica, pri čemu put Novi Sad - Loznica traje 3 h

Za kreiranje zadatka koristiti matrice.
Sugestija: Vrste neka predstavljau dane u nedelji, dok će kolone predstavljati termin u rasporedu. 
Termin u rasporedu mogao bi se opisati osmorkom u fomratu: Kabinet, Predavac, odSati, odMinuta, doSati, doMinuta, Predmet, Mesto
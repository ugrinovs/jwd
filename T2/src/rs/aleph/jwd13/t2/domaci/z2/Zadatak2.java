package rs.aleph.jwd13.t2.domaci.z2;

public class Zadatak2 {
	public static void main(String[] args){
		String [][] Ponedeljak = {
				{"7", "0", "8", "30", "Zeljko Vukovic", "Internet Mreze", "L6", "Novi Sad"},
				{"9", "45", "11", "15", "Zeljko Vukovic", "Internet Mreze", "MI2", "Novi Sad"},
				{"17", "30", "19", "0", "Sinisa Nikolic", "Internet Mreze", "L6", "Novi Sad"},
				{"17", "30", "20", "0", "Aleksandar Kaplar", "Web Programiranje", "PC6", "Novi Sad"},
				{"9", "45", "10", "15", "Sinisa Nikolic", "Sistemi bazirani na znanju", "PC5", "Novi Sad"},
				{"15", "15", "17", "45", "Sinisa Nikolic", "Sistemi bazirani na znanju", "PC5", "Novi Sad"},
				{"9", "0", "11", "45", "Aleksandar Kaplar", "Web Programiranje", "K1", "Loznica"},
				{"12", "15", "15", "0", "Aleksandar Kaplar", "Web Programiranje", "K1", "Loznica"}
		};
		String [][] Utorak = {
				{"10", "30", "12", "0", "Zeljko Vukovic", "Internet Mreze", "MI2", "Novi Sad"},
				{"9", "45", "11", "15", "Zeljko Vukovic", "Internet Mreze", "MI2", "Novi Sad"},
				{"14", "15", "16", "0", "Segedinac Milan", "XML i Web Servisi", "PCA", "Novi Sad"},
				{"16", "10", "17", "30", "Segedinac Milan", "Web Programiranje", "PC3", "Novi Sad"}
		};
		String [][] Sreda = {
				{"12", "30", "16", "0", "Sinisa Nikolic", "Objektno Programiranje", "L6", "Novi Sad"},
				{"7", "0", "8", "30", "Sinisa Nikolic", "Internet Mreze", "L3", "Novi Sad"},
				{"10", "30", "12", "0", "Zeljko Vukovic", "Internet Mreze", "MI2", "Novi Sad"},
				{"10", "30", "12", "0", "Sinisa Nikolic", "Internet Mreze", "L3", "Novi Sad"},
				{"11", "30", "13", "0", "Zeljko Vukovic", "Internet Mreze", "MI2", "Novi Sad"},
				{"14", "0", "15", "30", "Zeljko Vukovic", "Internet Mreze", "L6", "Novi Sad"},
		};
		System.out.println("\n-----------------------------------------Ponedeljak-----------------------------------------\n");
		System.out.printf("%-6s %5s %5s %5s %5s %-26s %-26s %-7s %-26s\n", "Termin", "OdSat", "OdMin", "DoSat", "DoMin", "Ime i Prezime", "Predmet", "Kabinet", "Mesto");
		for(int i = 0; i < Ponedeljak.length; i++){
			System.out.printf("%6d ", i+1);
			for(int j = 0; j < Ponedeljak[i].length; j++){
				if(j == 0 || j == 1 || j == 2 || j == 3)
					System.out.printf("%5s ", Ponedeljak[i][j]);
				else if( j == 6){
					System.out.printf("%7s ", Ponedeljak[i][j]);
				}
				else
					System.out.printf("%-26s ", Ponedeljak[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("\n-------------------------------------------Utorak-------------------------------------------\n");
		System.out.printf("%-6s %5s %5s %5s %5s %-26s %-26s %-7s %-26s\n", "Termin", "OdSat", "OdMin", "DoSat", "DoMin", "Ime i Prezime", "Predmet", "Kabinet", "Mesto");
		for(int i = 0; i < Utorak.length; i++){
			System.out.printf("%6d ", i+1);
			for(int j = 0; j < Utorak[i].length; j++){
				if(j == 0 || j == 1 || j == 2 || j == 3)
					System.out.printf("%5s ", Utorak[i][j]);
				else if( j == 6){
					System.out.printf("%7s ", Utorak[i][j]);
				}
				else
					System.out.printf("%-26s ", Utorak[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("\n-------------------------------------------Sreda--------------------------------------------\n");
		System.out.printf("%-6s %5s %5s %5s %5s %-26s %-26s %-7s %-26s\n", "Termin", "OdSat", "OdMin", "DoSat", "DoMin", "Ime i Prezime", "Predmet", "Kabinet", "Mesto");
		for(int i = 0; i < Sreda.length; i++){
			System.out.printf("%6d ", i+1);
			for(int j = 0; j < Sreda[i].length; j++){
				if(j == 0 || j == 1 || j == 2 || j == 3)
					System.out.printf("%5s ", Sreda[i][j]);
				else if( j == 6){
					System.out.printf("%7s ", Sreda[i][j]);
				}
				else
					System.out.printf("%-26s ", Sreda[i][j]);
			}
			System.out.println();
		}
		// ISPISI PONEDELJAK PREKLAPANJA ZA SATNICU I PROFESORE
		System.out.println("\n-----------------------------------------Ponedeljak-----------------------------------------\n");
		
		for(int i = 0; i < Ponedeljak.length-1;i++){
			for(int j = i+1; j < Ponedeljak.length; j++){
				int tempOd1 = Integer.parseInt(Ponedeljak[i][0]);
				int tempOd2 = Integer.parseInt(Ponedeljak[j][0]);
				int tempDo1 = Integer.parseInt(Ponedeljak[i][2]);
				int tempDo2 = Integer.parseInt(Ponedeljak[j][2]);
				if(Ponedeljak[i][4] == Ponedeljak[j][4])
					if(Math.abs(tempOd1 - tempDo2) <= 1 && Math.abs(tempOd1 - tempDo2) >= 0){
						int proveriSat = Math.abs(tempOd1 - tempDo2);
						if(proveriSat == 1){
							if(tempOd1 > tempDo2){
								int tempOdMin = Integer.parseInt(Ponedeljak[i][1]);
								int tempDoMin = Integer.parseInt(Ponedeljak[j][3]);
								if((tempOdMin >= 45 && tempDoMin <= 15) && (60 - tempOdMin + tempDoMin) <= 15){
									System.out.println("Ovaj profesor ne moze da stigne na predavanje! " + Ponedeljak[j][4]);
								}
							}
							else if(tempOd1 < tempDo2){
								int tempOdMin = Integer.parseInt(Ponedeljak[i][1]);
								int tempDoMin = Integer.parseInt(Ponedeljak[j][3]);
								if(tempDo1 > tempDo2){
									System.out.println("Ovaj profesor ne moze da stigne na predavanje! " + Ponedeljak[j][4]);
								}
								else if((tempDoMin >= 45 && tempOdMin <= 15) && (60 - tempDoMin + tempOdMin) <= 15){
									System.out.println("Ovaj profesor ne moze da stigne na predavanje! " + Ponedeljak[j][4]);
								}
							}
						}
						else if(proveriSat == 0){
							int tempOdMin = Integer.parseInt(Ponedeljak[i][1]);
							int tempDoMin = Integer.parseInt(Ponedeljak[j][3]);
							if(tempOdMin > tempDoMin){
								int proveriMinute = tempOdMin - tempDoMin;
								if(proveriMinute < 15)
									System.out.println("Ovaj profesor ne moze da stigne na predavanje! " + Ponedeljak[j][4]);
							}
							else if(tempOdMin < tempDoMin){
									System.out.println("Ovom profesoru se preklapa termin! " + Ponedeljak[j][4]);
							}
						}
					}
					else if(Math.abs(tempOd2 - tempDo1) <= 1 && Math.abs(tempOd2 - tempDo1) >= 0){
						int proveriSat = Math.abs(tempOd2 - tempDo1);
						if(proveriSat == 1){
							if(tempOd2 > tempDo1){
								int tempOdMin = Integer.parseInt(Ponedeljak[j][1]);
								int tempDoMin = Integer.parseInt(Ponedeljak[i][3]);
								if( (tempDoMin >= 45 && tempOdMin <= 15) && ((60 - tempDoMin + tempOdMin) < 15)){
									System.out.println("Ovaj profesor ne moze da stigne na predavanje! " + Ponedeljak[j][4]);
								}
							}
							else if(tempOd2 < tempDo1){
								int tempOdMin = Integer.parseInt(Ponedeljak[j][1]);
								int tempDoMin = Integer.parseInt(Ponedeljak[i][3]);
								int proveriMinute = 60 - tempOdMin + tempDoMin;
								if(tempDo2 > tempDo1){
									System.out.println("Ovaj profesor ne moze da stigne na predavanje! " + Ponedeljak[j][4]);
								}
								else if( (tempOdMin >= 45 && tempDoMin <= 15) && proveriMinute < 15){
									System.out.println("Ovaj profesor ne moze da stigne na predavanje! " + Ponedeljak[j][4]);
								}
							}
						}
						else if(proveriSat == 0){
							int tempOdMin = Integer.parseInt(Ponedeljak[j][1]);
							int tempDoMin = Integer.parseInt(Ponedeljak[i][3]);
							if(tempOdMin > tempDoMin){
								int proveriMinute = tempOdMin - tempDoMin;
								if(proveriMinute < 15)
									System.out.println("Ovaj profesor ne moze da stigne na predavanje! " + Ponedeljak[j][4]);
							}
							else if(tempOdMin < tempDoMin){
								System.out.println("Ovom profesoru se preklapa termin! " + Ponedeljak[j][4]);
							}	
						}
					}
			
			}
		}
		// PONEDELJAK ZA KABINET I SATNICE
System.out.println("\n------------------------------------Ponedeljak KABINET--------------------------------------\n");
		
		for(int i = 0; i < Ponedeljak.length-1;i++){
			for(int j = i+1; j < Ponedeljak.length; j++){
				int tempOd1 = Integer.parseInt(Ponedeljak[i][0]);
				int tempOd2 = Integer.parseInt(Ponedeljak[j][0]);
				int tempDo1 = Integer.parseInt(Ponedeljak[i][2]);
				int tempDo2 = Integer.parseInt(Ponedeljak[j][2]);
				if(Ponedeljak[i][6] == Ponedeljak[j][6])
					if(Math.abs(tempOd1 - tempDo2) <= 1 && Math.abs(tempOd1 - tempDo2) >= 0){
						int proveriSat = Math.abs(tempOd1 - tempDo2);
						if(proveriSat == 1){
							if(tempOd1 > tempDo2){
								int tempOdMin = Integer.parseInt(Ponedeljak[i][1]);
								int tempDoMin = Integer.parseInt(Ponedeljak[j][3]);
								if((tempOdMin >= 45 && tempDoMin <= 15) && (60 - tempOdMin + tempDoMin) <= 15){
									System.out.println("Ovaj profesor ne moze da stigne na predavanje! " + Ponedeljak[j][4]);
								}
							}
							else if(tempOd1 < tempDo2){
								int tempOdMin = Integer.parseInt(Ponedeljak[i][1]);
								int tempDoMin = Integer.parseInt(Ponedeljak[j][3]);
								if(tempDo1 > tempDo2){
									System.out.println("Ovaj profesor ne moze da stigne na predavanje! " + Ponedeljak[j][4]);
								}
								else if((tempDoMin >= 45 && tempOdMin <= 15) && (60 - tempDoMin + tempOdMin) <= 15){
									System.out.println("Ovaj profesor ne moze da stigne na predavanje! " + Ponedeljak[j][4]);
								}
							}
						}
						else if(proveriSat == 0){
							int tempOdMin = Integer.parseInt(Ponedeljak[i][1]);
							int tempDoMin = Integer.parseInt(Ponedeljak[j][3]);
							if(tempOdMin > tempDoMin){
								int proveriMinute = tempOdMin - tempDoMin;
								if(proveriMinute < 15)
									System.out.println("Ovaj profesor ne moze da stigne na predavanje! " + Ponedeljak[j][4]);
							}
							else if(tempOdMin < tempDoMin){
									System.out.println("Ovom profesoru se preklapa termin! " + Ponedeljak[j][4]);
							}
						}
					}
					else if(Math.abs(tempOd2 - tempDo1) <= 1 && Math.abs(tempOd2 - tempDo1) >= 0){
						int proveriSat = Math.abs(tempOd2 - tempDo1);
						if(proveriSat == 1){
							if(tempOd2 > tempDo1){
								int tempOdMin = Integer.parseInt(Ponedeljak[j][1]);
								int tempDoMin = Integer.parseInt(Ponedeljak[i][3]);
								if( (tempDoMin >= 45 && tempOdMin <= 15) && ((60 - tempDoMin + tempOdMin) < 15)){
									System.out.println("Ovaj profesor ne moze da stigne na predavanje! " + Ponedeljak[j][4]);
								}
							}
							else if(tempOd2 < tempDo1){
								int tempOdMin = Integer.parseInt(Ponedeljak[j][1]);
								int tempDoMin = Integer.parseInt(Ponedeljak[i][3]);
								int proveriMinute = 60 - tempOdMin + tempDoMin;
								if(tempDo2 > tempDo1){
									System.out.println("Ovaj profesor ne moze da stigne na predavanje! " + Ponedeljak[j][4]);
								}
								else if( (tempOdMin >= 45 && tempDoMin <= 15) && proveriMinute < 15){
									System.out.println("Ovaj profesor ne moze da stigne na predavanje! " + Ponedeljak[j][4]);
								}
							}
						}
						else if(proveriSat == 0){
							int tempOdMin = Integer.parseInt(Ponedeljak[j][1]);
							int tempDoMin = Integer.parseInt(Ponedeljak[i][3]);
							if(tempOdMin > tempDoMin){
								int proveriMinute = tempOdMin - tempDoMin;
								if(proveriMinute < 15)
									System.out.println("Ovaj profesor ne moze da stigne na predavanje! " + Ponedeljak[j][4]);
							}
							else if(tempOdMin < tempDoMin){
								System.out.println("Ovom profesoru se preklapa termin! " + Ponedeljak[j][4]);
							}	
						}
					}
			
			}
		}
		
		// PONEDELJAK ZA KABINET I SATNICE
		System.out.println("\n------------------------------------Ponedeljak MESTO--------------------------------------\n");
				
				for(int i = 0; i < Ponedeljak.length-1;i++){
					for(int j = i+1; j < Ponedeljak.length; j++){
						int tempOd1 = Integer.parseInt(Ponedeljak[i][0]);
						int tempOd2 = Integer.parseInt(Ponedeljak[j][0]);
						int tempDo1 = Integer.parseInt(Ponedeljak[i][2]);
						int tempDo2 = Integer.parseInt(Ponedeljak[j][2]);
						if(Ponedeljak[i][4] == Ponedeljak[j][4] && Ponedeljak[i][7] != Ponedeljak[j][7]){
							if(Math.abs(tempOd1 - tempDo2) <= 3){
								System.out.println("Ovaj burazer ne moze da stigne " + Ponedeljak[j][4]);
							}
							else if(Math.abs(tempOd2 - tempDo1) <= 3){
								System.out.println("Ovaj burazer ne moze da stigne " +  Ponedeljak[j][4]);
							}
						}
					}
				}
		
		// ISPISI UTORAK SATNICE I PROFESORE
		System.out.println("\n-----------------------------------------Utorak-----------------------------------------\n");
		
		for(int i = 0; i < Utorak.length-1;i++){
			for(int j = i+1; j < Utorak.length; j++){
				int tempOd1 = Integer.parseInt(Utorak[i][0]);
				int tempOd2 = Integer.parseInt(Utorak[j][0]);
				int tempDo1 = Integer.parseInt(Utorak[i][2]);
				int tempDo2 = Integer.parseInt(Utorak[j][2]);
				if(Utorak[i][4] == Utorak[j][4])
					if(Math.abs(tempOd1 - tempDo2) <= 1 && Math.abs(tempOd1 - tempDo2) >= 0){
						int proveriSat = Math.abs(tempOd1 - tempDo2);
						if(proveriSat == 1){
							if(tempOd1 > tempDo2){
								int tempOdMin = Integer.parseInt(Utorak[i][1]);
								int tempDoMin = Integer.parseInt(Utorak[j][3]);
								if((tempOdMin >= 45 && tempDoMin <= 15) && (60 - tempOdMin + tempDoMin) <= 15){
									System.out.println("Ovaj profesor ne moze da stigne na predavanje! " + Utorak[j][4]);
								}
							}
							else if(tempOd1 < tempDo2){
								int tempOdMin = Integer.parseInt(Utorak[i][1]);
								int tempDoMin = Integer.parseInt(Utorak[j][3]);
								if(tempDo1 > tempDo2){
									System.out.println("Ovaj profesor ne moze da stigne na predavanje! " + Ponedeljak[j][4]);
								}
								else if((tempDoMin >= 45 && tempOdMin <= 15) && (60 - tempDoMin + tempOdMin) <= 15){
									System.out.println("Ovaj profesor ne moze da stigne na predavanje! " + Utorak[j][4]);
								}
							}
						}
						else if(proveriSat == 0){
							int tempOdMin = Integer.parseInt(Utorak[i][1]);
							int tempDoMin = Integer.parseInt(Utorak[j][3]);
							if(tempOdMin > tempDoMin){
								int proveriMinute = tempOdMin - tempDoMin;
								if(proveriMinute < 15)
									System.out.println("Ovaj profesor ne moze da stigne na predavanje! " + Utorak[j][4]);
							}
							else if(tempOdMin < tempDoMin){
									System.out.println("Ovom profesoru se preklapa termin! " + Utorak[j][4]);
							}
						}
					}
					else if(Math.abs(tempOd2 - tempDo1) <= 1 && Math.abs(tempOd2 - tempDo1) >= 0){
						int proveriSat = Math.abs(tempOd2 - tempDo1);
						if(proveriSat == 1){
							if(tempOd2 > tempDo1){
								int tempOdMin = Integer.parseInt(Utorak[j][1]);
								int tempDoMin = Integer.parseInt(Utorak[i][3]);
								if( (tempDoMin >= 45 && tempOdMin <= 15) && ((60 - tempDoMin + tempOdMin) < 15)){
									System.out.println("Ovaj profesor ne moze da stigne na predavanje! " + Utorak[j][4]);
								}
							}
							else if(tempOd2 < tempDo1){
								int tempOdMin = Integer.parseInt(Utorak[j][1]);
								int tempDoMin = Integer.parseInt(Utorak[i][3]);
								int proveriMinute = 60 - tempOdMin + tempDoMin;
								if(tempDo2 > tempDo1){
									System.out.println("Ovaj profesor ne moze da stigne na predavanje! " + Utorak[j][4]);
								}
								else if( (tempOdMin >= 45 && tempDoMin <= 15) && proveriMinute < 15){
									System.out.println("Ovaj profesor ne moze da stigne na predavanje! " + Utorak[j][4]);
								}
							}
						}
						else if(proveriSat == 0){
							int tempOdMin = Integer.parseInt(Utorak[j][1]);
							int tempDoMin = Integer.parseInt(Utorak[i][3]);
							if(tempOdMin > tempDoMin){
								int proveriMinute = tempOdMin - tempDoMin;
								if(proveriMinute < 15)
									System.out.println("Ovaj profesor ne moze da stigne na predavanje! " + Utorak[j][4]);
							}
							else if(tempOdMin < tempDoMin){
								System.out.println("Ovom profesoru se preklapa termin! " + Utorak[j][4]);
							}	
						}
					}
			
			}
		}
		
		//ISPISI UTORAK STANICE I KABINET
System.out.println("\n------------------------------------Utorak KABINET--------------------------------------\n");
		
		for(int i = 0; i < Utorak.length-1;i++){
			for(int j = i+1; j < Utorak.length; j++){
				int tempOd1 = Integer.parseInt(Utorak[i][0]);
				int tempOd2 = Integer.parseInt(Utorak[j][0]);
				int tempDo1 = Integer.parseInt(Utorak[i][2]);
				int tempDo2 = Integer.parseInt(Utorak[j][2]);
				if(Utorak[i][6] == Utorak[j][6])
					if(Math.abs(tempOd1 - tempDo2) <= 1 && Math.abs(tempOd1 - tempDo2) >= 0){
						int proveriSat = Math.abs(tempOd1 - tempDo2);
						if(proveriSat == 1){
							if(tempOd1 > tempDo2){
								int tempOdMin = Integer.parseInt(Utorak[i][1]);
								int tempDoMin = Integer.parseInt(Utorak[j][3]);
								if((tempOdMin >= 45 && tempDoMin <= 15) && (60 - tempOdMin + tempDoMin) <= 15){
									System.out.println("Ovaj profesor ne moze da stigne na predavanje! " + Utorak[j][4]);
								}
							}
							else if(tempOd1 < tempDo2){
								int tempOdMin = Integer.parseInt(Utorak[i][1]);
								int tempDoMin = Integer.parseInt(Utorak[j][3]);
								if(tempDo1 > tempDo2){
									System.out.println("Ovaj profesor ne moze da stigne na predavanje! " + Ponedeljak[j][4]);
								}
								else if((tempDoMin >= 45 && tempOdMin <= 15) && (60 - tempDoMin + tempOdMin) <= 15){
									System.out.println("Ovaj profesor ne moze da stigne na predavanje! " + Utorak[j][4]);
								}
							}
						}
						else if(proveriSat == 0){
							int tempOdMin = Integer.parseInt(Utorak[i][1]);
							int tempDoMin = Integer.parseInt(Utorak[j][3]);
							if(tempOdMin > tempDoMin){
								int proveriMinute = tempOdMin - tempDoMin;
								if(proveriMinute < 15)
									System.out.println("Ovaj profesor ne moze da stigne na predavanje! " + Utorak[j][4]);
							}
							else if(tempOdMin < tempDoMin){
									System.out.println("Ovom profesoru se preklapa termin! " + Utorak[j][4]);
							}
						}
					}
					else if(Math.abs(tempOd2 - tempDo1) <= 1 && Math.abs(tempOd2 - tempDo1) >= 0){
						int proveriSat = Math.abs(tempOd2 - tempDo1);
						if(proveriSat == 1){
							if(tempOd2 > tempDo1){
								int tempOdMin = Integer.parseInt(Utorak[j][1]);
								int tempDoMin = Integer.parseInt(Utorak[i][3]);
								if( (tempDoMin >= 45 && tempOdMin <= 15) && ((60 - tempDoMin + tempOdMin) < 15)){
									System.out.println("Ovaj profesor ne moze da stigne na predavanje! " + Utorak[j][4]);
								}
							}
							else if(tempOd2 < tempDo1){
								int tempOdMin = Integer.parseInt(Utorak[j][1]);
								int tempDoMin = Integer.parseInt(Utorak[i][3]);
								int proveriMinute = 60 - tempOdMin + tempDoMin;
								if(tempDo2 > tempDo1){
									System.out.println("Ovaj profesor ne moze da stigne na predavanje! " + Utorak[j][4]);
								}
								else if( (tempOdMin >= 45 && tempDoMin <= 15) && proveriMinute < 15){
									System.out.println("Ovaj profesor ne moze da stigne na predavanje! " + Utorak[j][4]);
								}
							}
						}
						else if(proveriSat == 0){
							int tempOdMin = Integer.parseInt(Utorak[j][1]);
							int tempDoMin = Integer.parseInt(Utorak[i][3]);
							if(tempOdMin > tempDoMin){
								int proveriMinute = tempOdMin - tempDoMin;
								if(proveriMinute < 15)
									System.out.println("Ovaj profesor ne moze da stigne na predavanje! " + Utorak[j][4]);
							}
							else if(tempOdMin < tempDoMin){
								System.out.println("Ovom profesoru se preklapa termin! " + Utorak[j][4]);
							}	
						}
					}
			
			}
		}
		
		//ISPISI SREDU SATNICE I PROFESORE
		System.out.println("\n-----------------------------------------Sreda-----------------------------------------\n");
		
		for(int i = 0; i < Sreda.length-1;i++){
			for(int j = i+1; j < Sreda.length; j++){
				int tempOd1 = Integer.parseInt(Sreda[i][0]);
				int tempOd2 = Integer.parseInt(Sreda[j][0]);
				int tempDo1 = Integer.parseInt(Sreda[i][2]);
				int tempDo2 = Integer.parseInt(Sreda[j][2]);
				if(Sreda[i][4] == Sreda[j][4])
					if(Math.abs(tempOd1 - tempDo2) <= 1 && Math.abs(tempOd1 - tempDo2) >= 0){
						int proveriSat = Math.abs(tempOd1 - tempDo2);
						if(proveriSat == 1){
							if(tempOd1 > tempDo2){
								int tempOdMin = Integer.parseInt(Sreda[i][1]);
								int tempDoMin = Integer.parseInt(Sreda[j][3]);
								if((tempOdMin >= 45 && tempDoMin <= 15) && (60 - tempOdMin + tempDoMin) <= 15){
									System.out.println("Ovaj profesor ne moze da stigne na predavanje! " + Sreda[j][4]);
								}
							}
							else if(tempOd1 < tempDo2){
								int tempOdMin = Integer.parseInt(Sreda[i][1]);
								int tempDoMin = Integer.parseInt(Sreda[j][3]);
								if(tempDo1 > tempDo2){
									System.out.println("Ovaj profesor ne moze da stigne na predavanje! " + Sreda[j][4]);
								}
								else if((tempDoMin >= 45 && tempOdMin <= 15) && (60 - tempDoMin + tempOdMin) <= 15){
									System.out.println("Ovaj profesor ne moze da stigne na predavanje! " + Sreda[j][4]);
								}
							}
						}
						else if(proveriSat == 0){
							int tempOdMin = Integer.parseInt(Sreda[i][1]);
							int tempDoMin = Integer.parseInt(Sreda[j][3]);
							if(tempOdMin > tempDoMin){
								int proveriMinute = tempOdMin - tempDoMin;
								if(proveriMinute < 15)
									System.out.println("Ovaj profesor ne moze da stigne na predavanje! " + Sreda[j][4]);
							}
							else if(tempOdMin < tempDoMin){
									System.out.println("Ovom profesoru se preklapa termin! " + Sreda[j][4]);
							}
						}
					}
					else if(Math.abs(tempOd2 - tempDo1) <= 1 && Math.abs(tempOd2 - tempDo1) >= 0){
						int proveriSat = Math.abs(tempOd2 - tempDo1);
						if(proveriSat == 1){
							if(tempOd2 > tempDo1){
								int tempOdMin = Integer.parseInt(Sreda[j][1]);
								int tempDoMin = Integer.parseInt(Sreda[i][3]);
								if( (tempDoMin >= 45 && tempOdMin <= 15) && ((60 - tempDoMin + tempOdMin) < 15)){
									System.out.println("Ovaj profesor ne moze da stigne na predavanje! " + Sreda[j][4]);
								}
							}
							else if(tempOd2 < tempDo1){
								int tempOdMin = Integer.parseInt(Sreda[j][1]);
								int tempDoMin = Integer.parseInt(Sreda[i][3]);
								int proveriMinute = 60 - tempOdMin + tempDoMin;
								if(tempDo2 > tempDo1){
									System.out.println("Ovaj profesor ne moze da stigne na predavanje! " + Sreda[j][4]);
								}
								else if( (tempOdMin >= 45 && tempDoMin <= 15) && proveriMinute < 15){
									System.out.println("Ovaj profesor ne moze da stigne na predavanje! " + Sreda[j][4]);
								}
							}
						}
						else if(proveriSat == 0){
							int tempOdMin = Integer.parseInt(Sreda[j][1]);
							int tempDoMin = Integer.parseInt(Sreda[i][3]);
							if(tempOdMin > tempDoMin){
								int proveriMinute = tempOdMin - tempDoMin;
								if(proveriMinute < 15)
									System.out.println("Ovaj profesor ne moze da stigne na predavanje! " + Sreda[j][4]);
							}
							else if(tempOdMin < tempDoMin){
								System.out.println("Ovom profesoru se preklapa termin! " + Sreda[j][4]);
							}	
						}
					}
			
			}
		}
		
		// SATNICE I KABINET SREDA
System.out.println("\n------------------------------------Sreda KABINET--------------------------------------\n");
		
		for(int i = 0; i < Sreda.length-1;i++){
			for(int j = i+1; j < Sreda.length; j++){
				int tempOd1 = Integer.parseInt(Sreda[i][0]);
				int tempOd2 = Integer.parseInt(Sreda[j][0]);
				int tempDo1 = Integer.parseInt(Sreda[i][2]);
				int tempDo2 = Integer.parseInt(Sreda[j][2]);
				if(Sreda[i][6] == Sreda[j][6])
					if(tempOd1 < tempDo2){
								int tempOdMin = Integer.parseInt(Sreda[i][1]);
								int tempDoMin = Integer.parseInt(Sreda[j][3]);
								if(tempDo1 > tempDo2){
									System.out.println("Ovaj profesor ne moze da stigne na predavanje! " + Sreda[j][4]);
								}
								else if((tempDoMin >= 45 && tempOdMin <= 15) && (60 - tempDoMin + tempOdMin) <= 15){
									System.out.println("Ovaj profesor ne moze da stigne na predavanje! " + Sreda[j][4]);
								}
							}
					
					}
					
			
			}
		
		
	}
}
	


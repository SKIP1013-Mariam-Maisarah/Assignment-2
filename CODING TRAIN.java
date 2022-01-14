package assignment2;

import java.util.Scanner;

public class PurchasingTicketSystem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		double norSAdultSPKL = 64.50;
		double norSAdultPBG = 101;
		double norSAdultIAOR = 42.50;
		
		double norSChild, norSStud, norSOKU, norSSenior;
		double hotSAdult, hotSChild, hotSStud, hotSOKU, hotSSenior;
		double cafeSAdult, cafeSChild, cafeSStud, cafeSOKU, cafeSSenior;
		double totalnorSAdult, totalnorSChild, totalnorSStud, totalnorSOKU, totalnorSSenior;
		double totalhotSAdult, totalhotSChild, totalhotSStud, totalhotSOKU, totalhotSSenior;
		double totalcafeSAdult, totalcafeSChild, totalcafeSStud, totalcafeSOKU, totalcafeSSenior;
		double sst = 0.06;
		double tax;
		double sum;
		double subtotal;
		double earlyBal = 700;
		double finalBal;
		
		int i = 0;
		int norSAdultQuan, norSChildQuan, norSStudQuan, norSOKUQuan, norSSeniorQuan;
		int hotSAdultQuan, hotSChildQuan, hotSStudQuan, hotSOKUQuan, hotSSeniorQuan;
		int cafeSAdultQuan, cafeSChildQuan, cafeSStudQuan, cafeSOKUQuan, cafeSSeniorQuan;
	
		String date = "15/01/2022";
		String time = "4:30 p.m.";
		String orderID = "301221003";
		String category1 = "ADULT PASSENGER";
		String category2 = "CHILD PASSENGER";
		String category3 = "STUDENT PASSENGER";
		String category4 = "DISABLED PASSENGER";
		String category5 = "SENIOR PASSENGER";
		String seatType1 = "NORMAL SEAT";
		String seatType2 = "HOT SEAT";
		String seatType3 = "CAFETERIA SEAT";
		String payMethod = "Malaysia Railways e-Wallet";
		String pin;
		String userName;
		String Name;
		String depSt; 
		String destSt;
	

		System.out.println("\n                                               Welcome to Malaysia Railways                                            ");
		System.out.println("                                                Purchasing Ticket System!                                                ");
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		System.out.println(" ");

		
		System.out.print("Please enter your name: ");
		Name = input.nextLine();
		
		System.out.print("Please enter your username: ");
		userName = input.nextLine();
        
        System.out.print("Please enter your PIN number : ");
        pin = input.nextLine();
        
        if (userName.equals("asyraafdanial02") && pin.equals("284368"))
        {
        	System.out.println("Welcome back " + Name + "!");
        }
        else 
        {
            for ( i = 1 ; i<= 3 ; i++) 
            {
            	System.out.println("Wrong user name or Pin Number!");
            	System.out.print("Please enter your username again: ");
        		userName = input.nextLine();
            	System.out.print("Please enter your PIN number again : ");
                pin = input.nextLine();
            }
            System.out.println ("Tries exceed limit! You are not allowed to log in!");
            System.exit(0);
        } 
		
		System.out.println(" ");
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		System.out.println(" ");
		
		System.out.println("Where do you want to go, "+ Name + "?");
		System.out.print("Departure Station: ");
		depSt = input.nextLine();
		System.out.print("Destination Station: ");
		destSt = input.nextLine();
		
		System.out.println(" ");
		System.out.println("You have selected to depart at " + depSt + " Station and arrive at " + destSt + " Station.");
		System.out.println(" ");
		
		if (depSt.equals("SUNGAI PETANI") && destSt.equals("KL SENTRAL"))
		{
			hotSAdult = (norSAdultSPKL * 110) / 100;
			cafeSAdult = (norSAdultSPKL * 115) / 100;
			
			norSChild = (norSAdultSPKL * 90) / 100;
			hotSChild = (hotSAdult * 90) / 100;
			cafeSChild = (cafeSAdult * 90) / 100;
			
			norSStud = (norSAdultSPKL * 80) / 100;
			hotSStud = (hotSAdult * 80) / 100;
			cafeSStud = (cafeSAdult * 80) / 100;
			
			norSOKU = (norSAdultSPKL * 60) / 100;
			hotSOKU = (hotSAdult * 60) / 100;
			cafeSOKU = (cafeSAdult * 60) / 100;
			
			norSSenior = (norSAdultSPKL * 70) / 100;
			hotSSenior = (hotSAdult * 70) / 100;
			cafeSSenior = (cafeSAdult * 70) / 100;
			
			System.out.println("-------------------------------------------------------------------------------------------------------------------------");
			System.out.println(" ");
			System.out.println("                    TICKET PRICE LIST FOR " + depSt + " STATION TO " + destSt + " STATION (EXCLUSIVE SST)                ");
		
			System.out.println("    ________________________________________________________________________________________________________________");
			System.out.println("    |                  |                              |          HOT SEAT           |        CAFETERIA SEAT        |");
			System.out.println("    |    CATEGORIES    |         NORMAL SEAT          |       (EXTRA LEGROOM)       |       (CAFETERIA COACH)      |");
			System.out.println("    |__________________|______________________________|_____________________________|______________________________|");
			System.out.println("    |                  |                              |                             |                              |");
			System.out.printf ("    |      ADULT"           );
			System.out.printf ("       |           RM%.2f" , norSAdultSPKL);
			System.out.printf ("            |          RM%.2f", hotSAdult );
			System.out.printf ("            |           RM%.2f", cafeSAdult );
			System.out.print  ("            |");
			System.out.println("");
			System.out.println("    |                  |                              |                             |                              |");
		
			System.out.printf ("    |      CHILD"           );
			System.out.printf ("       |           RM%.2f" , norSChild);
			System.out.printf ("            |          RM%.2f", hotSChild );
			System.out.printf ("            |           RM%.2f", cafeSChild );
			System.out.print  ("            |");
			System.out.println("");
			System.out.println("    |                  |                              |                             |                              |");
		
			System.out.printf ("    |     STUDENT"    );
			System.out.printf ("      |           RM%.2f" , norSStud);
			System.out.printf ("            |          RM%.2f", hotSStud );
			System.out.printf ("            |           RM%.2f", cafeSStud );
			System.out.print  ("            |");
			System.out.println("");
			System.out.println("    |                  |                              |                             |                              |");
		
			System.out.printf ("    |     DISABLED"     );
			System.out.printf ("     |           RM%.2f" , norSOKU);
			System.out.printf ("            |          RM%.2f", hotSOKU );
			System.out.printf ("            |           RM%.2f", cafeSOKU );
			System.out.print  ("            |");
			System.out.println("");
			System.out.println("    |                  |                              |                             |                              |");
		
			System.out.printf ("    |      SENIOR"          );
			System.out.printf ("      |           RM%.2f" , norSSenior);
			System.out.printf ("            |          RM%.2f", hotSSenior );
			System.out.printf ("            |           RM%.2f", cafeSSenior );
			System.out.print  ("            |");
			System.out.println("");
			System.out.println("    |__________________|______________________________|_____________________________|______________________________|" );
		
			System.out.println("");
			System.out.println("        PLEASE ENTER THE QUANTITY OF TICKETS YOU WANT TO BUY ACCORDING TO THE PASSENGER CATEGORIES AND SEAT TYPES        ");
			System.out.println("");
		
		
			System.out.println(category1);
			System.out.print(seatType1 + ": ");
			norSAdultQuan = input.nextInt();
			System.out.print(seatType2 + ": ");
			hotSAdultQuan = input.nextInt();
			System.out.print(seatType3 + ": ");
			cafeSAdultQuan = input.nextInt();
			System.out.println("");
		
			System.out.println(category2);
			System.out.print(seatType1 + ": ");
			norSChildQuan = input.nextInt();
			System.out.print(seatType2 + ": ");
			hotSChildQuan = input.nextInt();
			System.out.print(seatType3 + ": ");
			cafeSChildQuan = input.nextInt();
			System.out.println("");
		
			System.out.println(category3);
			System.out.print(seatType1 + ": ");
			norSStudQuan = input.nextInt();
			System.out.print(seatType2 + ": ");
			hotSStudQuan = input.nextInt();
			System.out.print(seatType3 + ": ");
			cafeSStudQuan = input.nextInt();
			System.out.println("");
		
			System.out.println(category4);
			System.out.print(seatType1 + ": ");
			norSOKUQuan = input.nextInt();
			System.out.print(seatType2 + ": ");
			hotSOKUQuan = input.nextInt();
			System.out.print(seatType3 + ": ");
			cafeSOKUQuan = input.nextInt();
			System.out.println("");
		
			System.out.println(category5);
			System.out.print(seatType1 + ": ");
			norSSeniorQuan = input.nextInt();
			System.out.print(seatType2 + ": ");
			hotSSeniorQuan = input.nextInt();
			System.out.print(seatType3 + ": ");
			cafeSSeniorQuan = input.nextInt();
			System.out.println("");
		
			totalnorSAdult = norSAdultQuan * norSAdultSPKL;
			totalhotSAdult = hotSAdultQuan * hotSAdult;
			totalcafeSAdult = cafeSAdultQuan * cafeSAdult;
			totalnorSChild = norSChildQuan * norSChild;
			totalhotSChild = hotSChildQuan * hotSChild;
			totalcafeSChild = cafeSChildQuan * cafeSChild;
			totalnorSStud = norSStudQuan * norSStud;
			totalhotSStud = hotSStudQuan * hotSStud;
			totalcafeSStud = cafeSStudQuan * cafeSStud;
			totalnorSOKU = norSOKUQuan * norSOKU;
			totalhotSOKU = hotSOKUQuan * hotSOKU;
			totalcafeSOKU = cafeSOKUQuan * cafeSOKU;
			totalnorSSenior = norSSeniorQuan * norSSenior;
			totalhotSSenior = hotSSeniorQuan * hotSSenior;
			totalcafeSSenior = cafeSSeniorQuan * cafeSSenior;
		
			sum = totalnorSAdult + totalnorSChild + totalnorSStud + totalnorSOKU + totalnorSSenior + totalhotSAdult + totalhotSChild + totalhotSStud + totalhotSOKU + totalhotSSenior + totalcafeSAdult + totalcafeSChild + totalcafeSStud + totalcafeSOKU + totalcafeSSenior;
			tax = sst * sum;
			subtotal = sum + tax;
			finalBal = earlyBal - subtotal;
		
		
			System.out.println("-------------------------------------------------------------------------------------------------------------------------");
			System.out.println(" ");
			
			
			System.out.println("                                                  MALAYSIA RAILWAYS                                                      ");
			System.out.println("                                            TICKET PURCHASED CONFIRMATION                                                ");
			System.out.println("-------------------------------------------------------------------------------------------------------------------------");
			System.out.println("Name                       : " + Name);
			System.out.println("Order ID.                  : " + orderID);
			System.out.println("Date Purchased             : " + date);
			System.out.println("Time Purchased             : " + time);
			System.out.println("Payment Method             : " + payMethod);
			System.out.println("Departure Station          : " + depSt + " Station");
			System.out.println("Destination Station        : " + destSt + " Station");
			System.out.println("-------------------------------------------------------------------------------------------------------------------------");
			System.out.println("No             Ticket Categories                            Quantity                                   Cost (RM)        ");
			System.out.println("-------------------------------------------------------------------------------------------------------------------------");
			System.out.printf ("\n1.0            (" + category1 + ")"                                                                                              );
			System.out.printf ("\n1.1            " + seatType1 + "                                     " + norSAdultQuan + "                                         %.2f" , totalnorSAdult);
			System.out.printf ("\n1.2            " + seatType2 + "                                        " + hotSAdultQuan + "                                         %.2f" , totalhotSAdult);
			System.out.printf ("\n1.3            " + seatType3 + "                                  " + cafeSAdultQuan + "                                         %.2f", totalcafeSAdult);
			System.out.println(" ");
			System.out.println("\n-------------------------------------------------------------------------------------------------------------------------");
			
			System.out.printf ("\n2.0            (" + category2 + ")"                                                                                              );
			System.out.printf ("\n2.1            " + seatType1 + "                                     " + norSChildQuan + "                                         %.2f" , totalnorSChild);
			System.out.printf ("\n2.2            " + seatType2 + "                                        " + hotSChildQuan + "                                         %.2f" , totalhotSChild);
			System.out.printf ("\n2.3            " + seatType3 + "                                  " + cafeSChildQuan + "                                         %.2f" , totalcafeSChild);
			System.out.println(" ");
			System.out.println("\n-------------------------------------------------------------------------------------------------------------------------");
			
			System.out.printf ("\n3.0            (" + category3 + ")"                                                                                             );
			System.out.printf ("\n3.1            " + seatType1 + "                                     " + norSStudQuan + "                                         %.2f" , totalnorSStud);
			System.out.printf ("\n3.2            " + seatType2 + "                                        " + hotSStudQuan + "                                         %.2f" , totalhotSStud);
			System.out.printf ("\n3.3            " + seatType3 + "                                  " + cafeSStudQuan + "                                         %.2f" , totalcafeSStud);
			System.out.println(" ");
			System.out.println("\n-------------------------------------------------------------------------------------------------------------------------");
			
			System.out.printf ("\n4.0            (" + category4 + ")"                                                                                             );
			System.out.printf ("\n4.1            " + seatType1 + "                                     " + norSOKUQuan + "                                         %.2f" , totalnorSOKU);
			System.out.printf ("\n4.2            " + seatType2 + "                                        " + hotSOKUQuan + "                                         %.2f" , totalhotSOKU);
			System.out.printf ("\n4.3            " + seatType3 + "                                  " + cafeSOKUQuan + "                                         %.2f" , totalcafeSOKU);
			System.out.println(" ");
			System.out.println("\n-------------------------------------------------------------------------------------------------------------------------");
			
			System.out.printf ("\n5.0            (" + category5 + ")"                                                                                             );
			System.out.printf ("\n5.1            " + seatType1 + "                                     " + norSSeniorQuan + "                                         %.2f" , totalnorSSenior);
			System.out.printf ("\n5.2            " + seatType2 + "                                        " + hotSSeniorQuan + "                                         %.2f" , totalhotSSenior);
			System.out.printf ("\n5.3            " + seatType3 + "                                  " + cafeSSeniorQuan + "                                         %.2f" , totalcafeSSenior);
			System.out.println(" ");
			System.out.println("\n-------------------------------------------------------------------------------------------------------------------------");
			System.out.printf("\n Amount                                        :                                                         %.2f" , sum);
			System.out.println("\n-------------------------------------------------------------------------------------------------------------------------");
			System.out.printf("\n Sales and Service Tax (SST)                   :                                                         %.2f" , tax);
			System.out.println("\n-------------------------------------------------------------------------------------------------------------------------");
			System.out.printf("\n Subtotal                                      :                                                         %.2f" , subtotal);
			System.out.println("\n-------------------------------------------------------------------------------------------------------------------------");
		
			if (subtotal <= earlyBal) 
			{
				System.out.printf("\n Malaysia Railways e-Wallet Balance (BEFORE)   :                                                         %.2f" , earlyBal);
				System.out.println("\n-------------------------------------------------------------------------------------------------------------------------");
				System.out.printf("\n Malaysia Railways e-Wallet Balance (AFTER)    :                                                         %.2f" , finalBal);
				System.out.println("\n-------------------------------------------------------------------------------------------------------------------------");
				System.out.println(" ");
				System.out.println("                                                    Congratulations!                                                       ");
				System.out.println("                                           You purchases have been confirmed                                               ");
				System.out.println("                                       Please be at the station 30 minutes earlier                                         ");
				System.out.println("                                            Have a nice day " + Name +"!                                             ");
			}
		
			else
			{
				System.out.printf("\n Malaysia Railways e-Wallet Balance (BEFORE)   :                                                         %.2f" , earlyBal);
				System.out.println("\n-------------------------------------------------------------------------------------------------------------------------");
				System.out.println(" ");
				System.out.println("                                                         Oops!                                                             ");
				System.out.println("                              It appears that you don't have enough balance in your e-Wallet.                              ");
				System.out.println("                                               Payment will be cancelled.                                                  ");
			}
		}
		
		else if (depSt.equals("PADANG BESAR") && destSt.equals("GEMAS"))
		{
			hotSAdult = (norSAdultPBG * 110) / 100;
			cafeSAdult = (norSAdultPBG * 115) / 100;
			
			norSChild = (norSAdultPBG * 90) / 100;
			hotSChild = (hotSAdult * 90) / 100;
			cafeSChild = (cafeSAdult * 90) / 100;
			
			norSStud = (norSAdultPBG * 80) / 100;
			hotSStud = (hotSAdult * 80) / 100;
			cafeSStud = (cafeSAdult * 80) / 100;
			
			norSOKU = (norSAdultPBG * 60) / 100;
			hotSOKU = (hotSAdult * 60) / 100;
			cafeSOKU = (cafeSAdult * 60) / 100;
			
			norSSenior = (norSAdultPBG * 70) / 100;
			hotSSenior = (hotSAdult * 70) / 100;
			cafeSSenior = (cafeSAdult * 70) / 100;
			
			System.out.println("-------------------------------------------------------------------------------------------------------------------------");
			System.out.println(" ");
			System.out.println("                    TICKET PRICE LIST FOR " + depSt + " STATION TO " + destSt + " STATION (EXCLUSIVE SST)                ");
		
			System.out.println("    ________________________________________________________________________________________________________________");
			System.out.println("    |                  |                              |          HOT SEAT           |        CAFETERIA SEAT        |");
			System.out.println("    |    CATEGORIES    |         NORMAL SEAT          |       (EXTRA LEGROOM)       |       (CAFETERIA COACH)      |");
			System.out.println("    |__________________|______________________________|_____________________________|______________________________|");
			System.out.println("    |                  |                              |                             |                              |");
			System.out.printf ("    |      ADULT"           );
			System.out.printf ("       |          RM%.2f" , norSAdultPBG);
			System.out.printf ("            |         RM%.2f", hotSAdult );
			System.out.printf ("            |          RM%.2f", cafeSAdult );
			System.out.print  ("            |");
			System.out.println("");
			System.out.println("    |                  |                              |                             |                              |");
		
			System.out.printf ("    |      CHILD"           );
			System.out.printf ("       |           RM%.2f" , norSChild);
			System.out.printf ("            |          RM%.2f", hotSChild );
			System.out.printf ("            |          RM%.2f", cafeSChild );
			System.out.print  ("            |");
			System.out.println("");
			System.out.println("    |                  |                              |                             |                              |");
		
			System.out.printf ("    |     STUDENT"    );
			System.out.printf ("      |           RM%.2f" , norSStud);
			System.out.printf ("            |          RM%.2f", hotSStud );
			System.out.printf ("            |           RM%.2f", cafeSStud );
			System.out.print  ("            |");
			System.out.println("");
			System.out.println("    |                  |                              |                             |                              |");
		
			System.out.printf ("    |     DISABLED"     );
			System.out.printf ("     |           RM%.2f" , norSOKU);
			System.out.printf ("            |          RM%.2f", hotSOKU );
			System.out.printf ("            |           RM%.2f", cafeSOKU );
			System.out.print  ("            |");
			System.out.println("");
			System.out.println("    |                  |                              |                             |                              |");
		
			System.out.printf ("    |      SENIOR"          );
			System.out.printf ("      |           RM%.2f" , norSSenior);
			System.out.printf ("            |          RM%.2f", hotSSenior );
			System.out.printf ("            |           RM%.2f", cafeSSenior );
			System.out.print  ("            |");
			System.out.println("");
			System.out.println("    |__________________|______________________________|_____________________________|______________________________|" );
		
			System.out.println("");
			System.out.println("        PLEASE ENTER THE QUANTITY OF TICKETS YOU WANT TO BUY ACCORDING TO THE PASSENGER CATEGORIES AND SEAT TYPES        ");
			System.out.println("");
		
		
			System.out.println(category1);
			System.out.print(seatType1 + ": ");
			norSAdultQuan = input.nextInt();
			System.out.print(seatType2 + ": ");
			hotSAdultQuan = input.nextInt();
			System.out.print(seatType3 + ": ");
			cafeSAdultQuan = input.nextInt();
			System.out.println("");
		
			System.out.println(category2);
			System.out.print(seatType1 + ": ");
			norSChildQuan = input.nextInt();
			System.out.print(seatType2 + ": ");
			hotSChildQuan = input.nextInt();
			System.out.print(seatType3 + ": ");
			cafeSChildQuan = input.nextInt();
			System.out.println("");
		
			System.out.println(category3);
			System.out.print(seatType1 + ": ");
			norSStudQuan = input.nextInt();
			System.out.print(seatType2 + ": ");
			hotSStudQuan = input.nextInt();
			System.out.print(seatType3 + ": ");
			cafeSStudQuan = input.nextInt();
			System.out.println("");
		
			System.out.println(category4);
			System.out.print(seatType1 + ": ");
			norSOKUQuan = input.nextInt();
			System.out.print(seatType2 + ": ");
			hotSOKUQuan = input.nextInt();
			System.out.print(seatType3 + ": ");
			cafeSOKUQuan = input.nextInt();
			System.out.println("");
		
			System.out.println(category5);
			System.out.print(seatType1 + ": ");
			norSSeniorQuan = input.nextInt();
			System.out.print(seatType2 + ": ");
			hotSSeniorQuan = input.nextInt();
			System.out.print(seatType3 + ": ");
			cafeSSeniorQuan = input.nextInt();
			System.out.println("");
		
			totalnorSAdult = norSAdultQuan * norSAdultPBG;
			totalhotSAdult = hotSAdultQuan * hotSAdult;
			totalcafeSAdult = cafeSAdultQuan * cafeSAdult;
			totalnorSChild = norSChildQuan * norSChild;
			totalhotSChild = hotSChildQuan * hotSChild;
			totalcafeSChild = cafeSChildQuan * cafeSChild;
			totalnorSStud = norSStudQuan * norSStud;
			totalhotSStud = hotSStudQuan * hotSStud;
			totalcafeSStud = cafeSStudQuan * cafeSStud;
			totalnorSOKU = norSOKUQuan * norSOKU;
			totalhotSOKU = hotSOKUQuan * hotSOKU;
			totalcafeSOKU = cafeSOKUQuan * cafeSOKU;
			totalnorSSenior = norSSeniorQuan * norSSenior;
			totalhotSSenior = hotSSeniorQuan * hotSSenior;
			totalcafeSSenior = cafeSSeniorQuan * cafeSSenior;
		
			sum = totalnorSAdult + totalnorSChild + totalnorSStud + totalnorSOKU + totalnorSSenior + totalhotSAdult + totalhotSChild + totalhotSStud + totalhotSOKU + totalhotSSenior + totalcafeSAdult + totalcafeSChild + totalcafeSStud + totalcafeSOKU + totalcafeSSenior;
			tax = sst * sum;
			subtotal = sum + tax;
			finalBal = earlyBal - subtotal;
		
		
			System.out.println("-------------------------------------------------------------------------------------------------------------------------");
			System.out.println(" ");
			
			
			System.out.println("                                                  MALAYSIA RAILWAYS                                                      ");
			System.out.println("                                            TICKET PURCHASED CONFIRMATION                                                ");
			System.out.println("-------------------------------------------------------------------------------------------------------------------------");
			System.out.println("Name                       : " + Name);
			System.out.println("Order ID.                  : " + orderID);
			System.out.println("Date Purchased             : " + date);
			System.out.println("Time Purchased             : " + time);
			System.out.println("Payment Method             : " + payMethod);
			System.out.println("Departure Station          : " + depSt + " Station");
			System.out.println("Destination Station        : " + destSt + " Station");
			System.out.println("-------------------------------------------------------------------------------------------------------------------------");
			System.out.println("No             Ticket Categories                            Quantity                                   Cost (RM)        ");
			System.out.println("-------------------------------------------------------------------------------------------------------------------------");
			System.out.printf ("\n1.0            (" + category1 + ")"                                                                                              );
			System.out.printf ("\n1.1            " + seatType1 + "                                     " + norSAdultQuan + "                                         %.2f" , totalnorSAdult);
			System.out.printf ("\n1.2            " + seatType2 + "                                        " + hotSAdultQuan + "                                         %.2f" , totalhotSAdult);
			System.out.printf ("\n1.3            " + seatType3 + "                                  " + cafeSAdultQuan + "                                         %.2f", totalcafeSAdult);
			System.out.println(" ");
			System.out.println("\n-------------------------------------------------------------------------------------------------------------------------");
			
			System.out.printf ("\n2.0            (" + category2 + ")"                                                                                              );
			System.out.printf ("\n2.1            " + seatType1 + "                                     " + norSChildQuan + "                                         %.2f" , totalnorSChild);
			System.out.printf ("\n2.2            " + seatType2 + "                                        " + hotSChildQuan + "                                         %.2f" , totalhotSChild);
			System.out.printf ("\n2.3            " + seatType3 + "                                  " + cafeSChildQuan + "                                         %.2f" , totalcafeSChild);
			System.out.println(" ");
			System.out.println("\n-------------------------------------------------------------------------------------------------------------------------");
			
			System.out.printf ("\n3.0            (" + category3 + ")"                                                                                             );
			System.out.printf ("\n3.1            " + seatType1 + "                                     " + norSStudQuan + "                                         %.2f" , totalnorSStud);
			System.out.printf ("\n3.2            " + seatType2 + "                                        " + hotSStudQuan + "                                         %.2f" , totalhotSStud);
			System.out.printf ("\n3.3            " + seatType3 + "                                  " + cafeSStudQuan + "                                         %.2f" , totalcafeSStud);
			System.out.println(" ");
			System.out.println("\n-------------------------------------------------------------------------------------------------------------------------");
			
			System.out.printf ("\n4.0            (" + category4 + ")"                                                                                             );
			System.out.printf ("\n4.1            " + seatType1 + "                                     " + norSOKUQuan + "                                         %.2f" , totalnorSOKU);
			System.out.printf ("\n4.2            " + seatType2 + "                                        " + hotSOKUQuan + "                                         %.2f" , totalhotSOKU);
			System.out.printf ("\n4.3            " + seatType3 + "                                  " + cafeSOKUQuan + "                                         %.2f" , totalcafeSOKU);
			System.out.println(" ");
			System.out.println("\n-------------------------------------------------------------------------------------------------------------------------");
			
			System.out.printf ("\n5.0            (" + category5 + ")"                                                                                             );
			System.out.printf ("\n5.1            " + seatType1 + "                                     " + norSSeniorQuan + "                                         %.2f" , totalnorSSenior);
			System.out.printf ("\n5.2            " + seatType2 + "                                        " + hotSSeniorQuan + "                                         %.2f" , totalhotSSenior);
			System.out.printf ("\n5.3            " + seatType3 + "                                  " + cafeSSeniorQuan + "                                         %.2f" , totalcafeSSenior);
			System.out.println(" ");
			System.out.println("\n-------------------------------------------------------------------------------------------------------------------------");
			System.out.printf("\n Amount                                        :                                                         %.2f" , sum);
			System.out.println("\n-------------------------------------------------------------------------------------------------------------------------");
			System.out.printf("\n Sales and Service Tax (SST)                   :                                                         %.2f" , tax);
			System.out.println("\n-------------------------------------------------------------------------------------------------------------------------");
			System.out.printf("\n Subtotal                                      :                                                         %.2f" , subtotal);
			System.out.println("\n-------------------------------------------------------------------------------------------------------------------------");
		
			if (subtotal <= earlyBal) 
			{
				System.out.printf("\n Malaysia Railways e-Wallet Balance (BEFORE)   :                                                         %.2f" , earlyBal);
				System.out.printf("\n Malaysia Railways e-Wallet Balance (AFTER)    :                                                         %.2f" , finalBal);
				System.out.println("\n-------------------------------------------------------------------------------------------------------------------------");
				System.out.println(" ");
				System.out.println("                                                    Congratulations!                                                       ");
				System.out.println("                                           You purchases have been confirmed                                               ");
				System.out.println("                                       Please be at the station 30 minutes earlier                                         ");
				System.out.println("                                            Have a nice day " + Name +"!                                             ");
			}
		
			else
			{
				System.out.printf("\n Malaysia Railways e-Wallet Balance (BEFORE)   :                                                         %.2f" , earlyBal);
				System.out.println("\n-------------------------------------------------------------------------------------------------------------------------");
				System.out.println(" ");
				System.out.println("                                                         Oops!                                                             ");
				System.out.println("                              It appears that you don't have enough balance in your e-Wallet.                              ");
				System.out.println("                                               Payment will be cancelled.                                                  ");
			}
		}
		
		else if (depSt.equals("IPOH") && destSt.equals("ALOR SETAR"))
		{
			hotSAdult = (norSAdultIAOR * 110) / 100;
			cafeSAdult = (norSAdultIAOR * 115) / 100;
			
			norSChild = (norSAdultIAOR * 90) / 100;
			hotSChild = (hotSAdult * 90) / 100;
			cafeSChild = (cafeSAdult * 90) / 100;
			
			norSStud = (norSAdultIAOR * 80) / 100;
			hotSStud = (hotSAdult * 80) / 100;
			cafeSStud = (cafeSAdult * 80) / 100;
			
			norSOKU = (norSAdultIAOR * 60) / 100;
			hotSOKU = (hotSAdult * 60) / 100;
			cafeSOKU = (cafeSAdult * 60) / 100;
			
			norSSenior = (norSAdultIAOR * 70) / 100;
			hotSSenior = (hotSAdult * 70) / 100;
			cafeSSenior = (cafeSAdult * 70) / 100;
			
			System.out.println("-------------------------------------------------------------------------------------------------------------------------");
			System.out.println(" ");
			System.out.println("                    TICKET PRICE LIST FOR " + depSt + " STATION TO " + destSt + " STATION (EXCLUSIVE SST)                ");
		
			System.out.println("    ________________________________________________________________________________________________________________");
			System.out.println("    |                  |                              |          HOT SEAT           |        CAFETERIA SEAT        |");
			System.out.println("    |    CATEGORIES    |         NORMAL SEAT          |       (EXTRA LEGROOM)       |       (CAFETERIA COACH)      |");
			System.out.println("    |__________________|______________________________|_____________________________|______________________________|");
			System.out.println("    |                  |                              |                             |                              |");
			System.out.printf ("    |      ADULT"           );
			System.out.printf ("       |           RM%.2f" , norSAdultIAOR);
			System.out.printf ("            |          RM%.2f", hotSAdult );
			System.out.printf ("            |           RM%.2f", cafeSAdult );
			System.out.print  ("            |");
			System.out.println("");
			System.out.println("    |                  |                              |                             |                              |");
		
			System.out.printf ("    |      CHILD"           );
			System.out.printf ("       |           RM%.2f" , norSChild);
			System.out.printf ("            |          RM%.2f", hotSChild );
			System.out.printf ("            |           RM%.2f", cafeSChild );
			System.out.print  ("            |");
			System.out.println("");
			System.out.println("    |                  |                              |                             |                              |");
		
			System.out.printf ("    |     STUDENT"    );
			System.out.printf ("      |           RM%.2f" , norSStud);
			System.out.printf ("            |          RM%.2f", hotSStud );
			System.out.printf ("            |           RM%.2f", cafeSStud );
			System.out.print  ("            |");
			System.out.println("");
			System.out.println("    |                  |                              |                             |                              |");
		
			System.out.printf ("    |     DISABLED"     );
			System.out.printf ("     |           RM%.2f" , norSOKU);
			System.out.printf ("            |          RM%.2f", hotSOKU );
			System.out.printf ("            |           RM%.2f", cafeSOKU );
			System.out.print  ("            |");
			System.out.println("");
			System.out.println("    |                  |                              |                             |                              |");
		
			System.out.printf ("    |      SENIOR"          );
			System.out.printf ("      |           RM%.2f" , norSSenior);
			System.out.printf ("            |          RM%.2f", hotSSenior );
			System.out.printf ("            |           RM%.2f", cafeSSenior );
			System.out.print  ("            |");
			System.out.println("");
			System.out.println("    |__________________|______________________________|_____________________________|______________________________|" );
		
			System.out.println("");
			System.out.println("        PLEASE ENTER THE QUANTITY OF TICKETS YOU WANT TO BUY ACCORDING TO THE PASSENGER CATEGORIES AND SEAT TYPES        ");
			System.out.println("");
		
		
			System.out.println(category1);
			System.out.print(seatType1 + ": ");
			norSAdultQuan = input.nextInt();
			System.out.print(seatType2 + ": ");
			hotSAdultQuan = input.nextInt();
			System.out.print(seatType3 + ": ");
			cafeSAdultQuan = input.nextInt();
			System.out.println("");
		
			System.out.println(category2);
			System.out.print(seatType1 + ": ");
			norSChildQuan = input.nextInt();
			System.out.print(seatType2 + ": ");
			hotSChildQuan = input.nextInt();
			System.out.print(seatType3 + ": ");
			cafeSChildQuan = input.nextInt();
			System.out.println("");
		
			System.out.println(category3);
			System.out.print(seatType1 + ": ");
			norSStudQuan = input.nextInt();
			System.out.print(seatType2 + ": ");
			hotSStudQuan = input.nextInt();
			System.out.print(seatType3 + ": ");
			cafeSStudQuan = input.nextInt();
			System.out.println("");
		
			System.out.println(category4);
			System.out.print(seatType1 + ": ");
			norSOKUQuan = input.nextInt();
			System.out.print(seatType2 + ": ");
			hotSOKUQuan = input.nextInt();
			System.out.print(seatType3 + ": ");
			cafeSOKUQuan = input.nextInt();
			System.out.println("");
		
			System.out.println(category5);
			System.out.print(seatType1 + ": ");
			norSSeniorQuan = input.nextInt();
			System.out.print(seatType2 + ": ");
			hotSSeniorQuan = input.nextInt();
			System.out.print(seatType3 + ": ");
			cafeSSeniorQuan = input.nextInt();
			System.out.println("");
		
			totalnorSAdult = norSAdultQuan * norSAdultIAOR;
			totalhotSAdult = hotSAdultQuan * hotSAdult;
			totalcafeSAdult = cafeSAdultQuan * cafeSAdult;
			totalnorSChild = norSChildQuan * norSChild;
			totalhotSChild = hotSChildQuan * hotSChild;
			totalcafeSChild = cafeSChildQuan * cafeSChild;
			totalnorSStud = norSStudQuan * norSStud;
			totalhotSStud = hotSStudQuan * hotSStud;
			totalcafeSStud = cafeSStudQuan * cafeSStud;
			totalnorSOKU = norSOKUQuan * norSOKU;
			totalhotSOKU = hotSOKUQuan * hotSOKU;
			totalcafeSOKU = cafeSOKUQuan * cafeSOKU;
			totalnorSSenior = norSSeniorQuan * norSSenior;
			totalhotSSenior = hotSSeniorQuan * hotSSenior;
			totalcafeSSenior = cafeSSeniorQuan * cafeSSenior;
		
			sum = totalnorSAdult + totalnorSChild + totalnorSStud + totalnorSOKU + totalnorSSenior + totalhotSAdult + totalhotSChild + totalhotSStud + totalhotSOKU + totalhotSSenior + totalcafeSAdult + totalcafeSChild + totalcafeSStud + totalcafeSOKU + totalcafeSSenior;
			tax = sst * sum;
			subtotal = sum + tax;
			finalBal = earlyBal - subtotal;
		
		
			System.out.println("-------------------------------------------------------------------------------------------------------------------------");
			System.out.println(" ");
			
			
			System.out.println("                                                  MALAYSIA RAILWAYS                                                      ");
			System.out.println("                                            TICKET PURCHASED CONFIRMATION                                                ");
			System.out.println("-------------------------------------------------------------------------------------------------------------------------");
			System.out.println("Name                       : " + Name);
			System.out.println("Order ID.                  : " + orderID);
			System.out.println("Date Purchased             : " + date);
			System.out.println("Time Purchased             : " + time);
			System.out.println("Payment Method             : " + payMethod);
			System.out.println("Departure Station          : " + depSt + " Station");
			System.out.println("Destination Station        : " + destSt + " Station");
			System.out.println("-------------------------------------------------------------------------------------------------------------------------");
			System.out.println("No             Ticket Categories                            Quantity                                   Cost (RM)        ");
			System.out.println("-------------------------------------------------------------------------------------------------------------------------");
			System.out.printf ("\n1.0            (" + category1 + ")"                                                                                              );
			System.out.printf ("\n1.1            " + seatType1 + "                                     " + norSAdultQuan + "                                         %.2f" , totalnorSAdult);
			System.out.printf ("\n1.2            " + seatType2 + "                                        " + hotSAdultQuan + "                                         %.2f" , totalhotSAdult);
			System.out.printf ("\n1.3            " + seatType3 + "                                  " + cafeSAdultQuan + "                                         %.2f", totalcafeSAdult);
			System.out.println(" ");
			System.out.println("\n-------------------------------------------------------------------------------------------------------------------------");
			
			System.out.printf ("\n2.0            (" + category2 + ")"                                                                                              );
			System.out.printf ("\n2.1            " + seatType1 + "                                     " + norSChildQuan + "                                         %.2f" , totalnorSChild);
			System.out.printf ("\n2.2            " + seatType2 + "                                        " + hotSChildQuan + "                                         %.2f" , totalhotSChild);
			System.out.printf ("\n2.3            " + seatType3 + "                                  " + cafeSChildQuan + "                                         %.2f" , totalcafeSChild);
			System.out.println(" ");
			System.out.println("\n-------------------------------------------------------------------------------------------------------------------------");
			
			System.out.printf ("\n3.0            (" + category3 + ")"                                                                                             );
			System.out.printf ("\n3.1            " + seatType1 + "                                     " + norSStudQuan + "                                         %.2f" , totalnorSStud);
			System.out.printf ("\n3.2            " + seatType2 + "                                        " + hotSStudQuan + "                                         %.2f" , totalhotSStud);
			System.out.printf ("\n3.3            " + seatType3 + "                                  " + cafeSStudQuan + "                                         %.2f" , totalcafeSStud);
			System.out.println(" ");
			System.out.println("\n-------------------------------------------------------------------------------------------------------------------------");
			
			System.out.printf ("\n4.0            (" + category4 + ")"                                                                                             );
			System.out.printf ("\n4.1            " + seatType1 + "                                     " + norSOKUQuan + "                                         %.2f" , totalnorSOKU);
			System.out.printf ("\n4.2            " + seatType2 + "                                        " + hotSOKUQuan + "                                         %.2f" , totalhotSOKU);
			System.out.printf ("\n4.3            " + seatType3 + "                                  " + cafeSOKUQuan + "                                         %.2f" , totalcafeSOKU);
			System.out.println(" ");
			System.out.println("\n-------------------------------------------------------------------------------------------------------------------------");
			
			System.out.printf ("\n5.0            (" + category5 + ")"                                                                                             );
			System.out.printf ("\n5.1            " + seatType1 + "                                     " + norSSeniorQuan + "                                         %.2f" , totalnorSSenior);
			System.out.printf ("\n5.2            " + seatType2 + "                                        " + hotSSeniorQuan + "                                         %.2f" , totalhotSSenior);
			System.out.printf ("\n5.3            " + seatType3 + "                                  " + cafeSSeniorQuan + "                                         %.2f" , totalcafeSSenior);
			System.out.println(" ");
			System.out.println("\n-------------------------------------------------------------------------------------------------------------------------");
			System.out.printf("\n Amount                                        :                                                         %.2f" , sum);
			System.out.println("\n-------------------------------------------------------------------------------------------------------------------------");
			System.out.printf("\n Sales and Service Tax (SST)                   :                                                         %.2f" , tax);
			System.out.println("\n-------------------------------------------------------------------------------------------------------------------------");
			System.out.printf("\n Subtotal                                      :                                                         %.2f" , subtotal);
			System.out.println("\n-------------------------------------------------------------------------------------------------------------------------");
		
			if (subtotal <= earlyBal) 
			{
				System.out.printf("\n Malaysia Railways e-Wallet Balance (BEFORE)   :                                                         %.2f" , earlyBal);
				System.out.printf("\n Malaysia Railways e-Wallet Balance (AFTER)    :                                                         %.2f" , finalBal);
				System.out.println("\n-------------------------------------------------------------------------------------------------------------------------");
				System.out.println(" ");
				System.out.println("                                                    Congratulations!                                                       ");
				System.out.println("                                           You purchases have been confirmed                                               ");
				System.out.println("                                       Please be at the station 30 minutes earlier                                         ");
				System.out.println("                                            Have a nice day " + Name +"!                                             ");
			}
		
			else
			{
				System.out.printf("\n Malaysia Railways e-Wallet Balance (BEFORE)   :                                                         %.2f" , earlyBal);
				System.out.println("\n-------------------------------------------------------------------------------------------------------------------------");
				System.out.println(" ");
				System.out.println("                                                         Oops!                                                             ");
				System.out.println("                              It appears that you don't have enough balance in your e-Wallet.                              ");
				System.out.println("                                               Payment will be cancelled.                                                  ");
			}
		}
		
		else
		{
			System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
			System.out.println(" ");
			System.out.println("                                                           Sorry!                                                              ");
			System.out.println("                               For the selected station we don't provide the schedule train yet                                ");
			System.out.println("                                But you can choose another departure and destination station.                                  ");
			System.out.println("                                                Sorry for the inconvenience!                                                   ");
		}
		
	}
} 

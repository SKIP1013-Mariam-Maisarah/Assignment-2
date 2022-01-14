package assignment2;

import java.util.Scanner;

class DiningSystemForCruiseControlStructureSelectionRepetitionStructure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxWeight = 600;
		int noOfPassenger1a = 0, noOfPassenger1b = 0, noOfPassenger1c = 0;
		int noOfPassenger2a = 0, noOfPassenger2b = 0, noOfPassenger2c = 0;
		int noOfPassenger3a = 0, noOfPassenger3c = 0;
		int counter = 0;
		int totalPassenger, age, totalUnit;

		double sum1c, sum2c, sum3c;
		double sum1w, sum2w, sum3w;
		double maxC, maxW;
		double totIngredientSetCC, totIngredientSetCW, totIngredientB;
		double totMass, totRemain;
		double pricepackage1a = 88, pricepackage1b = 128, pricepackage1c = 168;
		double pricepackage2a = 108, pricepackage2b = 148, pricepackage2c = 188;
		double pricepackage3a = 100, pricepackage3c = 20;
		double discountRate5 = 0.05, discountRate8 = 0.08, chargeRate = 0.02, taxRate = 0.06;
		double cashPayment;
		double remainIngCA, remainIngCB, remainIngCC;
		double remainIngWA, remainIngWB, remainIngWC;
		double rice, meat, seafood, egg, vegetables, fruits, flour, oil, water;
		double rice2, meat2, seafood2, egg2, vegetables2, fruits2, flour2, oil2, water2;
		double rice3, meat3, seafood3, egg3, vegetables3, fruits3, flour3, oil3, water3;
		double tot;
		
		String name, fullName, roomNo, ticketNo, outfit, freeGift;
		String date = "12/12/2021", time = "12:30 p.m.";
		String package1 = "Chinese Cuisine", package2 = "Western Food", package3 = "Buffet";
		
		char ch = 0;
		char value = 'y';
		char response, decision;
		
		boolean access = true;
		
		double sum, sub;
		double mul1a = 0, mul1b = 0, mul1c = 0;
		double mul2a = 0, mul2b = 0, mul2c = 0;
		double mul3a = 0, mul3c = 0;
		double discount, charge, tax, subtotal;
		
		System.out.println("------LIBERTY CRUISE INGREDIENTS ALLOCATION------");
		Scanner input = new Scanner(System.in);  
		
		System.out.println();
		
		System.out.println("Maximum mass of ingredients needed for passenger");
		System.out.println("Kindly Reminder!!!");
		System.out.println("Maximum weight for the ingredients acceptable to brought on board are " + maxWeight + " kg.");
		System.out.println("Mass which are most heavy for each package are used in prediction.");
		
		System.out.print("\nTotal passengers on Liberty Cruise : ");
		totalPassenger = input.nextInt();
		
		System.out.println("\n------CHINESE CUISINE INGREDIENTS------");
		
		System.out.println();
		
		System.out.println("Enter the total kilograms for all ingredients");
		sum1c = 0.4 + 0.125 + 0.14 + 0.03 + 0.3 + 0.25 + 0.025 + 0.3 + 1;
		System.out.printf("Total kilograms for Set A ingredients : %.2f kg", sum1c);
		
		sum2c = 0.4 + 0.245 + 0.19 + 0.04 + 0.4 + 0.3 + 0.03 + 0.4 + 1.1;
		System.out.printf("\nTotal kilograms for Set B ingredients : %.2f kg", sum2c);
		
		sum3c = 0.4 + 0.3 + 0.275 + 0.05 + 0.5 + 0.35 + 0.035 + 0.5 + 1.2;
		System.out.printf("\nTotal kilograms for Set C ingredients : %.2f kg", sum3c);
		
		maxC = Math.max(sum1c, Math.max(sum2c, sum3c));
		if (maxC >= 3.5) {
			System.out.println("\nSuggested set to predict total kilograms are : " + "Set C");
		} 
		
		totIngredientSetCC = sum3c * totalPassenger;
		System.out.print("Total kilograms for Set C ingredients needed by " + totalPassenger + " passenger : ");
		System.out.printf("%.2f kg", totIngredientSetCC);	
		
		System.out.println("\n\n------WESTERN FOOD INGREDIENTS------");
		
		System.out.println();
		
		System.out.println("Enter the total kilograms for all ingredients");
		sum1w = 0.4 + 0.225 + 0.2 + 0.04 + 0.45 + 0.325 + 0.04 + 0.4 + 1;
		System.out.printf("Total kilograms for Set A ingredients : %.2f kg", sum1w);
		
		sum2w = 0.4 + 0.295 + 0.25 + 0.05 + 0.5 + 0.345 + 0.05 + 0.5 + 1.1;
		System.out.printf("\nTotal kilograms for Set B ingredients : %.2f kg", sum2w);
		
		sum3w = 0.4 + 0.35 + 0.325 + 0.06 + 0.55 + 0.4 + 0.06 + 0.6 + 1.2;
		System.out.printf("\nTotal kilograms for Set C ingredients : %.2f kg", sum3w);
		
		maxW = Math.max(sum1w, Math.max(sum2w, sum3w));
		if (maxW >= 3.5) {
			System.out.println("\nSuggested set to predict total kilograms are : " + "Set C");
		} 
		
		totIngredientSetCW = sum3w * totalPassenger;
		System.out.print("Total kilograms for Set C ingredients needed by " + totalPassenger + " passenger : ");
		System.out.printf("%.2f kg", totIngredientSetCW);	
		
		System.out.println("\n\n------BUFFET INGREDIENTS------");
		
		System.out.println();
		
		System.out.println("Enter the total kilograms for all ingredients");
		totIngredientB = 16 + 14.5 + 15 + 22 + 25 + 18 + 24 + 2 + 50;
		System.out.print("Total kilograms for ingredients needed by " + totalPassenger + " passenger : ");
		System.out.printf("%.2f kg", totIngredientB);	
		
		System.out.println();
		
		totMass = totIngredientSetCC + totIngredientSetCW + totIngredientB;
		System.out.printf("\nTotal mass of ingredients : %.2f kg", totMass);
		if (totMass <= 600) {
			System.out.println("\nThe menu setting is accepted.");
		} else {
			System.out.println("\nThe menu setting is rejected. The total mass has already exceed the weight that can afford by the cruise. You are suggested to change your menu.");
		}
		
		System.out.println();
		
		System.out.println("------WELCOME TO LIBERTY CRUISE------");
			
		System.out.println();
		
		System.out.print("Please insert your name : ");;
		name = input.next();
		fullName = input.nextLine();
		
		System.out.print("Please enter your room number : ");
		roomNo = input.next();
		
		do {
			System.out.print("Please enter your cruise ticket number (10 numbers) : ");
			ticketNo = input.next();
			  
			if (ticketNo.length() == 10)
			{
				System.out.println("Checking...Please wait");
				ch = ticketNo.charAt(0);

				if (ch >= '0' && ch <= '9') {
					System.out.println("Register successfully");
			    	
					System.out.print("\nOutfit of today (formal / flexible) : ");
					outfit = input.next();
		
					if (outfit.equalsIgnoreCase("formal"))
					{
						System.out.println("You are available to enjoy all 3 packages.");
						System.out.println("Chinese Cuisine, Western Food and Buffet are served today.");
						System.out.println("Please fill in the form below to select your choice.");
						
						System.out.println();
						
					do {
						System.out.println("Which package would you like to choose?");
						System.out.println("1 Chinese Cuisine");
						System.out.println("2 Western Food");
						System.out.println("3 Buffet");
			    		System.out.print("Enter any number according to your choice : ");
			    		response = input.next().charAt(0);
			    		switch (response) 
			    		{
			    		case '1' :
			    			System.out.println("\n------MENU FOR CHINESE CUISINE------");
			    			
			    			System.out.println("\nSet A ");
			    			System.out.println("(1) Rice");
			    			System.out.println("(2) Steamed Seabass with Spicy Sauce");
			    			System.out.println("(3) Lemon Chicken");
			    			System.out.println("(4) Tepanyaki Tofu");
			    			System.out.println("(5) Stir Fried Vegetables with Belacan");
			    			System.out.println("(6) Seaweed Soup");
			    			System.out.println("(7) Chilled Longan");
				
			    			System.out.println("\nSet B ");
			    			System.out.println("(1) Rice");
			    			System.out.println("(2) Steamed Fish with Nyonya Sauce");
			    			System.out.println("(3) Cereal Butter Prawn");
			    			System.out.println("(4) Mango Chicken");
			    			System.out.println("(5) Braised Mapo Tofu in Szechuan");
			    			System.out.println("(6) Stir Fried Kailan with Salted Fish");
			    			System.out.println("(7) Sea Cucumber Soup"); 
			    			System.out.println("(8) Chilled Lychee"); 
				 
			    			System.out.println("\nSet C");
			    			System.out.println("(1) Rice");
			    			System.out.println("(2) Chinese Style Beef with Sesame and Coriander");
			    			System.out.println("(3) Steamed Chicken with Ginseng");
			    			System.out.println("(4) Peking Duck");
			    			System.out.println("(5) Boston Lobster");
			    			System.out.println("(6) Claypot Seafood Beancurd");
			    			System.out.println("(7) Braised Broccoli with Crabstick"); 
			    			System.out.println("(8) Fish Maw Soup"); 
			    			System.out.println("(9) Chilled Sea Coconut"); 
				
			    			System.out.print("\nEnter any choice of Chinese Cuisine");
			    			
			    			System.out.print("\nTotal Set A you wish to order : "); 
		    				noOfPassenger1a = input.nextInt();
		    				
		    				System.out.print("Total Set B you wish to order : "); 
		    				noOfPassenger1b = input.nextInt();
		    				
		    				System.out.print("Total Set C you wish to order : "); 
		    				noOfPassenger1c = input.nextInt();
		    				
		    				System.out.print("\n------PRICE OF CHINESE CUISINE------"); 
				    		
		    				System.out.printf("\n\nPer Set A          : RM %.2f ", pricepackage1a);
				    		mul1a = (noOfPassenger1a * pricepackage1a);
				    		System.out.printf("\nPayment For Set A  : RM %.2f ", mul1a);
				    		
				    		System.out.printf("\n\nPer Set B          : RM %.2f ", pricepackage1b);
				    		mul1b = (noOfPassenger1b * pricepackage1b);
				    		System.out.printf("\nPayment For Set B  : RM %.2f ", mul1b);

				    		System.out.printf("\n\nPer Set C          : RM %.2f ", pricepackage1c);
				    		mul1c = (noOfPassenger1c * pricepackage1c);
				    		System.out.printf("\nPayment For Set C  : RM %.2f ", mul1c);  
				    		break;
				    		
						case '2' : 
			    			System.out.println("\n------MENU FOR WESTERN FOOD------");
			    			
			    			System.out.println("\nSet A ");
			    			System.out.println("(1) Tomato Rice");
			    			System.out.println("(2) Stir Fried Sotong with Green Pepper");
			    			System.out.println("(3) Baked Hawaiian Chicken");
			    			System.out.println("(4) Brocolli & Cauliflower");
			    			System.out.println("(5) Mushroom Soup");
			    			System.out.println("(6) Sparkling Water");
			    			System.out.println("(7) Fresh Fruit");
				
			    			System.out.println("\nSet B ");
			    			System.out.println("(1) Apple Salad");
			    			System.out.println("(2) Garlic Butter Rice");
			    			System.out.println("(3) Salted Prawn with Celery");
			    			System.out.println("(4) Stewed Chicken with Chef’s Sauce");
			    			System.out.println("(5) Spicy Egg Plant");
			    			System.out.println("(6) Clam Chowder Soup");
			    			System.out.println("(7) Mini Cream Puff"); 
			    			System.out.println("(8) Orange Juice"); 
				
			    			System.out.println("\nSet C ");
			    			System.out.println("(1) Pasta Salad");
			    			System.out.println("(2) Mushroom Rice");
			    			System.out.println("(3) Salmon Fish");
			    			System.out.println("(4) BBQ Chicken");
			    			System.out.println("(5) Stir Fry Mixed Vegetables with Seafood");
			    			System.out.println("(6) Pepperoni Pizza");
			    			System.out.println("(7) Minestorone Soup"); 
			    			System.out.println("(8) Tiramisu Crepe Cake Sliced"); 
			    			System.out.println("(9) Mango Juice"); 
				 
			    			System.out.print("\nEnter any choice of Western Food");
			 
			    			System.out.print("\nTotal Set A you wish to order : "); 
		    				noOfPassenger2a = input.nextInt();
		    				
		    				System.out.print("Total Set B you wish to order : "); 
		    				noOfPassenger2b = input.nextInt();
		    				
		    				System.out.print("Total Set C you wish to order : "); 
		    				noOfPassenger2c = input.nextInt();
		    				
		    				System.out.print("\n------PRICE OF WESTERN FOOD------");
				    		
		    				System.out.printf("\n\nPer Set A          : RM %.2f ", pricepackage2a);
				    		mul2a = (noOfPassenger2a * pricepackage2a);
				    		System.out.printf("\nPayment For Set A  : RM %.2f ", mul2a);
				    		
				    		System.out.printf("\n\nPer Set B          : RM %.2f ", pricepackage2b);
				    		mul2b = (noOfPassenger2b * pricepackage2b);
				    		System.out.printf("\nPayment For Set B  : RM %.2f ", mul2b);
				    		
				    		System.out.printf("\n\nPer Set C          : RM %.2f ", pricepackage2c);
				    		mul2c = (noOfPassenger2c * pricepackage2c);
				    		System.out.printf("\nPayment For Set C  : RM %.2f ", mul2c);
				    		break;
				    		
						case '3' : 
			    			System.out.println("\n------MENU FOR BUFFET------");
			    			
			    			System.out.println("\nBuffet includes : ");
			    			System.out.println("(1) Salad");
			    			System.out.println("(2) Rice");
			    			System.out.println("(3) Main Dishes");
			    			System.out.println("(4) BBQ Station");
			    			System.out.println("(5) Side Dishes");
			    			System.out.println("(6) Soup");
			    			System.out.println("(7) Beverages");
			    			System.out.println("(8) Fruits");
			    			System.out.println("(9) Dessert");
			    			System.out.print("\n***The requirement for children package is the age need to be smaller than 6 years old.***");
			    			
			    			System.out.println();
			    			
			    			while ((value == 'y') || (value == 'Y')) {
			    				System.out.print("\nEnter your year of birth : ");
			    				age = input.nextInt();

			    				if (age <= 2014) {
			    					System.out.println("Order successful!");
			    					System.out.println("Your age is above 6 years old.");
			    					System.out.println("You are eligible for Adult Set.");
			    					noOfPassenger3a += 1;
			    				} else if (age >= 2015) {
			    					System.out.println("Order successful!");
			    					System.out.println("Your age is below 6 years old.");
			    					System.out.println("You are eligible for Children Set.");
			    					noOfPassenger3c += 1;
			    				} else {
			    					System.out.println("Invalid age");
			    				}
			    				System.out.println("\nDo you want to add order for buffet?");
			    				System.out.print("Enter your choice Y/N : ");
			    				value = input.next().charAt(0);
			    			}
			    	
			    			System.out.print("\n-----PRICE OF BUFFET-----");
			    			
			    			System.out.printf("\n\nFor Each Adult        : RM %.2f ", pricepackage3a);
				    		mul3a = (noOfPassenger3a * pricepackage3a);
				    		System.out.printf("\nPayment For Adult     : RM %.2f ", mul3a);
				    		
				    		System.out.printf("\n\nFor Each Children     : RM %.2f ", pricepackage3c);
				    		mul3c = (noOfPassenger3c * pricepackage3c);
				    		System.out.printf("\nPayment For Children  : RM %.2f ", mul3c);
				    		break;
				    		
						default :
							System.out.println("Invalid package");
			    		}
			    		
			    		System.out.print("\n\nDo you want to add on?");
			    		System.out.print("\nIf you choose yes, you are only allow to choose the package that you haven't choose.");
			    		System.out.print("\nEnter your choice Y/N : ");
			    		decision = input.next().charAt(0);
		    			
			    		System.out.println();
					
					} while ((decision == 'y') || (decision == 'Y'));
			    		
						System.out.println("Thank you for your order.");
			    		
			    		totalUnit = ((noOfPassenger1a + noOfPassenger1b + noOfPassenger1c) + (noOfPassenger2a + noOfPassenger2b + noOfPassenger2c) + (noOfPassenger3a + noOfPassenger3c));
			    		System.out.println("\nTotal set order : " + totalUnit);
			    		
			    		sum = ((mul1a + mul1b + mul1c) + (mul2a + mul2b + mul2c) + (mul3a + mul3c));
			    		System.out.printf("Total amount that need to pay : RM %.2f ", sum);
			    		
			    		charge = chargeRate * sum;
			    		System.out.printf("\nService charge : RM %.2f ", charge);
			    		
			    		tax = taxRate * sum;
			    		System.out.printf("\nSales and Service Tax (SST) : RM %.2f ", tax);
			    		
			    		if (totalUnit >= 1 && totalUnit <= 2) {
			    			freeGift = "                                     No Free Gift";
			    			discount = 0;
			    			System.out.printf("Discount Received : RM %.2f ", discount);
			    			subtotal = sum - discount + charge + tax;
			    			System.out.print("\nSubtotal with No Discount Received, 2% Service Charge and 6% SST : ");
			    			System.out.printf("RM %.2f ", subtotal);
			    		} else if (totalUnit >= 3 && totalUnit <= 6 ) {
			    			freeGift = "     Remember to withdraw 2 Gymnasium Ticket as a free gift with this receipt.";
			    			discount = discountRate5 * sum;
			    			System.out.printf("\nDiscount Received : RM %.2f ", discount);
			    			subtotal = sum - discount + charge + tax;
			    			System.out.print("\nSubtotal with 5% Discount Received, 2% Service Charge and 6% SST : ");
			    			System.out.printf("RM %.2f ", subtotal);
			    		} else {
			    			freeGift = " Remember to withdraw 4 Magic Performance Ticket as a free gift with this receipt.";
			    			discount = discountRate8 * sum;
			    			System.out.printf("\nDiscount Received : RM %.2f ", discount);
			    			subtotal = sum - discount + charge + tax;
			    			System.out.print("\nSubtotal with 8% Discount Received, 2% Service Charge and 6% SST : ");
			    			System.out.printf("RM %.2f ", subtotal);
			    		}
			    		
			    		System.out.print("\nTotal cash pay : RM ");
			    		cashPayment = input.nextDouble();
			    		
			    		sub = cashPayment - subtotal;
			    		System.out.printf("\nChanges : RM %.2f ", sub);
			    		
			    		System.out.println("\nProcessing...");
			    		System.out.println("\nYour receipt are shown below : ");
			    		
			    		System.out.println();
			    		
			    		System.out.println("                                   LIBERTY CRUISE                         ");
			    		System.out.println("                                  PAYMENT RECEIPTS                         ");
			    		System.out.println("-----------------------------------------------------------------------------------");
			    		System.out.println("User        : " + name + fullName);
			    		System.out.println("Ticket No.  : " + ticketNo);
			    		System.out.println("Room No.    : " + roomNo);
			    		System.out.println("Date        : " + date);
			    		System.out.println("Time        : " + time);
			    		System.out.println("-----------------------------------------------------------------------------------");
			    		System.out.println("No          Item Name           Unit          Price Per Unit          Cost (RM)");
			    		System.out.println("-----------------------------------------------------------------------------------");
			    		System.out.println("1        " + package1);
			    		System.out.printf("a)       Set A                    %d              %.2f                  %.2f ", noOfPassenger1a, pricepackage1a, mul1a);
			    		System.out.printf("\nb)       Set B                    %d             %.2f                  %.2f ", noOfPassenger1b, pricepackage1b, mul1b);
			    		System.out.printf("\nc)       Set C                    %d             %.2f                  %.2f ", noOfPassenger1c, pricepackage1c, mul1c);
			    		System.out.println();
			    		System.out.println("\n2        " + package2);
			    		System.out.printf("a)       Set A                    %d             %.2f                  %.2f ", noOfPassenger2a, pricepackage2a, mul2a);
			    		System.out.printf("\nb)       Set B                    %d             %.2f                  %.2f ", noOfPassenger2b, pricepackage2b, mul2b);
			    		System.out.printf("\nc)       Set C                    %d             %.2f                  %.2f ", noOfPassenger2c, pricepackage2c, mul2c);
			    		System.out.println();
			    		System.out.println("\n3        " + package3);
			    		System.out.printf("a)       Adult                    %d             %.2f                  %.2f ", noOfPassenger3a, pricepackage3a, mul3a);
			    		System.out.printf("\nb)       Children                 %d              %.2f                  %.2f ", noOfPassenger3c, pricepackage3c, mul3c);
			    		System.out.println("\n-----------------------------------------------------------------------------------");
			    		System.out.printf("Amount                   :                                             %.2f ", sum);
			    		System.out.println("\n-----------------------------------------------------------------------------------");
			    		System.out.printf("Discount Received        :                                               %.2f ", discount);
			    		System.out.println("\n-----------------------------------------------------------------------------------");
			    		System.out.print("Service Charge (2%)      :                                               ");
			    		System.out.printf("%.2f ", charge);
			    		System.out.println("\n-----------------------------------------------------------------------------------");
			    		System.out.print("SST (6%)                 :                                               ");
			    		System.out.printf("%.2f ", tax);
			    		System.out.println("\n-----------------------------------------------------------------------------------");
			    		System.out.printf("Subtotal                 :                                             %.2f ", subtotal);
			    		System.out.println("\n-----------------------------------------------------------------------------------");
			    		System.out.printf("Cash                     :                                             %.2f ", cashPayment);
			    		System.out.println("\n-----------------------------------------------------------------------------------");
			    		System.out.printf("Balance                  :                                              %.2f ", sub);
			    		System.out.println("\n***********************************************************************************");
			    		System.out.println(freeGift);                                                                          
			    		System.out.println("***********************************************************************************");
			    		System.out.println("                                THANK YOU COME AGAIN                     ");
			    		System.out.println("***********************************************************************************");
			    		
			    		System.out.println();
			    		
			    		rice = ((0.4 + 0.4) * totalPassenger) + 16;
			    		meat = ((0.3 + 0.35)* totalPassenger) + 14.50;
			    		seafood = ((0.275 + 0.325) * totalPassenger) + 15;
			    		egg = ((0.05 + 0.06) * totalPassenger) + 22;
			    		vegetables = ((0.5 + 0.55) * totalPassenger) + 25;
			    		fruits = ((0.35 + 0.4) * totalPassenger) + 18;
			    		oil = ((0.035 + 0.06) * totalPassenger) + 2;
			    		flour = ((0.5 + 0.6) * totalPassenger) + 24;
			    		water = ((1.2 + 1.2) * totalPassenger) + 50;
			    		
			    		rice2 = (0.4 * noOfPassenger1a) + (0.4 * noOfPassenger1b) + (0.4 * noOfPassenger1c) + (0.4 * noOfPassenger2a) + (0.4 * noOfPassenger2b) + (0.4 * noOfPassenger2c) + 16;
			    		meat2 = (0.125 * noOfPassenger1a) + (0.245 * noOfPassenger1b) + (0.3 * noOfPassenger1c) + (0.225 * noOfPassenger2a) + (0.295 * noOfPassenger2b) + (0.350 * noOfPassenger2c) + 14.5;
			    		seafood2 = (0.14 * noOfPassenger1a) + (0.19 * noOfPassenger1b) + (0.275 * noOfPassenger1c) + (0.2 * noOfPassenger2a) + (0.25 * noOfPassenger2b) + (0.325 * noOfPassenger2c) + 15;
			    		egg2 = (0.03 * noOfPassenger1a) + (0.04 * noOfPassenger1b) + (0.05 * noOfPassenger1c) + (0.04 * noOfPassenger2a) + (0.05 * noOfPassenger2b) + (0.06 * noOfPassenger2c) + 22;
			    		vegetables2 = (0.3 * noOfPassenger1a) + (0.4 * noOfPassenger1b) + (0.5 * noOfPassenger1c) + (0.45 * noOfPassenger2a) + (0.5 * noOfPassenger2b) + (0.550 * noOfPassenger2c) + 25;
			    		fruits2 = (0.25 * noOfPassenger1a) + (0.3 * noOfPassenger1b) + (0.35 * noOfPassenger1c) + (0.325 * noOfPassenger2a) + (0.345 * noOfPassenger2b) + (0.4 * noOfPassenger2c) + 18;
			      		oil2 = (0.025 * noOfPassenger1a) + (0.03 * noOfPassenger1b) + (0.035 * noOfPassenger1c) + (0.04 * noOfPassenger2a) + (0.05 * noOfPassenger2b) + (0.06 * noOfPassenger2c) + 2;
			    		flour2 = (0.3 * noOfPassenger1a) + (0.4 * noOfPassenger1b) + (0.5 * noOfPassenger1c) + (0.4 * noOfPassenger2a) + (0.5 * noOfPassenger2b) + (0.6 * noOfPassenger2c) + 24;
			    		water2 = (1 * noOfPassenger1a) + (1.1 * noOfPassenger1b) + (1.2 * noOfPassenger1c) + (1 * noOfPassenger2a) + (1.1 * noOfPassenger2b) + (1.2 * noOfPassenger2c) + 50;
			    		
			    		rice3 = rice - rice2;
			    		meat3 = meat - meat2;
			    		seafood3 = seafood - seafood2;
			    		egg3 = egg - egg2;
			    		vegetables3 = vegetables - vegetables2;
			    		fruits3 = fruits - fruits2;
			    		oil3 = oil - oil2;
			    		flour3 = flour - flour2;
			    		water3 = water - water2;
			    		
			    		tot = rice3 + meat3 + seafood3 + egg3 + vegetables3 + fruits3 + oil3 + flour3 + water3;
			    		
			    		System.out.println("The remaining ingredients are shown below : ");
			    		System.out.println();
			    		
			    		System.out.println("                   LIBERTY CRUISE                      ");
			    		System.out.println("             RESIDUAL INGREDIENTS COUNT                ");
			    		System.out.println("-----------------------------------------------------");
			    		System.out.println("Ingredients");
			    		System.out.println("-----------------------------------------------------");
			    		System.out.println("No          Item Name                 Kilograms");
			    		System.out.println("------------------------------------------------------");
			    		System.out.printf("1            Rice                      %.2f ", rice);
			    		System.out.printf("\n             Used Rice                 %.2f ", rice2);
			    		System.out.printf("\n             Remaining Rice            %.2f ", rice3);
			    		System.out.println("\n------------------------------------------------------");
			    		System.out.printf("2            Meat                      %.2f ", meat);
			    		System.out.printf("\n             Used Meat                 %.2f ", meat2);
			    		System.out.printf("\n             Remaining Meat            %.2f ", meat3);
			    		System.out.println("\n------------------------------------------------------");
			    		System.out.printf("3            Seafood                   %.2f ", seafood);
			    		System.out.printf("\n             Used Seafood              %.2f ", seafood2);
			    		System.out.printf("\n             Remaining Seafood         %.2f ", seafood3);
			    		System.out.println("\n------------------------------------------------------");
			    		System.out.printf("4            Egg                       %.2f ", egg);
			    		System.out.printf("\n             Used Egg                  %.2f ", egg2);
			    		System.out.printf("\n             Remaining Egg              %.2f ", egg3);
			    		System.out.println("\n------------------------------------------------------");
			    		System.out.printf("5            Vegetables                %.2f ", vegetables);
			    		System.out.printf("\n             Used Vegetables           %.2f ", vegetables2);
			    		System.out.printf("\n             Remaining Vegetables      %.2f ", vegetables3);
			    		System.out.println("\n------------------------------------------------------");
			    		System.out.printf("6            Fruits                    %.2f ", fruits);
			    		System.out.printf("\n             Used Fruits               %.2f ", fruits2);
			    		System.out.printf("\n             Remaining Fruits          %.2f ", fruits3);
			    		System.out.println("\n------------------------------------------------------");
			    		System.out.printf("7            Oil                        %.2f ", oil);
			    		System.out.printf("\n             Used Oil                   %.2f ", oil2);
			    		System.out.printf("\n             Remaining Oil              %.2f ", oil3);
			    		System.out.println("\n------------------------------------------------------");
			    		System.out.printf("8            Flour                     %.2f ", flour);
			    		System.out.printf("\n             Used Flour                %.2f ", flour2);
			    		System.out.printf("\n             Remaining Flour           %.2f ", flour3);
			    		System.out.println("\n------------------------------------------------------");
			    		System.out.printf("9            Water                    %.2f ", water);
			    		System.out.printf("\n             Used Water                %.2f ", water2);
			    		System.out.printf("\n             Remaining Water           %.2f ", water3);
			    		System.out.printf("\n------------------------------------------------------");
			    		System.out.printf("\nTOTAL        :                      %.2f ", tot);  
			    		System.out.printf("\n------------------------------------------------------");
			    		
			    		System.out.println();
			    		
			    		remainIngCA = noOfPassenger1a * sum1c;
			    		remainIngCB = noOfPassenger1b * sum2c;
			    		remainIngCC = noOfPassenger1c * sum3c;
			    		remainIngWA = noOfPassenger2a * sum1w;
			    		remainIngWB = noOfPassenger2b * sum2w;
			    		remainIngWC = noOfPassenger2c * sum3w;
			    		totRemain = totMass - (remainIngCA + remainIngCB + remainIngCC + remainIngWA + remainIngWB + remainIngWC + totIngredientB);
			    		System.out.println();
			    		System.out.printf("Remaining ingredients in the kitchen : %.2f kg", totRemain);
			    		System.out.println("\n***The ingredients of Buffet already finished during the preparation.***");
					
					} else if (outfit.equalsIgnoreCase("flexible")) {
			    		System.out.println("Sorry! You are not allow to enter the restaurant as your outfit is not appropriate.");	
			    	} else {
			    		System.out.println("Invalid outfit");
			    	}
					
			    } else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch == '@') || (ch == '#')) {
			    	System.out.println("Register unsuccessful");
			    } else {
			    	System.out.println("Invalid cruise ticket ID");
			    }
			    System.exit(0);
			    
			} else {
				System.out.println("Access Failed");	
			}
			
			counter = counter + 1;
			System.out.println("Right Here!!! Number of Count : " + counter);	
		
			if (counter >= 3) 
			{
				access = false;
				System.out.println("3 tries exceeded! You are not allowed to enter the order system.");
				System.exit(0);
			}
			
		} while (access == true);
	}

}

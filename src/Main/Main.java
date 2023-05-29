package Main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pizza p = new Pizza();
		 Scanner input = new Scanner(System.in);
		 System.out.println("\n\n-----------------------------------------------------");
		System.out.print("Pls take your order: ");
		char i = input.next().charAt(0);
		System.out.print("\n-----------------------------------------------------\n");
		System.out.println("Discount:");
		int d= input.nextInt();
		System.out.print("%");
		switch (i) {
		
		
		case 'a':
			PepperoniPizza pp = new PepperoniPizza ();	
			
		break;
		
		case 'b':
			Hawaiian H = new Hawaiian();
			break;
			
		case 'c':
			Buffalo B = new Buffalo();
			break;
			
		case 'd':
			Allmeat Am = new Allmeat();
			break;
	
		default:
		     
			System.out.println("Invalid");
		}
		
		
		
		
	}

}

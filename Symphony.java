package com.assignment;

import java.util.Scanner;

public class Symphony {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String userInput = null;
		String userInputMake = null;
		String userInputModel = null;
		int organPart = 0;
		boolean userError = true;
		
		PipeOrgan xanderOrgan = new PipeOrgan();
		
		System.out.println("Welcome to the Build-an-Organ generator. \n"
				+ "What make of organ are you seeking to purchase?");
		 userInputMake = sc.nextLine();
		
		 
		do {
			System.out.println("What is the model number of the organ are you looking to"
					+ " purchase?");
			userInputModel = sc.nextLine();
			userError = inputIsInvalid(userInputModel);
			} while (userError);
		
		organPart = Integer.parseInt(userInputModel);
		xanderOrgan.setOrgan(organPart);
		System.out.println("You will have a " + organPart + " model custom built. \n");
		
		
		do {
			userError = false;
			
			System.out.println("How many wood panels would you like on the "
					+ "organ housing?");
			userInput = sc.nextLine();
			
			userError = inputIsInvalid(userInput);
		} while (userError);
		
		organPart = Integer.parseInt(userInput);
		xanderOrgan.setWood(organPart);
		System.out.println("Your organ will have " + organPart + " wooden panels. \n");
		
		
		do {
			userError = false;
			
			System.out.println("How many manuals would you like on the organ?");
			userInput = sc.nextLine();
			
			userError = inputIsInvalid(userInput);
		} while (userError);
		
		organPart = Integer.parseInt(userInput);
		xanderOrgan.setManuals(organPart);
		System.out.println("Your organ will have " + organPart + " manuals. \n");
		
		
		do {
			userError = false;
			
			System.out.println("How many pedals would you like on the organ?");
			userInput = sc.nextLine();
			
			userError = inputIsInvalid(userInput);
		} while (userError);
		
		organPart = Integer.parseInt(userInput);
		xanderOrgan.setPedals(organPart);
		System.out.println("Your organ will have " + organPart + " pedals integrated into the organ. \n");
		
		
		do {
			userError = false;
			
			System.out.println("How many pipes would you like to limit on your organ?");
			userInput = sc.nextLine();
			
			userError = inputIsInvalid(userInput);
		} while (userError);
		
		organPart = Integer.parseInt(userInput);
		xanderOrgan.setPipes(organPart);
		System.out.println("Your organ will be limited to " + organPart + " pipes. \n");
		
		
		do {
			userError = false;
			
			System.out.println("How many stops would you like to utilize on your organ?");
			userInput = sc.nextLine();
			
			userError = inputIsInvalid(userInput);
		} while (userError);
		
		organPart = Integer.parseInt(userInput);
		xanderOrgan.setStops(organPart);
		System.out.println("Your organ will utilize " + organPart + " stops on your organ. \n");
		
		
		do {
			userError = false;
			
			System.out.println("How many music lamps would you like integrated on your music stand?");
			userInput = sc.nextLine();
			
			userError = inputIsInvalid(userInput);
		} while (userError);
		
		organPart = Integer.parseInt(userInput);
		xanderOrgan.setLights(organPart);
		System.out.println("Your organ will utilize " + organPart + " lamps as a part of the music stand. \n");
		
		
		do {
			userError = false;
			
			System.out.println("How many cabinet shutters would you like to have built for the pipe cabinet?");
			userInput = sc.nextLine();
			
			userError = inputIsInvalid(userInput);
		} while (userError);
		
		organPart = Integer.parseInt(userInput);
		xanderOrgan.setShutters(organPart);
		System.out.println("Your organ will have " + organPart + " built for the pipe cabinet. \n");

		
		do {
			userError = false;
			
			System.out.println("How many pipe racks would you like to have for pipe configuration?");
			userInput = sc.nextLine();
			
			userError = inputIsInvalid(userInput);
		} while (userError);
		
		organPart = Integer.parseInt(userInput);
		xanderOrgan.setRacks(organPart);
		System.out.println("Your organ's pipes will be arranged in " + organPart + " racks. \n");

		
		do {
			userError = false;
			
			System.out.println("How many benches would you like to purchase with your organ?");
			userInput = sc.nextLine();
			
			userError = inputIsInvalid(userInput);
		} while (userError);
		
		organPart = Integer.parseInt(userInput);
		xanderOrgan.setBenches(organPart);
		System.out.println("Your organ will be made with " + organPart + " matching benches. \n\n\n");	

		
		System.out.println(xanderOrgan.toString());
		System.out.println(" ");
		System.out.println("Thank you for your order!  Your custom built " + userInputMake
				+ " model #" + userInputModel + " will be ready \n in approximately 9 months.  We "
				+ "look forward to keeping you updated on the progress \n of your one-of-a-kind pipe organ.");
	}
	
	
	public static boolean inputIsInvalid(String decisonMaker) {
		try {
			int testEntry = Integer.parseInt(decisonMaker);
			return false;
		} catch (NumberFormatException e) {
			return true;
		}
	}
	
}

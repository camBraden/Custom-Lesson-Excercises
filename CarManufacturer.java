/*Make a program that sells 3 brand new cars for a 
brand new company. Each car should also have 3 trim
levels that come with specific features*/ 

import java.util.Scanner;

public class CarManufacturer {

	
		String color;
		String bodyType;
		int price;
		String trim;

		


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int carBase = 30000;//cloth seats 400
		int carBetter = 32000;//leather seats 450
		int carBest = 35000;//heated leather seats 500
		int suvBase = 45000;//cloth seats 500
		int suvBetter = 47000;//leather seats 600
		int suvBest = 50000;//heated leather seats 700
		int motorcycleBase = 80000;//cloth seats 175
		int motorcycleBetter = 85000;//leather seats 200
		int motorcycleBest = 90000;//heated leather seats 225

		System.out.println("Welcome to CarLine. We currently sell 3 different models:\n \n 1) Sports Car \n Base - has cloth seats and 400 hp\n Better - has leather seats and 450 hp\n Best - has heated leather seats and 500 hp");
		System.out.println(" 2) SUV \n Base - has cloth seats and 500 hp\n Better - has leather seats and 600 hp\n Best - has heated leather seats and 700 hp");
		System.out.println(" 3) Motorcycle \n Base - has cloth seats and 175 hp\n Better - has leather seats and 200 hp\n Best - has heated leather seats and 225 hp");
		System.out.println();
		System.out.print("Which vehicle would you like to buy? \n 1. Sports Car \n 2. SUV \n 3. Motorcycle ");
		int vehicleChoice = input.nextInt();
		input.nextLine();

		System.out.println();
		if (vehicleChoice == 1){
			CarManufacturer sportsCar = new CarManufacturer();
			sportsCar.bodyType = "Sports Car";
			System.out.println("Which color would you like?: ");
			sportsCar.color = input.nextLine();
			System.out.println("Which trim level would you like?\n1. Base \n2. Better \n3. Best");
			int level = input.nextInt();
			if (level == 1) {
				sportsCar.trim = "Base";
				sportsCar.price = carBase;
			} else if (level == 2) {
				sportsCar.trim = "Better";
				sportsCar.price = carBetter;
			} else if (level == 3) {
				sportsCar.trim = "Best";
				sportsCar.price = carBest;
			}
			System.out.println("You configured the " + sportsCar.trim + " " + sportsCar.bodyType);
			System.out.println("Your color is " + sportsCar.color);
			System.out.println("Your price is $" + sportsCar.price);

		} else if (vehicleChoice == 2) {
			CarManufacturer suv = new CarManufacturer();
			suv.bodyType = "SUV";
			System.out.println("Which color would you like?: ");
			suv.color = input.nextLine();
			System.out.println("Which trim level would you like?\n1. Base \n2. Better \n3. Best");
			int level = input.nextInt();
			if (level == 1) {
				suv.trim = "Base";
				suv.price = suvBase;
			} else if (level == 2) {
				suv.trim = "Better";
				suv.price = suvBetter;
			} else if (level == 3) {
				suv.trim = "Best";
				suv.price = suvBest;
			}
			System.out.println("You configured the " + suv.trim + " " + suv.bodyType);
			System.out.println("Your color is " + suv.color);
			System.out.println("Your price is $" + suv.price);

		} else if (vehicleChoice == 3) {
			CarManufacturer motorcycle = new CarManufacturer();
			motorcycle.bodyType = "Motorcycle";
			System.out.println("Which color would you like?: ");
			motorcycle.color = input.nextLine();
			System.out.println("Which trim level would you like?\n1. Base \n2. Better \n3. Best");
			int level = input.nextInt();
			if (level == 1) {
				motorcycle.trim = "Base";
				motorcycle.price = motorcycleBase;
			} else if (level == 2) {
				motorcycle.trim = "Better";
				motorcycle.price = motorcycleBetter;
			} else if (level == 3) {
				motorcycle.trim = "Best";
				motorcycle.price = motorcycleBest;
			}


			
			System.out.println("You configured the " + motorcycle.trim + " " + motorcycle.bodyType);
			System.out.println("Your color is " + motorcycle.color);
			System.out.println("Your price is $" + motorcycle.price);
		}
		CarManufacturer truck = new CarManufacturer();
			truck.color = "Red";
			truck.bodyType = "Truck";
			truck.price = 50000;
			truck.trim = "base";

			System.out.println(truck.color + truck.bodyType + truck.price + truck.trim);
	}	
}
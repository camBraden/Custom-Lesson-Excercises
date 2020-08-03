import java.util.*;

class pizzaChamp {
  public static void main(String[] args) {
  	Scanner input = new Scanner(System.in);

  	double sPepp = 18.50; //AA
  	double mPepp = 20.00; //AB
  	double lPepp = 21.50; //AC

  	double sCheese = 17.00; //BA
  	double mCheese = 18.50; //BB
  	double lCheese = 20.00; //BC

  	double sMeat = 23.00; //CA
  	double mMeat = 24.50; //CB
  	double lMeat = 26.00; //CC

  	double sGarlic = 21.50; //DA
  	double mGarlic = 23.00; //DB
  	double lGarlic = 24.50; //DC
  	
  	double totalCost = 0.0;
  	int i = 0;

  	System.out.print("How many pizzas do you want to order? ");
  	int numOfPizzas = input.nextInt();
  	input.nextLine();
  	double[] pizzaPrices = new double[numOfPizzas];
  	
  	for (numOfPizzas = numOfPizzas; numOfPizzas > 0; numOfPizzas -= 1) {
  		String pizzaCode = "";
  		System.out.println("What type of pizza do you want pizza " + (i + 1) + " to be? A. Pepperoni B. Cheese C. Meat Lovers D. Garlic");
  		pizzaCode += input.nextLine(); //pizzaCode = pizzaCode + input.nextLine();

  		System.out.println("What size do you want for pizza " + (i + 1) + "? A. Small B. Medium C. Large");
  		pizzaCode += input.nextLine();

  		System.out.println(pizzaCode);

  		if (pizzaCode.equals("AA")) {
  			pizzaPrices[i] = sPepp;
  		}
  		if (pizzaCode.equals("AB")) {
  			pizzaPrices[i] = mPepp;
  		}
  		if (pizzaCode.equals("AC")) {
  			pizzaPrices[i] = lPepp;
  		}
  		if (pizzaCode.equals("BA")) {
  			pizzaPrices[i] = sCheese;
  		}
  		if (pizzaCode.equals("BB")) {
  			pizzaPrices[i] = mCheese;
  		}
  		if (pizzaCode.equals("BC")) {
  			pizzaPrices[i] = lCheese;
  		}
  		if (pizzaCode.equals("CA")) {
  			pizzaPrices[i] = sMeat;
  		}
  		if (pizzaCode.equals("CB")) {
  			pizzaPrices[i] = mMeat;
  		}
  		if (pizzaCode.equals("CC")) {
  			pizzaPrices[i] = lMeat;
  		}
  		if (pizzaCode.equals("DA")) {
  			pizzaPrices[i] = sGarlic;
  		}
  		if (pizzaCode.equals("DB")) {
  			pizzaPrices[i] = mGarlic;
  		}
  		if (pizzaCode.equals("DC")) {
  			pizzaPrices[i] = lGarlic;
  		}

  		i++;
  	}

  	for (int j = 0; j < pizzaPrices.length; j++) {
  		double discount = j * 0.05 * pizzaPrices[j];
  		if (j >= 5) {
  			discount = 4 * 0.05 * pizzaPrices[j];
  		}
  		totalCost += pizzaPrices[j] - discount;
  	}

  	System.out.println("The total price of your order is $" + totalCost);
  }
}
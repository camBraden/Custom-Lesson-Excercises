import java.util.*;

class reverse {
  public static void main(String[] args) { //Important Stuff
    Random rand = new Random();

    int[] numbers = {0, 0, 0, 0, 0};
    int[] reverse = {0, 0, 0, 0, 0};
    int index = 0;

    for(int i = 0; i < numbers.length; i++) {
      System.out.print("Enter number " + (i + 1) +": ");
      numbers[i] = rand.nextInt(100) + 1;
    }

    for(int i = numbers.length - 1; i >= 0; i--) {
      reverse[index] = numbers[i];
      System.out.print(numbers[i] + " ");
    }

  }
}
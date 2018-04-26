package adhorneIntegration;

import java.util.Scanner;

public class Demo {

  // Exceptions are used to handle errors in your program that help from your
  // your programming crashing and also a way to know what went wrong if 
  // someone else is using your program.

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int x = 1;
    {

      do {

        try {
          System.out.println("Enter first num: ");
          int n1 = input.nextInt();
          System.out.println("Enter second num: ");
          int n2 = input.nextInt();
          int sum = n1 / n2;
          System.out.println(sum);
          x = 2;
        } catch (Exception exp) {
          System.out.println("You can't divide by that number.");
        }

      } while (x == 1);

    }

  }

}

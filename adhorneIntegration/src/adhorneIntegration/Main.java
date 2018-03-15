package adhorneIntegration;

import java.util.Scanner;

public class Main {
  // Austin Horne
  // Showing off my skills that I learned.
  public static void main(String[] args) {
    // System.out.println("Hello World!");

    // Scanner scan = new Scanner(System.in);

    // Variable is a value that can be changed.
    // Primitive types are the most
    // basic data types available
    // within the Java language.
    // There are 8: boolean, byte,
    // char, short, int, long,
    // float and double.
    // These types serve as the
    // building blocks of data
    // manipulation in Java.
    // Numeric primitives: short,
    // int, long, float and double.
    // These primitive data types
    // hold only numeric data.
    // Operations associated with
    // such data types are
    // those of simple arithmetic
    // (addition, subtraction, etc.)
    // or of comparisons
    // (is greater than, is equal to, etc.)
    // Textual primitives: byte and char.
    // These primitive data types
    // hold characters
    // (that can be Unicode alphabets or even numbers).
    // Operations associated with
    // such types are those
    // of textual manipulation
    // (comparing two words,
    // joining characters to make words, etc.).
    // However, byte and char
    // can also support arithmetic operations.
    // Boolean and null primitives: boolean and null (true and false).
    // ctrl shift f

    int result = 6 + 2;
    // result is now 8
    System.out.println("1 + 2 = " + result);
    int original_result = result;

    result = result - 1;
    // result is now 7
    System.out.println(original_result + " - 1 = " + result);
    original_result = result;

    result = result * 2;
    // result is now 14
    System.out.println(original_result + " * 2 = " + result);
    original_result = result;

    result = result / 2;
    // result is now 7
    System.out.println(original_result + " / 2 = " + result);
    original_result = result;

    result = result + 8;
    // result is now 15
    System.out.println(original_result + " + 8 = " + result);
    original_result = result;

    result = result % 7;
    // result is now 1
    System.out.println(original_result + " % 7 = " + result);

    // Java does integer division,
    // which basically is the same
    // as regular real division,
    // but you throw away
    // the remainder (or fraction).

    int x = 7;
    int y = 3;
    System.out.println(x / y);

    int myInt = 15;

    if (myInt < 10) {
      System.out.println("Yes, it's true!");
    } else if (myInt > 20) {
      System.out.println("No, it's false!");
    } else {
      System.out.println("None of the above.");
    }

    int num = 2;
    switch (num + 2) {
      case 1:
        System.out.println("Case1: Value is: " + num);
      case 2:
        System.out.println("Case2: Value is: " + num);
      case 3:
        System.out.println("Case3: Value is: " + num);
      default:
        System.out.println("Default: Value is: " + num);
    }

    Bicycle myBike = new Bicycle();
    myBike.setSpeed(5);
    System.out.println(myBike.getSpeed());

    Dog casey = new Dog();
    String breed = "beagle";
    String breed2 = "Beagle";
    String breed3 = "  Beagle  ";
    casey.weight = (double) 21.34;
    casey.age = 14;
    casey.prize = 300;
    System.out.println(breed.toUpperCase().charAt(0) + breed.substring(1));
    System.out.println(breed2.toLowerCase().charAt(0) + breed2.substring(1));
    System.out.println(breed3.trim());
    System.out.println(casey.weight);
    System.out.println(casey.age);
    System.out.println(casey.prize);

    Cat myCat = new Cat();
    myCat.setColor("tabby");

    Car myFord = new Car();
    myFord.setSpeed(45);
    System.out.println(myFord.getSpeed());

    // Integration PSI 2:

    int values[] = { 10, 34, 45, 23, 15 };
    int sum = 0;
    int largest = values[0];
    int smallest = values[0];

    for (int counter = 0; counter < values.length; counter++) {
      sum += values[counter];
      if (values[counter] > largest) {
        largest = values[counter];
      } else if (values[counter] < smallest) {
        smallest = values[counter];
      }
    }

    System.out.println("Total = " + sum);
    System.out.println("Average = " + sum / values.length);
    System.out.println("Largest = " + largest);
    System.out.println("Smallest = " + smallest);

    // For loop

    for (int counter = 1; counter <= 10; counter++) {
      System.out.println(counter);
    }

    // While loop

    int counter = 0;

    while (counter < 10) {
      System.out.println(counter);
      counter++;
    }

    // StringBuilder

    String palindrome = "Racecar";
    StringBuilder sb = new StringBuilder(palindrome);
    sb.reverse(); // reverse it
    System.out.println(sb); 
    
    StringBuilder str = new StringBuilder("Austin Horne");
    str.insert(6, " Dwight ");
    System.out.println(str); 
    
    StringBuilder de = new StringBuilder("I ate 1000 Strawberries");
    de.delete(8, 10);
    System.out.println(de);

    // Overloaded Constructor piece

    Machine machine1 = new Machine();
    Machine machine2 = new Machine("Bertie");
    Machine machine3 = new Machine("Chalky", 7);

    // Static means belonging to the class not to the object.

    // Finding index of an array.

    int[] scores = { 100, 45, 56, 34, 78 };

    boolean found;

    int index;

    found = false;

    index = 0;

    while (found == false && index < scores.length) {
      if (scores[index] == 78)
        found = true;
      else
        index = index + 1;
    }
    if (found)
      System.out.println("You earned 78 on test number " + (index + 1));
    else
      System.out.println("You did not earn an 78 on any test.");
  }

}

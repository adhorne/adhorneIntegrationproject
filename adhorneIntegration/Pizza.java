package adhorneIntegration;

public class Pizza extends Food {

  // This is overriding the pizza class that extends food.

  @Override
  public void eat() {
    System.out.println("I love pizza more than wings.");
  }

}

package adhorneIntegration;

public class Car {
  private int speed;
  private String make;

  public Car() {
    speed = 45;
    make = "Ford";
  }

  public Car(int s, String m) {
    speed = s;
    make = m;
  }

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int s) {
    speed = s;
  }

  public String getMake() {
    return make;
  }

  public void setSpeed(String m) {
    make = m;
  }
}

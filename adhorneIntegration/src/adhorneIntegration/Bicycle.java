package adhorneIntegration;

// Austin Horne 
// A demonstration of classes
/**
 * Storing the speed and cadences of a cyclist.
 * @author adhorne0633
 *
 */
public class Bicycle {
  private int speed;
  private int cadence;

  /**
   * Gets the speed of the bicycle.
   * @return the speed of the bicycle.
   */
  public int getSpeed() {
    return speed;
  }

  /**
   * Sets the speed of the bicycle.
   * @param s The speed of the bicycle as a int value. 
   */
  public void setSpeed(int s) {
    speed = s;
  }

  /**
   * Gets the cadence of the bicycle.
   * @return the cadence of the bicycle  
   */
  public int getCadence() {
    return cadence;
  }

  /**
   * Sets the cadence of the bicycle. 
   * @param cadence The cadence of the bicycle as a int value. 
   */
  public void setCadence(int cadence) {
    this.cadence = cadence;
  }
}

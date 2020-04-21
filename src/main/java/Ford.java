public class Ford extends Car {

  private String color="white";

  Ford() {
    color = "white";
  }

  Ford(String color) {
    this.color = color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void driveFastBecauseItsFord() {

  }

  public static String name() {
    return "Ford";
  }
}

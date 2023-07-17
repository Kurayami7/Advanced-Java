package example1;

public class Candy extends DessertItem {

  private int price;
  private double pounds;

  public Candy(String name, double pounds, int price) {
    super(name);
    this.price = price;
    this.pounds = pounds;
  }

  @Override
  public int getCost() {
    // TODO Auto-generated method stub
    return (int) Math.round(price * pounds);
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public double getPounds() {
    return pounds;
  }

  public void setPounds(double pounds) {
    this.pounds = pounds;
  }

  @Override
  public void whoAmI() {
    System.out.println("I am a candy");
  }

}

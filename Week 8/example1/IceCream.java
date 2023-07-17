package example1;

public class IceCream extends DessertItem {

  private int price;

  public IceCream() {

  }

  public IceCream(String name, int price) {
    super(name);

    this.price = price;
  }

  @Override
  public int getCost() {
    // TODO Auto-generated method stub
    return price;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  @Override
  public void whoAmI() {
    System.out.println("I am an icecream");
  }

}

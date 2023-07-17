package example1;
public class Cookie extends DessertItem {

	private int number, price;
	
	public Cookie(String name, int number, int price) {
		super(name);
		
		this.number = number;
		this.price = price;
	}

	@Override
	public int getCost() {
		
		double pricePerCookie =(double) price / 12.0;
		int cost = (int) Math.round( pricePerCookie * number);
		return cost;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

  @Override
  public void whoAmI(){
    System.out.println("I am a cookie");
  }

  

}

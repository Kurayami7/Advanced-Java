import java.util.ArrayList;
public class Main {

  public static void main(String[] args) {

    // Declare and create Product array of size 5
    Product[] pa = new Product[5];

    Book hobbit = new Book(22.50, "Houghton ", 2012);
    MP3Player appleWatch = new MP3Player(450, "Apple", "black");
    TV LGMTV = new TV(299.95, "LG", 31);

    // Product product = new Product();
    ArrayList<Product> products = new ArrayList<Product>();
    products.add(hobbit);
    products.add(appleWatch);
    products.add(LGMTV);

    // Create object instances
    pa[0] = new TV(1000, "Samsung", 30);
    pa[1] = new TV(2000, "Sony", 50);
    pa[2] = new MP3Player(250, "Apple", "blue");
    pa[3] = new Book(34, "Sun press", 1992);
    pa[4] = new Book(15, "Korea press", 1986);

    // Compute total regular price and total
    // sale price.
    double totalRegularPrice = 0;
    double totalSalePrice = 0;

    for (int i = 0; i < pa.length; i++) {

      // Call a method of the super class to get
      // the regular price.
      totalRegularPrice += pa[i].getRegularPrice();

      // Since the sale price is computed differently
      // depending on the product type, overriding
      // method of the object instance of the sub-class
      // gets invoked. This is runtime polymorphic
      // behavior.
      totalSalePrice += pa[i].computeSalePrice();

      System.out.println("Item number " + i +
          ": Type = " + pa[i].getClass().getName() +
          ", Regular price = " + pa[i].getRegularPrice() +
          ", Sale price = " + pa[i].computeSalePrice());
    }
    System.out.println();
    System.out.println("totalRegularPrice = " + totalRegularPrice);
    System.out.println("totalSalePrice = " + totalSalePrice);

    System.out.println();

    for (Product item : products) {
      item.usage();
      // Just checking if the current instance is an MP3Player object, then converting the item to an MP3Player object to use the method. Otherwise, it would call that method on the product class, and the method doesn't exist on the product class

      if (item instanceof MP3Player) {
        ((MP3Player) item).payWarrantyFees();
      }

      if (item instanceof TV) {
        ((TV) item).payWarrantyFees();
      }
      System.out.println();
    }
  }
}
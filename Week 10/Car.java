import java.util.Scanner;
import java.io.*;

// Derived Class Car
class Car extends Vehicle {

  // Private field
  private String bodyStyle;

  // Parameterized Constructor
  public Car(String make, String color, int year, String model, String bodyStyle) {
    super(make, color, year, model); // calling parent class constructor
    this.bodyStyle = bodyStyle;
  }

  public void carDetails() { // details of car
    printDetails(); // calling method from parent class
    System.out.println("Body Style: " + bodyStyle);
  }

  public void readMap1() {
    try {
      Scanner scanner = new Scanner(System.in);
      FileReader reader = new FileReader("file.txt");

      // passing FileReader to
      // buffered reader
      BufferedReader br = new BufferedReader(reader);

      // declaring empty string
      String data = null;

      // while loop to read data
      // and printing them
      while ((data = br.readLine()) != null) {
        System.out.println(data);
      }

      // closing the object
      br.close();
    } catch (FileNotFoundException ex) {
      System.out.println(ex.getMessage());
    } catch (IOException e) {
      System.out.println(e.getMessage());
    } finally { // A block that runs regardless of any exceptions (positive/negative)
      System.out.println("Closing connections to all files and databases");
    }
  }

  public void readMap2() throws FileNotFoundException, IOException {
    Scanner scanner = new Scanner(System.in);
    FileReader reader = new FileReader("file.txt");

    // passing FileReader to
    // buffered reader
    BufferedReader br = new BufferedReader(reader);

    // declaring empty string
    String data = null;

    // while loop to read data
    // and printing them
    while ((data = br.readLine()) != null) {
      System.out.println(data);
    }

    // closing the object
    br.close();
  }

  public void accelerate() throws OverspeedingException {
    Scanner scanner = new Scanner(System.in);
    System.out.println("What speed do you like to drive at ?:");
    int speed = scanner.nextInt();

    if (speed > 150) {
      throw new OverspeedingException();
    }
  }

}
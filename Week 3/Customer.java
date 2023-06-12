import java.util.Scanner;

public class Customer {
  private String SIN, Name, ContactNo;

  public void setSIN(String SIN) {
    this.SIN = SIN;
  }

  public String getSIN() {
    return SIN;
  }

  public void setName(String Name) {
    this.Name = Name;
  }

  public String getName() {
    return Name;
  }

  public void setContactNo(String ContactNo) {
    this.ContactNo = ContactNo;
  }

  public String getContactNo() {
    return ContactNo;
  }

  Phone workPhone = new Phone();
  Phone personalPhone = new Phone();

  public double calculateAverageBillWork() {
    Scanner scanner = new Scanner(System.in);
    double totalBill = 0;
    double avgBill = 0;
    int months = 12;

    for (int month = 1; month <= months; month++) {
      System.out.println("Please enter your bill for month " + month + ": ");
      double bill = scanner.nextDouble();
      totalBill += bill;
    }
    avgBill = totalBill / (double) months;
    return avgBill;
  }

  public double calculateAverageBillPersonal() {
    Scanner scanner = new Scanner(System.in);
    int month = 1;
    int months = 12;
    double totalBill = 0;
    double avgBill = 0;
    scanner.next();

    while (month <= months) {
      System.out.println("Enter your bill for month " + month + ": ");
      double bill = scanner.nextDouble();
      totalBill += bill;
      month++;
    }
    avgBill = totalBill / months;
    return avgBill;
  }

  // Task 6
  public float calculateOverallAverage() {
    float avgWBill = (float) calculateAverageBillWork();
    float avgPBill = (float) calculateAverageBillPersonal();
    return Calculator.performCalculation(avgWBill, avgPBill, "avg");
  }

}

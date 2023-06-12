class Main {
  public static void main(String[] args) {
    Customer customer = new Customer();

    customer.setName("Legend");
    customer.setContactNo("4374503090");
    customer.setSIN("9029051020");

    Phone workPhone = new Phone();
    workPhone.setIMEI("92183120");
    workPhone.setBrand("Xiaomi");
    workPhone.setModel("Poco X3 Pro");

    Phone personalPhone = new Phone();
    personalPhone.setIMEI("210921013");
    personalPhone.setBrand("Apple");
    personalPhone.setModel("IPhone13 Pro");

    double avgWorkBill = customer.calculateAverageBillWork();
    System.out.println();
    System.out.println("*** *** *** *** ***");
    System.out.println("Work phone's average bill: " + avgWorkBill);
    System.out.println();

    double avgPersonalBill = customer.calculateAverageBillPersonal();
    System.out.println();
    System.out.println("*** *** *** *** ***");
    System.out.println("Personal phone's average bill: " + avgPersonalBill);
    System.out.println();

    double overallAvg = customer.calculateOverallAverage();
    System.out.println();
    System.out.println("*** *** *** *** ***");
    System.out.println("The overall average of both phone types is: " + overallAvg);
    System.out.println();

    Phone.callEmergency();
  }
}
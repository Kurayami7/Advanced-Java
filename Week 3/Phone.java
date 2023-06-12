public class Phone{
  private String IMEI, brand, model;
  private static int emergency = 911;

  public void setIMEI(String IMEI) {
    this.IMEI = IMEI;
  }

  // Used replit's built-in feature to generate getters/setters after this point
  public String getIMEI() {
  	return IMEI;
  }
  
  public String getBrand() {
  	return brand;
  }
  
  public void setBrand(String brand) {
  	this.brand = brand;
  }
  
  public String getModel() {
  	return model;
  }
  
  public void setModel(String model) {
  	this.model = model;
  }

  
  // Task 9 - Static method
  public static void callEmergency() {
    System.out.println("Dialing " + emergency);
  }
}
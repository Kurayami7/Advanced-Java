public class Laptop {
  private String name;
  private String serialNo;
  private int price;
  private int manDate; // Manufacture date
  private String user;
  private String browser;

  public void setName(String name) {
	this.name = name;
}
  public String getName() {
    return name;
  }

public String getSerialNo() {
	return serialNo;
}

public void setSerialNo(String serialNo) {
	this.serialNo = serialNo;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public int getManDate() {
	return manDate;
}

public void setManDate(int manDate) {
	this.manDate = manDate;
}

public String getUser() {
	return user;
}

public void setUser(String user) {
	this.user = user;
}

public String searchWeb (String nameOfBrowser) {
  browser = nameOfBrowser;
  return browser;
}

  
}
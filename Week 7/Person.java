public class Person {
  protected long SIN;
  protected String fullName;
  public String address;

  public Person(){
    System.out.println("Person constructor 1");
    SIN =0;
    fullName="John Doe";
    address="ILAC Dream Building";
  }

  
  public Person(long s, String f, String a){
    System.out.println("Person constructor 2");
    SIN=s;
    fullName=f;
    address=a;
  }
  
  public void setSIN(long SIN) {
    this.SIN = SIN;
  }

  public long getSIN() {
    return SIN;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getFullName() {
    return fullName;
  }

 public void print(){
    //both private and public - methods and variables come from parent to children. 
    System.out.println("SIN is "+SIN);
    System.out.println("FullName is "+fullName);
   System.out.println("Address is "+address);
  }
}
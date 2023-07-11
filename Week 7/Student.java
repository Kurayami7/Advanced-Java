public class Student extends Person {

  private String studentID;
  private double CGPA;

  public Student() {
    /*
     * In the first line of default constructor of any child class, there is a
     * hidden call to parent class default constructor.
     * 
     * Reason : Student is a person. To become a student, first you ahve to be a
     * person.
     */

    studentID = "200531053";
    CGPA = 5;
    // SIN = 10000000;
    // fullName = "James Bond";
    // address = "425 Bloor Street East";
    // System.out.println("Student class constructor 1");
  }

  // Parameterized constructor
  public Student(long s, String f, String a, String sid, double c) {
    // Even in parameterized constructor, there is a hidden call to default
    // constructor.
    super(s, f, a); // super in this class is Person.java, the parent
    studentID = sid;
    CGPA = c;
  }

  public void setSID(String sid) {
    studentID = sid;
  }

  public String getSID() {
    return studentID;
  }
  // Q: Can parent class and child class have a method with exact same ? If you
  // use same method name in parent and child, childs method will overpower the
  // parent method. OVERRIDING

  // @override is an annotation. Annotations start with @ symbol. Extra
  // information/meta-information given to the compiler also to other coders

  // Q: Are constructors inherited ? NO, they are inherited.

  @Override
  public void print() {
    // System.out.println("Sin is " + SIN);
    // System.out.println("Fullname is " + fullName);
    // System.out.println("Address is " + address);

    super.print();
    System.out.println("CGPA is " + CGPA);
    System.out.println("Student id is " + studentID);

    }
    @Override
    public String toString() {
      String message = "Hi there! " + fullName + ". I am a peer mentor";
      return message;
  }

}
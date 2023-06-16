public class Student {
  private String studentName;
  private String studentId;
  private String[] courses;

  public String getStudentName() {
    return studentName;
  }

  public void setStudentName(String studentName) {
    this.studentName = studentName;
  }

  public String getStudentId() {
    return studentId;
  }

  public void setStudentId(String studentId) {
    this.studentId = studentId;
  }

  public String[] getCourses() {
    return courses;
  }

  public void setCourses(String[] courses) {
    this.courses = courses;
  }

  public Laptop getLaptop() {
    return laptop;
  }

  public void setLaptop(Laptop laptop) {
    this.laptop = laptop;
  }

  public int[] getScores() {
    return scores;
  }

  public void setScores(int[] scores) {
    this.scores = scores;
  }

  public static int getGymUsers() {
    return gymUsers;
  }

  public static void setGymUsers(int gymUsers) {
    Student.gymUsers = gymUsers;
  }

  private Laptop laptop;
  private int[] scores;
  private static int gymUsers = 0;

  public Student(String studentName, String studentId, String[] courses, Laptop laptop, int[] scores) {
    this.studentName = studentName;
    this.studentId = studentId;
    this.courses = courses;
    this.laptop = laptop;
    this.scores = scores;
  }

  // Static method
  public static void enterGym() {
    if (gymUsers < 10) {
      gymUsers++;
    }

    else {
      System.out.println("Sorry, please check again later");
    }
  }

  // courses[0] = {"ABCD1234", "Maths"}; // Use in main

  // ValidateData method
  public void validateData() {
    if (!studentName.matches("[A-Z][a-z]+\\s+[A-Z][a-z]+")) {
      System.out.println("You have entered an invalid full name");
    }

    if (studentId.length() != 10) {
      System.out.println("You have entered an invalid student id");
    }

    else {
      System.out.println("Name and Id valid");
    }

    for (String courseId : courses) {
      if (!courseId.matches("[A-Z]{4}\\d{4}")) {
        System.out.println("You have entered an invalid course id");
      }

      else {
        System.out.println("Course id valid");
      }
    }

  }

}
import java.util.ArrayList;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    Course java = new Course();
    java.setCourseName("Java");
    java.setCourseId(202);
    java.setCourseCat("Engineering");
    java.setCreditHours(16);

    Laptop asus = new Laptop();
    asus.setName("Asus");
    asus.setSerialNo("32932032");
    asus.setPrice(1199);
    asus.setManDate(2020);
    asus.setUser("Mason Greenwood");

    Laptop lenovo = new Laptop();
    lenovo.setName("Lenovo");
    lenovo.setSerialNo("329311032");
    lenovo.setPrice(1399);
    lenovo.setManDate(2023);
    lenovo.setUser("Areaf Legend");

    ArrayList<Student> students = new ArrayList<>();

    Student areaf = new Student("Areaf Legend", "200531053", new String[] { "ABCD1234" }, lenovo, new int[] { 93 });
    /*
     * In this object instantiation, while I am passing parameters, I am already
     * creating new arrays for the new String[] and new int[]. I ran into an issue
     * in the Student.java where I already set the scores array to create a new
     * array upon calling the constructor. Once I removed the implementation from
     * the Student class, the program started working perfectly.
     */

    students.add(areaf);

    Student mason = new Student("Mason Greenwood", "210531023", new String[] { "AASJ1234" }, asus, new int[] { 92 });

    students.add(mason);

    // Personal note: How the for each works is basically is "for each type and it's
    // i in the array: ___"

    double overallScore = 0;
    int totalStudents = students.size();
    for (Student student : students) {
      int[] scores = student.getScores();
      for (int score : scores) {// For each int type as score in the scores array:
        overallScore += score;
      }
      System.out.println();
      System.out.println("Student: " + student.getStudentName());
      System.out.println("Scores: " + Arrays.toString(scores));
      System.out.println("***** ***** ***** ***** ***** *****");
      System.out.println();
    }
    double averageScore = overallScore / students.size();
    System.out.println("The average score among all students is: " + averageScore);

  }
}
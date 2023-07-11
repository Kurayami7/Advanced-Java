class Main {
  public static void main(String[] args) {
    /*
     * 
     * Inheritance : Genetical. Some properties are passed from parents to children.
     * Java - you can create new classes based on existing classes. Code-reuse. You
     * need not type the same thing repeatedly.
     */

    Student s1 = new Student();

    System.out.println(s1.getFullName());
    s1.print();

    Student s2 = new Student(12123, "Yveltal", "435 Bloor", "200531053", 92.5);

    System.out.println(s1.toString()); // Prints the memory location whether it's converted into a string or not
    

  }
}
package example3;

public interface Loan {
  double interestRate = 7.2; // They automatically become public static due to the interface

  void payMortgage(); // They automatically become public abstract. It's optional to write it down
}
import java.util.*;

public class CarLoanCalculator{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter your loan amount: ");
    int P = scan.nextInt();

    System.out.print("Enter your monthly interest rate: ");
    float R = scan.nextFloat();
    float r = R / 100 /12;

    System.out.print("Enter your loan duaration (years) ");
    byte N = scan.nextByte();
    int n = N * 12;
    scan.close();

    LoanCalculator mathObject = new LoanCalculator();
    mathObject.M(P, r, n);
  } 
}
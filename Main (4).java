import java.util.Scanner;
import java.util.NumberFormat;

public class Main {
  public static void main(String[] args) {
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

    double mPow = Math.pow(1+r, n);
    double M = P * (r*mPow / (mPow-1));
    String m = NumberFormat.getCurrencyInstance().format(M);

    System.out.print(" \n");
    System.out.print("Your monthly payment is: " +m);
  }
}
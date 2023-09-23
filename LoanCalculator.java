import java.text.NumberFormat;

public class LoanCalculator{
  double M;
  public void M(int P, float r, int n){
    double mPow = Math.pow(1+r, n);
    M = P * (r*mPow / (mPow-1));
    String m = NumberFormat.getCurrencyInstance().format(M);
    System.out.print("\n");
    System.out.print("Your monthly payment is: " +m);
  }
}
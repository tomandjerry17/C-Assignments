import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner y = new Scanner(System.in);
    
    System.out.println("\n\t10% Deductor");
    System.out.println("\n");
    System.out.print("Enter the DVD price: $");
    int x = y.nextInt();
    double  discount = .1, totalDiscount=discount*x, discountedPrice=x-totalDiscount;
   
    System.out.println("\n The discount is $"+totalDiscount);
    System.out.println(" The sale price of the DVD is $"+discountedPrice);
  }
}
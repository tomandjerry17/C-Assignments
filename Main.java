import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("\t\t\nSuccessive Discount Calculator\n");
    
    Scanner discount = new Scanner(System.in);
    
    System.out.print("Enter the first discount: ");
    int x = discount.nextInt();
    System.out.print("Enter the second discount: ");
    int y = discount.nextInt();
    
    int totalDiscount=x+y - (x*y/100);
    System.out.println("\n The single discount equivalent of the two successive discounts of " +x+"% and " +y+"% is  " +totalDiscount+"%");
  }
}
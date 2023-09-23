import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner value = new Scanner(System.in);
		
		System.out.print("Enter your Name: ");
		String name = value.nextLine();
		
		System.out.print("Enter the number of items: ");
		int numItems = value.nextInt();
		
		System.out.print("Enter discount value: ");
		double discount = value.nextDouble();
		
		System.out.print("Enter the price of each item: ");
		double priceItem = value.nextDouble();
		 
	   double percent = discount / 100; 
	   double totalPrice = numItems * priceItem;
	   
	   System.out.println();
	   System.out.println("The total price  is "+totalPrice);
	   
	   double discountValue = totalPrice * percent;
	   double discountedPrice = totalPrice - discountValue;
	   	   	   
	   System.out.println((name)+" will pay Php "+(discountedPrice));
	   System.out.println("with discount of "+discount+"% or equivalent to Php" +discountValue);
	   	
	}
}
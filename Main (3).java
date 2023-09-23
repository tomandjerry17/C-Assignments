import java.util.*;
class Main {
  public static void main(String[] args) {
    double rate = 7.5;
				
		Scanner value = new Scanner(System.in);
		
		System.out.print("Enter the Principal amount: ");
		double principal = value.nextDouble();
		System.out.println("The Rate of interest (per annum): "+rate+"%");
	//	double rate = value.nextDouble();
		System.out.print("Enter the Time period (years): ");
		double time = value.nextDouble();
		
		double interest = (principal * rate * time)/100;
		 
		 System.out.println();
		 System.out.println(" Interest is: "+interest+" pesos"); 
    }
}
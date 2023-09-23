/*
Hands-on Midterm Removal
by: Thomas Gabriel D. Matinez  1CSC
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        /*In this part is where the user will input the principal amount, terms, and interest rate.*/
        System.out.print("Enter the principal amount: ");
        double amount = s.nextDouble();
        System.out.print("Enter the number of years : ");
        int years = s.nextInt();
        System.out.print("Enter the interest rate   : ");
        double rate = s.nextDouble();

        System.out.print("\n\n");
        /*Below is the display output on what the user entered. Also I am using the printf function, where the decimal is upto the hundreths place.*/
        System.out.printf("PRINCIPAL AMOUNT          : %.2f\n",amount);
        System.out.println("TERMS                     : "+years+" year(s)");
        System.out.println("INTEREST RATE             : "+rate+"%");

        System.out.print("\n");
        int months = years*12; // in here is the conversion of years to months.

        //below is the formula in order to get the monthly amount to be paid.
        double pM = (amount / months);//pM stands for payment monthly, meaning the equivalent of the principal amount divided by monthly terms.
        double iP = (rate/100)*pM;//iP means interest price, this calculates the interest price of every month.
        double tobePaid = pM + iP;//this part calculates the amount that you will pay every month including the interest.

        double balance = ((amount*rate)/100)+amount;//this is the new total amount with the interest to be paid.

        //This display the receipt.
        System.out.println("MONTHS\t\tTO BE PAID/M\tBALANCE");
        System.out.printf("Months 0\t-\t\t\t\t%.2f\n",balance);
        for(int i=1; i<=months; i++){
            System.out.printf("Months "+i+"\t%.2f",tobePaid);
            System.out.printf("\t\t\t%.2f\n",balance -=tobePaid);//this calculates the balance remaining per month.
        }

        s.close();
    }
}

//::Thomas Gabriel D. Martinez
import java.util.*;

public class Main {
	static int score = 1, points, total;
	static boolean check;
	static Scanner input = new Scanner(System.in);
	static char answer,answer1,answer2,answer3,start;

	public static void main(String[] args) {
		do{
		System.out.println("\tMini QUIZ GAME\n (Choose a question between 1 to 4)\n");
		for(int i = 0; i<4; i++){
		System.out.print("Question: ");
		int choose = input.nextInt();
		getQuestion(choose);
		}
		total += points;
		System.out.print("Congrats you got "+total+" out of 4\n");
		System.out.print("Retry?(Y/N): ");
		start = input.next().toUpperCase().charAt(0);
		}while(start == 'Y');
}
	
	static void getQuestion(int choose){
		switch(choose){
			case 1:
		System.out.println("Which of the following is not a primitive data type in java?\n");
		System.out.println("A) Integer\nB) String\nC) Boolean\nD) Double\n");
		System.out.print("Answer: ");
		answer = input.next().toUpperCase().charAt(0);
		getAnswer(choose,answer);
			break;
			case 2:
			System.out.println("What keyword is used to declare a class in Java?\n");
		System.out.println("A) Function\nB) Bar\nC) Class\nD) Def\n");
		System.out.print("Answer: ");
		answer1 = input.next().toUpperCase().charAt(0);
		getAnswer(choose,answer1);
		break;
		case 3:
			System.out.println("What is the result of 10 % 3?\n");
		System.out.println("A) 1\nB) 2\nC) 3\nD) 4\n");
		System.out.print("Answer: ");
		char answer2 = input.next().toUpperCase().charAt(0);
		getAnswer(choose,answer2);
		break;
		case 4:
			System.out.println("The _____ method is called when an object is created.\n");
		System.out.println("A) Init\nB) Main\nC) Constructor\nD) Finalize\n");
		System.out.print("Answer: ");
		char answer3 = input.next().toUpperCase().charAt(0);
		getAnswer(choose,answer3);
		break;
		default:
			System.out.print("Invalid Input!");
		}
	}
	
	static boolean getAnswer(int choose, char answer){
		switch(choose){
			case 1:
			if(answer == 'B'){
				check = true;
				if(check){
					System.out.println("Correct!\n");
					points = score++;
				}
			}
			else{
				System.out.println("Incorrect!\n");
			}
			break;
			case 2:
			if(answer == 'C'){
				check = true;
				if(check){
					System.out.println("Correct!\n");
					points = score ++;
				}
			}
			else{
				System.out.println("Incorrect!\n");
			}
			break;
			case 3:
			if(answer == 'A'){
				check = true;
				if(check){
					System.out.println("Correct!\n");
					points = score ++;
				}
			}
			else{
				System.out.println("Incorrect!\n");
			}
			break;
			case 4:
			if(answer == 'C'){
				check = true;
				if(check){
					System.out.println("Correct!\n");
					points = score ++;
				}
			}
			else{
				System.out.println("Incorrect!\n");
			}
			break;
			default:
			System.out.println("Invalid Input!\n");
		}
	return check == true;
	}
}
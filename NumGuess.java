
import java.util.Random;
import java.util.Scanner;
public class NumGuess {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random num = new Random();
		int randomNumber = num.nextInt(100);
		System.out.println(randomNumber);
		int attempts = 1;
		System.out.print("Enter a number between 1 to 100 : ");
		int number = sc.nextInt();
		if (number > 0 && number <= 100) {
			while(attempts < 6) {
//			for(attempts = 1; attempts<= 6; attempts ++ ){
				if(number <= 0 || number >= 100) {
					System.out.println("INVALID INPUT");
					break;
				}else if (number < randomNumber) {
					System.out.print("Number is low, enter a higher number : ");
					number = sc.nextInt();
				} else if (number > randomNumber) {
					System.out.print("Number is high, enter a lower number : ");
					number = sc.nextInt();
				} else if (number == randomNumber) {
					System.out.println("You guessed correctly in " + attempts + " attempts!");
					break;
				}
				attempts += 1;//only while using while loop and not when using for loop 
				if (attempts == 6 && number != randomNumber) {
					System.out.println("NUMBER OF ATTEMPTS EXHAUSTED");
				} else if(attempts == 6 && number == randomNumber){
					System.out.println("You guessed correctly in " + attempts + " attempts!");
				}

			}
		} else {
			System.out.println("INVALID INPUT");
		}
			
	}

}

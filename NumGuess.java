
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
			while (attempts < 6) {

				if (number < randomNumber) {
					System.out.print("Number is low, enter a higher number : ");
					number = sc.nextInt();
				} else if (number > randomNumber) {
					System.out.print("Number is high, enter a lower number : ");
					number = sc.nextInt();
				} else if (number == randomNumber) {
					System.out.println("You guessed correctly in " + attempts + " attempts!");
					break;
				}
				attempts += 1;
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


import java.util.Scanner;
public class NumGuess {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int min=1;
		int max=100;
		int randomNumber=(int)(Math.random()*(max-min+1)+min);
		int attempts=1;
		System.out.print("Enter a number between 1 to 100 : ");
		int number=sc.nextInt();
		if(number>0 && number<=100) {
			while(attempts<7){
				
				if(number<randomNumber) {
					System.out.print("Number is low, enter a higher number : ");
					number=sc.nextInt();
				}
				else if(number>randomNumber) {
					System.out.print("Number is high, enter a lower number : ");
					number=sc.nextInt();
				}
				else if(number==randomNumber){
					System.out.println("You guessed correctly in "+attempts+" attempts!");
					break;
				}
				attempts+=1;
				if(attempts==7 && number!=randomNumber) {
					System.out.println("NUMBER OF ATTEMPTS EXHAUSTED");
				}
			
			}
		}
		else {
			System.out.println("INVALID INPUT");
		}
			
	}

}

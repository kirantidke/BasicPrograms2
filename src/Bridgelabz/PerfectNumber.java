package Bridgelabz;
import java.util.Scanner;

public class PerfectNumber {
	static boolean isPerfect(int number) {
		if ( number ==1 )
			return false;
		int sum = 1;
		for (int i = 2; i < number; i++) {
			if (number % i ==0 ) {
				sum += i;
			}
		}
		if (sum == number)
			return true;
		return false;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
				System.out.print("Enter the number = ");
		int number = s.nextInt();
		if(isPerfect(number))
			System.out.println(number+" is perfect");
		else
			System.out.println(number+" not perfect");
	}

}

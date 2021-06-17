package Bridgelabz;

public class FibonicciSeries {
	static void fibonicci(int number) {
		int num1 = 0;
		int num2 = 1;
		int i = 0;
		while ( i< number) {
			System.out.print(num1+" ");
			int num3 = num2 + num1;
			num1 = num2;
			num2 = num3;
			i = i+1;
		}
	}

	public static void main(String[] args) {
	
		int number = 10;
		fibonicci(number);

	}

}

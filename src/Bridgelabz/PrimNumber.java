package Bridgelabz;
import java.util.Scanner;

public class PrimNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("enter the number = ");
		int n = s.nextInt();
		int i,m = 0,flag = 0;
		//int n = 7;
		m= n/2;
		if(n==0 || n==1) {
			System.out.println(n+" is not prim");
		}else {
			for (i = 2; i<= m; i++ ) {
				if (n%i ==0) {
					System.out.println(n+" is not prim ");
					flag = 1;
					break;
				}
			}
			if(flag ==0) {
				System.out.println(n+" is prim");
			}
		}
	}
}

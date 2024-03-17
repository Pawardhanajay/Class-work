//Write a program that read reads a set of integers and then print the sum of the even and odd integers.

package lab1;
import java.util.Scanner;
public class SumofEvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  the number of integer: ");
		int n=sc.nextInt();
		
		int sumEven=0;
		int sumOdd=0;
		System.out.println("Enter the integers ");
		for(int i =0; i<n; i++) {
			int num=sc.nextInt();
			if(num%2==0) {
				
				sumEven=sumEven+num;				
			}else {
				sumOdd=num;
			}
		}
      System.out.println("sum of even intagers: "+sumEven);
      System.out.println("sum of odd integers:"+sumOdd);
	}

}

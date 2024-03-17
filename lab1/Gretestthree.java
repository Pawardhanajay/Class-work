//QUE 1 Write program to find greatest among three number using nested if.

package lab1;
import java.util.Scanner;
public class Gretestthree {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		
		System.out.println("Enter three numbers:");
		int num1=Scanner.nextInt();
		int num2=Scanner.nextInt();
		int num3=Scanner.nextInt();
		
		if(num1>num2)
		{
			 if(num1>num3) {
				 System.out.println("the gretest number is "+num1);	 
			 }
			 else
			 {
				 System.out.println("The gretest number is: "+num3);
			 }
		}
		else 
		{
			if(num2 > num3) {
				System.out.println("The gretest number is: "+num2);
			}
			else {
				System.out.println("The gretest number is three: "+num3);
			}
		}
		
	}

}

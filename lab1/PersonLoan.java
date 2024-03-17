//Que-3 Write a program to check whether the the person is eligible for getting loan or not condition to grand 
//loan is he should have salary more than 50000 and he should be citizen of INDIA.
//Otherwise loan can't be given to customer

package lab1;
import java.util.Scanner;
public class PersonLoan {

	public static void main(String[] args) {
		double salary;
		String citizen;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your salary");
		salary =sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter your citizen");
		citizen=sc.next();
		
		if(salary >=50000 && citizen.equalsIgnoreCase("indian"))
		{
			System.out.println("congrats..! :) You are eligible for loan");
			
		}
		else 
		{
			System.out.println("sorry..!:) you are not not eligible for loan");
		}
	}

}

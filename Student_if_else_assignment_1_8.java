package Assignment1;

public class Student_if_else_assignment_1_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * Task 8- Write a program to print below students marks who have scored above 80
Example- 78,12,89,55,35
Output- 78,89
		 */
		int m=89;
		
		
		//int m=20;
		
		if (m<20)
		{
			System.out.println("Fail");
			
		}
		else if (m>=50 && m<=60)
		{
			System.out.println("student having D class");
		}
		else if (m>=60 && m<=70)
		{
			System.out.println("student having C class");
		}
		else if (m>=70 && m<=80)
		{
			System.out.println(" B class");
		}
		else if (m>=80 && m<=90)
		{
			System.out.println("student having above 80 marks and having distinction ");
		}
		
		else
		{
			System.out.println("none");
		}
		

	}

}

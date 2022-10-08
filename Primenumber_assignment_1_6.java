package Assignment1;

public class Primenumber_assignment_1_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int b;

		  for (int i = 1; i <=50; i++) {
		     b = 0;
		   for (int j = 2; j <= i / 2; j++) {
		    if (i % j == 0) {
		     b++;
		    // break;
		    }
		   }

		   if (b == 0) {
		    System.out.println("Prime number is = "+i);
		   }

		  }
		 }

	}



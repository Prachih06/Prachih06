package Assignment1;

public class BreakInt_assignment_1_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//12,34,66,85,900
		int[] a=new int[5];
		a[0]=12;
		a[1]=34;
		a[2]=66;
		a[3]=85;
		a[4]=900;
		
		for(int int1:a)
		{
			System.out.println("all numbers "   +int1);
			
			if(int1==85)
		{
			System.out.println("stop the exection once 85 number came");
		
			break;
			
		}
		

	}

}
}

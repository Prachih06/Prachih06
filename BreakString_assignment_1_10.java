package Assignment1;

public class BreakString_assignment_1_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String language="python";
		
		switch(language)
		{
		case "python":
			System.out.println("language is python");
			break;
			
		case "selenium":
			System.out.println("selenium");
			break;
			
		}*/
		
		
		 String[] str= new String[5];
		 //{“Java”,”JavaScript”,”Selenium”,”Python”,”Mukesh”};
		 str[0]="Java";
		 str[1]="JavaScript";
		 str[2]="Selenium";
		 str[3]="Python";
		 str[4]="Mukesh";
		 
		 
		 
		/* for( int i=0; i<str.length;i++)
		 {
		 		if(str[i]=="Selenium")
		 		{
		 		  System.out.println("print successfully selenium");
		 		  
		 		  
		 		}
		 		break;
		 		}
		 
	}*/
		 for(String str1:str)
		 {
			//System.out.println(str1);
			
			System.out.println(str1);
		 if(str1=="Selenium")
			 {
				 System.out.println("if string is selenium only display = = " +str1);
				 break;
			
			
		 }
	
	}
	}
	
}





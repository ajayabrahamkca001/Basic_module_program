package casestudy4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class registration {
 public static String[] a=new String[30];

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		registration c= new registration();
		//String[] a=new String[30];
		String yn;
		String name;
		String address;
		String emailid;
		String phonenumber;
		int i=1,count;
		String prooftype;
		String proofid;
	do
	{
		 
		 
		System.out.println("Registration\n Enter your name");
		a[i]=br.readLine();
		System.out.println("\nEnter your address");
		address=br.readLine();
		System.out.println("Contact Number");
		phonenumber=(br.readLine());
		System.out.println("E-mail id");
		emailid=br.readLine();
		System.out.println("Enter prooftype");
		prooftype=br.readLine();
		System.out.println("proofid");
		proofid=br.readLine();
		 
		System.out.println("thank you for registering.your id is:"+i);
		count=i; 
		i++;
		 	System.out.println("Do you want to continue registration(y/n)?");
			yn=br.readLine();
	}while(yn.equals("y"));
	
		
	
	
	viewcustomer(count,a, i);
	
	}

	private static void viewcustomer(int count, String[] a,int i) {
		//String[] a=new String[30];
		 
		System.out.println("customers name\nthe registered customers are\ncustomer id\t\t customername");
		for(int j=1;j<count;j++)
		{
		System.out.println(j+"\t\t\t"+a[j]);		
			
		}
	}	
	}

 

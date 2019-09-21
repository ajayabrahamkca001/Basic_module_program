package casestudy3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class email {

	public static void main(String[] args) throws IOException {
		
			String name;
			String address;
			String emailid;
			int phonenumber;
			String prooftype;
			String proofid;
			String yn,updateyn;
			String updatedemailid=null;
			int i=0;
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			do 
			{	
			i++;
			System.out.println("Registration\n Enter your name");
			name=br.readLine();
			System.out.println("\nEnter your address");
			address=br.readLine();
			System.out.println("Contact Number");
			phonenumber=Integer.parseInt(br.readLine());
			System.out.println("E-mail id");
			emailid=br.readLine();
			System.out.println("Enter prooftype");
			prooftype=br.readLine();
			System.out.println("proofid");
			proofid=br.readLine();
			System.out.println("Thankyou for registering.Your id is "+i);
			System.out.println("Do you want to continue registration(y/n)?");
			yn=br.readLine();
	}while(yn.equals("Y")==true);
			System.out.println("Do you want to update the emailid?(y/n)");
			updateyn=br.readLine();
			if(updateyn.equals("y")==true)
			{
				System.out.println("update email");
				System.out.println("Enter new email id");
				updatedemailid=br.readLine();
				System.out.println("Email updated");
			}
			
			if(updateyn.equals("y")==true)
			{
				System.out.println("your details are as follows:");
				System.out.println("Name:"+name);
				System.out.println("Address:"+address);
				System.out.println("contact number:"+phonenumber);
				System.out.println("Email id:"+updatedemailid);
				System.out.println("prooftype:"+prooftype);
				System.out.println("proofid:"+proofid);
			}
			else
			{
				System.out.println("your details are as follows:");
				System.out.println("Name:"+name);
				System.out.println("Address:"+address);
				System.out.println("contact number:"+phonenumber);
				System.out.println("Email id :"+emailid);
				System.out.println("prooftype:"+prooftype);
				System.out.println("proofid:"+proofid);
			}
			
	}
}

package jjaavvaa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
	class Main{

		
	

	public static void main(String[] args) throws IOException {
		String name;
		String address;
		String contactNumber;
		String email;
		String proofType;
		String proofID;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		name= br.readLine();
		address=br.readLine();
		contactNumber=br.readLine();
		email= br.readLine();
		proofType=br.readLine();
		proofID=br.readLine();
		 
		customer cu =new customer(name, address,contactNumber,email,proofType,proofID);
		//Main customer1=new Main(name,address,contactNumber,email,proofType,proofID);
		cu.register(name, address, contactNumber, email, proofType, proofID);
		

	}
	
}

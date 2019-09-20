package pack11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bidding {

	public static void main(String[] args) throws NumberFormatException, IOException {
	 BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	 
	 System.out.println("\n Enter the number of applications");
	 int num=Integer.parseInt(br.readLine());
	 int list[]=new int[num];
	  int large=0;
	 System.out.println("\n Enter the amount");
	 for(int i=0;i<num;i++)
	 {
		 list[i]=Integer.parseInt(br.readLine());
	 }
	  for(int i=0;i<num;i++)
	 {
		 for(int j=i+1;j<num;j++)
		 {
	  
			 if(list[i]>list[j])
			 {
				  large=list[i]; 
			 }
		 }	 
		  
	} 	 
	 
	 System.out.println("The winning bid is " +large +" crores");
	 
	}	 
}
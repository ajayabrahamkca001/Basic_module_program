package pack12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class foul {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 System.out.println("/n Enter the number of players");
	 int num=Integer.parseInt(br.readLine());
	 int list[]=new int[num];
	 int small=0;
	 int k = 0;
	 System.out.println("\n Enter the number of fouls made by each player");
	 for(int i=0;i<num;i++)
	 {
		 list[i]=Integer.parseInt(br.readLine());
	 }
	  for(int i=0;i<num;i++)
		 {
			 for(int j=i+1;j<num;j++)
			 {
		  
				 if(list[i]<list[j])
				 {
					  small=list[i]; 
					  k=i+1;
				 }
				 
			 }	 
			  	  
		}
	  
	  System.out.println("The eligible player is player no: " +k+"(" +small+"fouls)"  );
	  
	}

}

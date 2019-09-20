package pack10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class economy {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\n Enter the number of bowlers :");
		int num=Integer.parseInt(br.readLine());
		int list[]=new int[num];
		int list1[]=new int[num];
		Float list2[]=new Float[num];
		Float list3[]=new Float[num];
		System.out.println("\n Enter the runs conceded by the bowlers :");
		 for(int i=0;i<num;i++)
		 {
			 list[i]=Integer.parseInt(br.readLine());
		 }
		 System.out.println("\n Enter the number of balls for each bowler :");
		 for(int i=0;i<num;i++)
		 {
			 list1[i]=Integer.parseInt(br.readLine());
		 }	
         for(int i=0;i<num;i++)
         {
        	list2[i]=(float)list1[i]/6;
         }
         for(int i=0;i<num;i++)
         {
        	 list3[i]=  list[i]/list2[i];
         }
         for(int i=0;i<num;i++)  
	 
         {
        	 System.out.println("\n Economy :"+list3[i]);
         }

}}

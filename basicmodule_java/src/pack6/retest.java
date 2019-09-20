package pack6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class retest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\n Enter the number of students :");
		int num=Integer.parseInt(br.readLine());
		int list[]=new int[num];
		int count=0;
		System.out.println("\n Enter the marks of stidents :");	
        for(int i=0;i<num;i++)
        {
        	list[i]=Integer.parseInt(br.readLine());	
		
        }
        for(int i=0;i<num;i++)
        {
        if(list[i]<50)
        {
        	count++;
        }
        }
        
        System.out.println("\n Number of students apperaring for retest is :"+count);	
	}

}

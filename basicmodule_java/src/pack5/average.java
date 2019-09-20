package pack5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class average {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\n Enter the number of students :");
		int num=Integer.parseInt(br.readLine());
		int list[]=new int[num];
		int sum=0;
		System.out.println("\n Enter the marks of students :");
		for(int i=0;i<num;i++)
		{
			list[i]=Integer.parseInt(br.readLine());	
		}
		for(int i=0;i<num;i++)
		{
			sum=sum+list[i] ;
		}
     int avg=sum/num;
     System.out.println("\n The average is :"+avg);
	}

}

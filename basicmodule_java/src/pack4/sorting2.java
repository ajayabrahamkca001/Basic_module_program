package pack4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sorting2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\n Enter the number of students :");
		int num=Integer.parseInt(br.readLine());
		int list[]=new int[num];
		System.out.println("enter the marks of students");
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
				int temp=list[i];
				list[i]=list[j];
				list[j]=temp;
			}
			}
		}
		for(int i=0;i<num;i++)
		{
			System.out.println("the priority of mark is :"+list[i]);
		}

	}

}

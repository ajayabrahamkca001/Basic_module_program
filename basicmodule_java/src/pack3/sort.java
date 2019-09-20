package pack3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sort {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\n Enter the number of students :");
		int num=Integer.parseInt(br.readLine());
		Float list[]=new Float[num];
		System.out.println("enter the height");
		for(int i=0;i<num;i++)
		{
			list[i]=Float.parseFloat(br.readLine());
		}
		for(int i=0;i<num;i++)
		{
			for(int j=i+1;j<num;j++)
			{
			if(list[i]>list[j])
			{
				float temp=list[i];
				list[i]=list[j];
				list[j]=temp;
			}
			}
		}
		for(int i=0;i<num;i++)
		{
			System.out.println("the height in order"+list[i]);
		}

	}

}

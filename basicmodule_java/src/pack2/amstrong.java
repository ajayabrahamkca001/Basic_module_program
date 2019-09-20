package pack2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class amstrong {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int sum=0;
		int rem=0;
		 
		int count=0;
		System.out.println("/n Enter a number :");
		int n1=Integer.parseInt(br.readLine());
		int temp=n1,n2=n1;
		
		while(n2!=0)
		{
		count++;
		n2=n2/10;
		}
		while(temp>0)
		{
			rem=temp%10;
			sum=sum+(int)Math.pow(rem, count);
			temp=temp/10;
		}
		 if(sum==n1)
		 {
		System.out.println( "amstrong no");}
		else
			
			{System.out.println( "not amstrong no");
		 }

	}

}

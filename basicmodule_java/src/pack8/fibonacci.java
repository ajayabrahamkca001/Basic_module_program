package pack8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fibonacci {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\n Enter a number :");
		int num=Integer.parseInt(br.readLine());
		int n0=0,n1=1,n2  ;
		System.out.print("\n fibonacci series :"  );
		for(int i=0;i<num+3;i++)
		{
			System.out.print(" " +n0);
	    n2=n0+n1;
		n0=n1;
		n1=n2;
	
		} 
	 
	}

}

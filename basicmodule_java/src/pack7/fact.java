package pack7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fact {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\n Enter the number of alphabets in your name :");
		int num=Integer.parseInt(br.readLine());
		int fact=1;
		while(num!=0)
		{
		  fact=fact*num;
		  num--;
		}
		System.out.println("\n The number of combination is :"+fact);
	}

}

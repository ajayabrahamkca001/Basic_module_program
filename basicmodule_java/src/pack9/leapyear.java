package pack9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class leapyear {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\n Enter a year :");
		int year=Integer.parseInt(br.readLine());
if((year%4==0)&&(year%100==0)&&(year%400==0))
{
	System.out.println("\n leap year :");
}
else
{
	System.out.println("\n not leap year :");
}
	}

}

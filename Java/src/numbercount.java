import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class numbercount {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\n Enter the number :");
		int num=Integer.parseInt(br.readLine());
		int n,b,t=0,t1=0;
		n=num/10;
		b=num%10;
		if(n==1)
		{
			switch(b)
			{
			case 1:
			case 2:t1=t1+6;
			break;
			case 3:
			case 4:
			case 8:t1=t1+8;
		    break;
			
			case 5:
			case 6:
			case 9:t1=t1+7;
			break;
			case 7: t1=t1+9;
			break;
			}
			System.out.println("number :"+t1);
		}
		else
		{
		switch(b)
		{
		    case 1:
			case 2:
			case 6:t=t+3;
			break;
			case 4:
			case 5:
			case 9:t=t+4;
			break;
			case 3:
			case 7:
			case 8:t=t+5;
			break;
		}
		switch(n)
		{
		case 2:
		case 3:
		case 4:
		case 8:
		case 9:t=t+6;
		break;
		case 5:
		case 6:t=t+5;
		
		break;
		case 7:t=t+7;
			break;
		}
		System.out.println("number :"+t);
	}
	}
}

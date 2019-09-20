package pack1;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class main {

	public static void main(String[] args) throws IOException {
		String name;
		String age;
		String degree;
		String branch;
		String contactNo;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		name=br.readLine();
		age=br.readLine();
		degree=br.readLine();
		branch=br.readLine();
		contactNo=br.readLine();
		
		System.out.println( "name      :" +name);
		System.out.println( "age       :" +age);
		System.out.println( "degree    : " +degree);
		System.out.println( "branch    :" +branch);
		System.out.println( "contactNo :" +contactNo);

	}

}

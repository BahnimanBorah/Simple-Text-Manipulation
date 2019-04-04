package Java10Marks;
import java.util.Scanner;

/*
 * Input a string ..get sum of the digits in String
 */

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter string: ");
		String str = in.nextLine(); in.close();
		
		int sum=0;
		
		for(int i=0;i<str.length();i++) {
			
			if( Character.isDigit(str.charAt(i))) {
				
				int n = Integer.parseInt(str.substring(i, i+1));
				sum = sum + n;
				
			}
		}
		
		System.out.println("Sum: "+sum);
	}

}

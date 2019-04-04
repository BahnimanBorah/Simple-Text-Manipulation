package Java10Marks;
import java.util.Scanner;

public class PrintMinimumASCIIValued {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str = in.nextLine(); in.close();
		
	int min = (char)'z';
	
	for(int i=0;i<str.length();i++) {
		if((char)str.charAt(i)<min) {
			min=(char)str.charAt(i);
		}
	}
	
	System.out.println((char)min);
	}

}

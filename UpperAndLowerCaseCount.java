package Java10Marks;
import java.util.Scanner;

public class UpperAndLowerCaseCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in  =  new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = in.nextLine(); in.close();
		
		int low = 0, high = 0;
		
		for(int i=0;i<str.length();i++) {
			if(Character.isLetter(str.charAt(i))) {
				if(Character.isLowerCase(str.charAt(i))) {
					low++;
				}else {
					high++;
				}
			}
		}
		
		System.out.println("Low: "+low+"\nHigh: "+high);
	}

}

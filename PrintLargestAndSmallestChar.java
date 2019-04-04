package Java10Marks;
import java.util.Scanner;

public class PrintLargestAndSmallestChar {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter word: ");
		String word = in.nextLine();
		
		int val_min=(char)'z';
		int val_max=(char)'A';
		int val=0;
		
		for(int i=0;i<word.length();i++) {
			if(Character.isLetter(word.charAt(i))) {
				val = (char)word.charAt(i);
				if(val<val_min) {
					val_min=val;
				}
				if(val>val_max) {
					val_max=val;
				}
			}
		}
		
		System.out.println((char)val_min+""+(char)val_max);
	}

}

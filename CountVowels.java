package Java10Marks;
import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = in.nextLine(); in.close();
		
		int vowels=0;
		
		for(int i=0;i<str.length();i++) {
			if(Character.isLetter(str.charAt(i))) {
				switch(str.charAt(i)) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					vowels++;
					break;
				default: break;
				}
			}
		}
		
		System.out.println("Vowel count: "+vowels);
	}

}

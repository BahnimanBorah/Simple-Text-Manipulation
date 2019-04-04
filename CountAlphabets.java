package Java10Marks;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class CountAlphabets {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = in.nextLine();
		
		
		HashMap<Character,Integer> count = new HashMap<Character,Integer>();
		
		for(int i=0;i<str.length();i++) {
			if(Character.isLetter(str.charAt(i))) {
				if(count.containsKey(str.charAt(i))) {
					count.put(str.charAt(i), count.get(str.charAt(i))+1);
				}else {
					count.put(str.charAt(i), 1);
				}
			}
		}
		
		for(Map.Entry m:count.entrySet()) {
			System.out.println(m.getKey()+": "+m.getValue());
		}
		
		int max=1;char mx='A';
		
		for(Map.Entry m:count.entrySet()) {
			if((int)m.getValue()>max) {
				max=(int)m.getValue();
				mx=(char)m.getKey();
			}else if((int)m.getValue()==max) {
				if((int)mx<(int)((char)m.getKey())) {
					mx=(char)m.getKey();
				}
			}
		}
		
		System.out.println("Count: "+max+"\nChar: "+mx);
	}

}

package Java10Marks;
import java.util.Scanner;


/*
 * Input a number and get it's largest and smallest DIGIT
 */

public class PrintLargestAndSmallest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int num =  in.nextInt();
		in.close();
		
		int min=9;
		int max=0;
		int n=0;
		
		while(num>10) {
			n=num%10;
			if(n<min) {
				min=n;
			}
			if(n>max) {
				max=n;
			}
			num=num/10;
		}
		if(num<min)
			min=num;
		if(num>max)
			max=num;
		
		
		System.out.println("Min: "+min+"\nMax: "+max);
	}

}

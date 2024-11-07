// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int num=Integer.parseInt(args[0]),hundreds,tens;
		hundreds=num/100;
		num=num%100;
		tens=num/10;
		num=num%10;
		System.out.println(hundreds+" hundreds, "+tens+" tens, and "+num+" ones.");
		
		
	}
}

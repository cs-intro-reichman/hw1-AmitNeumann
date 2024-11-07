// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
	int a=Integer.parseInt(args[0]),b=Integer.parseInt(args[1]),c=Integer.parseInt(args[2]);
	int min1,min2,min,max1,max2,max,middle;
	min1=Math.min(a,b);
	min2=Math.min(b,c);
	min=Math.min(min1,min2);
	max1=Math.max(a,b);
	max2=Math.max(b,c);
	max=Math.max(max1,max2);
	middle=a+b+c-min-max;
	System.out.println(min+" "+middle+" "+max);
	}
}

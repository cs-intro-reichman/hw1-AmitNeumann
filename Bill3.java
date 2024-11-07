// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
	    String name1 = args[0], name2=args[1], name3=args[2];
		int bill=Integer.parseInt(args[3]);
		double splitedBill=bill/3.0;
		splitedBill=Math.ceil(splitedBill);
		System.out.println("Dear "+name3+", "+name2+", and "+name1+" needs to pay: "+splitedBill+" Shekels each.");
	}
}

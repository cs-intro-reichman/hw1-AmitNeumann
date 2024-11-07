// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue=Integer.parseInt(args[0]), rate=Integer.parseInt(args[1]),
		n=Integer.parseInt(args[2]);
		double base=1+(rate/100.0); //double base for mathpow+adjust 
		double exponent=(double)(n);//from int to double
		double futureValue=(currentValue*(Math.pow(base,exponent))); //return f value in double
		double dRate=(double)(rate);//from int to double 10.0 for printing
		System.out.println("After "+n+" years, a $"+currentValue+" saved at "+dRate+"% will yield $"+(int)(futureValue));
	}
}
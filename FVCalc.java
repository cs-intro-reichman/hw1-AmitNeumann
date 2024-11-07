// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue=Integer.parseInt(args[0]),n=Integer.parseInt(args[2]);
		double rate=Double.parseDouble(args[1]);
		double base=1+(rate/100); //double base for mathpow+adjust 
		double exponent=(double)(n);//from int to double
		double futureValue=(currentValue*(Math.pow(base,exponent))); //return f value in double
		System.out.println("After "+n+" years, a $"+currentValue+" saved at "+rate+"% will yield $"+(int)(futureValue));
	}
}
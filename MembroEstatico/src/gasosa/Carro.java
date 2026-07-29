package gasosa;

public class Carro {
	public static final double  percent = 0.05;
	public static final double  kmPerLiter = 12.5;
	public static double valueInReais (double price,double distance) {
		return ((distance / kmPerLiter) * price) * (1 + percent); 
	}
}

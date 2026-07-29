package utili;

public class convert {
	public static double IOF= 0.06;
	public static double dollarToReal (double dolarPrice, double dolar) {
		return dolar * dolarPrice * (1+IOF);
		
	}

}

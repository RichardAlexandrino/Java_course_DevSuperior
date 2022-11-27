package util;

public class Converter {

	public static double convertDolarReais(double reais, double dolar) {
		return reais * dolar + (reais * dolar * 0.06);
	}
}
import java.util.Scanner;

public class Project07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int minutos;
		
		System.out.println("Quantos minutos?");
		minutos = sc.nextInt();
		
		double valor = 50.0;
		if (minutos > 100) {
			valor += (minutos - 100) * 2;
		}
		
		System.out.printf("Valor a pagar: R$ %.2f%n", valor);

		sc.close();
	}
}
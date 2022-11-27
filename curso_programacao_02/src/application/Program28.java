package application;

public class Program28 {

	public static void main(String[] args) {

		String[] vect = new String[] {"Maria", "Bod", "Alex"};
		
		for (int i=0; i<vect.length; i++) {
			System.out.println(vect[i]);
		}

		System.out.println("----------");
		for (String elem: vect) {
			System.out.println(elem);
		}
	}

}

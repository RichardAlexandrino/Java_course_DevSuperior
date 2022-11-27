package application;

public class Program27 {

	public static void main(String[] args) {
		
		int x = 20;
		Object obj = x;
		System.out.println(obj);
		// int y = obj; error
		int y = (int) obj;
		System.out.println(y);

		int x2 = 10;
		Integer obj2 = x2;
		System.out.println(x2);
		int y2 = x2;
		System.out.println(y2);
	}

}

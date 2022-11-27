package application;

import entities.Client06;

public class Program06 {

	public static void main(String[] args) {

//		String a = "Maria";
//		String b = "Alex";
//		
//		System.out.println(a.equals(b));
//		System.out.println(a.hashCode());
//		System.out.println(b.hashCode());

		Client06 c1 = new Client06("Maria", "maria@gmail.com");
		Client06 c2 = new Client06("Maria", "maria@gmail.com");
		
		String s1 = "Test";
		String s2 = "Test";
		
		String s3 = new String("Test");
		String s4 = new String("Test");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2);
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
	}

}

package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment02;
import entities.Post02;

public class Program02 {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment02 c1 = new Comment02("Have a nice trip!");
		Comment02 c2 = new Comment02("Wow that's awesome!");
		Post02 p1 = new Post02(sdf.parse("21/06/2018 13:05:44"), 
				"Traveling to New Zealand",
				"I'm going to visit this wonderful country!",
				12);
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		Comment02 c3 = new Comment02("Good night");
		Comment02 c4 = new Comment02("May the Force be with you");
		Post02 p2 = new Post02(
				sdf.parse("28/07/2018 23:14:19"),
				"Good night guys",
				"See you tomorrow",
				5);
		
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p1);
		System.out.println(p2);
		
		
	}

}

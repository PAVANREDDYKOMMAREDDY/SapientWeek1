package com.Sapient;

import java.util.Scanner;

public class maincls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		Command_Line1 ob=new Command_Line1();
		System.out.println("Enter The no of values ");
		ob.setData(s,s.nextInt());
		ob.display();
		
		System.out.println("Enter The value to read ");
		System.out.println(fig_to_words.fig2words(s.nextLong()));
		
		
		nNumbers ar=new nNumbers();
		ar.read();
		ar.display();
		System.out.print("Enter the value to find ");ar.find(s.nextInt());ar.sort();ar.display();

	}

}

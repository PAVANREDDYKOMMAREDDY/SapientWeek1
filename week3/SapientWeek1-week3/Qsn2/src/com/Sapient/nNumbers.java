package com.Sapient;

import java.util.Arrays;
import java.util.Scanner;

public class nNumbers {
	
	public int[] numbers;
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		nNumbers ar=new nNumbers();
		ar.read();
		ar.display();ar.sort();ar.display();ar.find(2);
	}*/
	public void read()
	{
		int no_of_numbers;
		System.out.println("Enter the no of values :");
		try (Scanner s = new Scanner(System.in)) {
			no_of_numbers=s.nextInt();
			numbers=new int[no_of_numbers];
			for(int i=0;i<no_of_numbers;i++)
			{
				numbers[i]=s.nextInt();
			}
		}
	}
	public void display()
	{
		System.out.println(Arrays.toString(numbers));
	}
	public void sort()
	{
		Arrays.sort(numbers);
	}
	public void find(int value_to_search)
	{int i;
		for(i=0;i<numbers.length;i++)
			if(numbers[i]==value_to_search)
			{
				System.out.println("value found at index : "+i);
			}
		if(i==numbers.length)
			System.out.println("Value not found");
	}
	

}

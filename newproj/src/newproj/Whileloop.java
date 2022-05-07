package newproj;

import java.util.Scanner;

public class Whileloop
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// print odd numbers from 1 to 20 //
		int index = 1;
		while (index <= 20)
		{
			if (index % 2 != 0)
			{
				System.out.println(index);
			}
			index ++;
		}
		
		
		// print odd numbers from 1 to user entered value //
		int a = 0;
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Enter the number");
		a = sc.nextInt();
		
		while (index <= a)
		{
			if(a%2 != 0)
			{
				System.out.println(index);
			}
			index++;
		}
	}

}

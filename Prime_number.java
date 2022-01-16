package lec2;

import java.util.Scanner;

public class Prime_number
{

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Prime Number:");
		int n = scn.nextInt();
		if (n <= 1)
		{
		   System.out.println("Neither Prime Nor Composite");
		   return;
		}
		int c = 2;
		while(c < n)
		{
			if( n%c == 0)
			{
				System.out.println("Not a Prime");
				return;
			}
			c++;
		}
		System.out.println("Prime");
			           
	}

}

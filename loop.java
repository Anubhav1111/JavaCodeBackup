package lec2;

import java.util.Scanner;

public class loop 
{
	public static void main(String[] args)
	{
		System.out.println("Enter N:");
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int i = 1;
		while (i <= N)
		{
			System.out.println(i);
			i++;
		}
		
		
	}

}

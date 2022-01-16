package lec2;

import java.util.Scanner;

public class reverse 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
     Scanner scn = new Scanner(System.in);
     System.out.println("Enter the Value of Number to be reversed");
     int N = scn.nextInt();
     int digit;
     int ans = 0;
     while( N != 0)
     {
    	digit = N%10;
    	ans = ans*10 + digit;
    	N = N/10;
    	  
     }
     System.out.println(ans);
     

	
	
	
	}

}

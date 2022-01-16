package lec2;

import java.util.Scanner;

public class OddEvenCodingblocks {

	public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        long N = scn.nextInt();
        long n = 1;
        long sum1, sum2;
        long digit;
        while (n <= N)
        {
           
            sum1 = 0;
            sum2 = 0;
            Scanner scn1 = new Scanner(System.in);
            long c = scn1.nextInt();

            while ( c!= 0)
            {
                digit = c%10;
                if (digit%2 == 0)
                {
                    sum1 += digit;
                }
                else
                {
                    sum2 += digit; 
                }
                c = c/10;
            }

            if ((sum1%4 == 0) || (sum2%3 == 0))
            {
                System.out.println("Yes");
            }
            else
                System.out.println("No");
             
            n++;


        }
   }

}

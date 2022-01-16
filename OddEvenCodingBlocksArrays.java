package lec2;

import java.util.Scanner;

public class OddEvenCodingBlocksArrays {
	public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        long N = scn.nextInt();
        int[] array = new int[1000];
        long sum1, sum2;
        long digit;
        for(int i=0; i<N; i++)  
        {      
           //reading array elements from the user   
            array[i]=scn.nextInt();  
        }  
        for(int i=0; i<N; i++)  
        {      
            sum1 = 0;
            sum2 = 0;  
           
             while ( array[i]!= 0 )
            {
                digit = array[i]%10;
                if (digit%2 == 0)
                {
                    sum1 += digit;
                }
                else
                {
                    sum2 += digit; 
                }
                array[i] = array[i]/10;
            }

            if ((sum1%4 == 0) || (sum2%3 == 0))
            {
                System.out.println("Yes");
            }
            else
                System.out.println("No");
        } 
        
       

        
   }
}

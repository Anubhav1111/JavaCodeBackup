package lec2;

import java.util.Scanner;

public class InputHackerBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int[] arr = new int[2000];
        long sum = 0;
        for (int i = 0; i < N ; i++)
        {
            arr[i] = scn.nextInt();  
        }
        for (int i = 0; i < N ; i++)
        {
             sum += arr[i];
             if( sum < 0)
             {
                 for(int j = 0; j < i ; j++)
                 {
                     System.out.println(arr[j]);
                 }
                 break;
             }

        } 
	}

}

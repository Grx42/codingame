import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        
        int[] horseList = new int[N];

        int minPowerRange = Integer.MAX_VALUE;
        
        for (int i = 0; i < N; i++) {
            int pi = in.nextInt();
            horseList[i] = pi;
        }
        
        Arrays.sort(horseList);
        
        for (int j = 0; j < N; j++)
        {
            if (j > 0){
               if((Math.abs(horseList[j-1] - horseList[j])) < minPowerRange)
                    minPowerRange = Math.abs(horseList[j-1] - horseList[j]);
            }
        }

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(minPowerRange);
    }
}

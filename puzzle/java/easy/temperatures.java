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
        int n = in.nextInt(); // the number of temperatures to analyse
        in.nextLine();
        String temps = in.nextLine(); // the n temperatures expressed as integers ranging from -273 to 5526

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");
        int result = 0;

        if (n > 0)
        {
            String [] split = temps.split(" ");
            int tempsToInt[] = new int[n];

            for (int i = 0; i < n; i++)
            {
                tempsToInt[i] = Integer.parseInt(split[i]);
                if (i == 0)
                    result = tempsToInt[i];
                else
                {
                    if (tempsToInt[i] > 0)
                    {
                        if (result > 0)
                        {
                            result = (tempsToInt[i] < result) ? tempsToInt[i] : result;
                        }
                        else if (result < 0)
                        {
                            if (tempsToInt[i] == result * -1)
                            {
                                result = tempsToInt[i];
                            }
                            else
                            {
                                result = (tempsToInt[i] < (result * -1)) ? tempsToInt[i] : result;
                            }
                        }
                    }
                    else if (tempsToInt[i] < 0)
                    {
                        int test = tempsToInt[i] * -1;
                        if (result > 0)
                        {
                            result = (test < result) ? tempsToInt[i] : result;
                        }
                        else if (result < 0)
                        {
                            result = (test < (result * -1)) ? tempsToInt[i] : result;
                        }
                    }
                    else
                    {
                        result = tempsToInt[i];
                    }
                }
            }
        }
        System.out.println(result);
    }
}

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // game loop
        while (true)
        {
            int compare = 0;
            int target = 0;
            for (int i = 0; i < 8; i++)
            {
                int mountainH = in.nextInt(); // represents the height of one mountain, from 9 to 0.
                if ((i == 0) || (mountainH > compare))
                {
                    compare = mountainH;
                    target = i;
                }
            }


            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            System.out.println(target); // The number of the mountain to fire on.

        }
    }
}

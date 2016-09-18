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
        int L = in.nextInt();
        int H = in.nextInt();
        in.nextLine();
        String T = in.nextLine();

        String lowerT = T.toLowerCase();
        char[] letterAscii = new char[lowerT.length()];
		String response = "";

        for (int i = 0; i < H; i++) {
            String ROW = in.nextLine();

            for (int j = 0; j < lowerT.length(); j++)
            {
                letterAscii[j] = lowerT.charAt(j);

                int charToNumber = ((int) letterAscii[j] - 97);
                int substrStart = charToNumber * (L);

                int castLetter = (int) letterAscii[j];
                if (castLetter >= 97 && castLetter <= 122)
                {
                    if (letterAscii[j] == 'a')
                    {
                        response = response.concat(ROW.substring(0, L));
                    }
                    else
                    {
                        response = response.concat(ROW.substring(substrStart, substrStart + L));
                    }
                }
                else
                {
                    response = response.concat(ROW.substring(ROW.length() - L, ROW.length()));
                }
            }
            response = response.concat("\n");
        }
        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");
        System.out.println(response);
    }
}

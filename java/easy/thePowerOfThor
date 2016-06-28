import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int thorX = in.nextInt(); // Thor's starting X position
        int thorY = in.nextInt(); // Thor's starting Y position

        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");

            // X axis comparaisons
            boolean lXSupPX = lightX > thorX;
            boolean lXEgaPX = lightX == thorX;
            boolean lXInfPX = lightX < thorX;

            // Y axis comparaison
            boolean lYSupPY = lightY > thorY;
            boolean lYEgaPY = lightY == thorY;
            boolean lYInfPY = lightY < thorY;

            String nextMove = "";

            if (lXSupPX && lYInfPY) //NE
            {
                thorX++;
                thorY--;
                nextMove = "NE";
            }
            else if (lXSupPX && lYSupPY) //SE
            {
                thorX++;
                thorY++;
                nextMove = "SE";
            }
            else if (lXInfPX && lYSupPY) //SW
            {
                thorX--;
                thorY++;
                nextMove = "SW";
            }
            else if (lXInfPX && lYInfPY) //NW
            {
                thorX--;
                thorY--;
                nextMove = "NW";
            }
            else
            {
                if (lXEgaPX && lYInfPY) //N
                {
                    thorY--;
                    nextMove = "N";
                }
                else if (lXSupPX && lYEgaPY) //E
                {
                    thorX++;
                    nextMove = "E";
                }
                else if (lXEgaPX && lYSupPY) //S
                {
                    thorY++;
                    nextMove = "S";
                }
                else if (lXInfPX && lYEgaPY) //W
                {
                    thorX--;
                    nextMove = "W";
                }
            }

            // A single line providing the move to be made: N NE E SE S SW W or NW
            System.out.println(nextMove);
        }
    }
}

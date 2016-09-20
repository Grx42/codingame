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
        String MESSAGE = in.nextLine();

        char tempCharMessage;
		String charToBinary = "";
		String binaryToBinaryString = "";
		String responseString = "";
		int nbBinaireIdentique = 0;

		for (int i = 0; i < MESSAGE.length(); i++)
		{
			tempCharMessage = MESSAGE.charAt(i);
			charToBinary = Integer.toBinaryString(tempCharMessage);

			if (charToBinary.length() < 7)
			{
				charToBinary = charToBinary.format("%7s", Integer.toBinaryString(tempCharMessage)).replace(' ', '0');
			}

			binaryToBinaryString = binaryToBinaryString.concat(charToBinary);
		}

		for (int j = 0; j < binaryToBinaryString.length(); j++)
		{
			if (j < binaryToBinaryString.length()-1)
			{
				if (binaryToBinaryString.charAt(j) == binaryToBinaryString.charAt(j + 1))
				{
					nbBinaireIdentique++;
				}

				else
				{
					responseString = responseString.concat(groupeBinaireToString(binaryToBinaryString.charAt(j), nbBinaireIdentique, false));

					if (nbBinaireIdentique != 0)
					{
						nbBinaireIdentique = 0;
					}
				}
			}
			else
			{
				responseString = responseString.concat(groupeBinaireToString(binaryToBinaryString.charAt(j), nbBinaireIdentique, true));
			}
		}

		// Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(responseString);
    }

	public static String groupeBinaireToString(char lastBin, int nbRepeat, boolean last)
	{
		String reponse = "";

		if (lastBin == '0')
			reponse = reponse.concat("00 ");
		else if (lastBin == '1')
			reponse = reponse.concat("0 ");

		while (nbRepeat + 1 > 0)
		{
			reponse = reponse.concat("0");
			nbRepeat--;
		}
		if (!last)
			reponse = reponse.concat(" ");

		return reponse;
	}
}

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Don't let the machines win. You are humanity's last hope...
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int width = in.nextInt(); // the number of cells on the X axis
        int height = in.nextInt(); // the number of cells on the Y axis
        in.nextLine();
        
        ArrayList<String> lineL = new ArrayList<String>();
        
        for (int i = 0; i < height; i++) {
            String line = in.nextLine(); // width characters, each either 0 or .
            lineL.add(line);
        }

        String response = "";
        
        for (int y = 0; y < lineL.size(); y++)
        {
        	for (int x = 0; x < lineL.get(y).length(); x++)
        	{
        		response = "";
        		
        		if(lineL.get(y).charAt(x) == '0')
        		{
        			response += x + " " + y;
        			
        			if (x < lineL.get(y).length() - 1)
        			{
        				byte xFlag = 0;
        				for (int x1 = x + 1; x1 < width; x1++)
        				{
        					if(lineL.get(y).charAt(x1) == '0')
        					{
        						response += " " + x1 + " " + y;
        						xFlag = 1;
        						break;
        					}
        				}
        				if (xFlag == 0)
               				response += " -1 -1";
        				xFlag = 0;
        			}
        			else
        				response += " -1 -1";
        			
        			
        			if (y < lineL.size() - 1)
        			{
        				byte yFlag = 0;
        				for (int y1 = y + 1; y1 < height; y1++)
        				{
        					if (lineL.get(y1).charAt(x) == '0')
        					{
        						response += " " + x + " " + y1;
        						yFlag = 1;
        						break;
        					}
        				}
        				if (yFlag == 0)
               				response += " -1 -1";
        				yFlag = 0;
        			}
        			else
        				response += " -1 -1";	

        			System.out.println(response);
        		}
        	}
        }
    }
}

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
        String LON = in.next().replace(',', '.');
        String LAT = in.next().replace(',', '.');
        int N = in.nextInt();
        in.nextLine();
        
        String[][] tabDef = new String[N][];
        
        for (int i = 0; i < N; i++) {
            String DEFIB = in.nextLine().replace(',', '.');
            tabDef[i] = DEFIB.split(";");
        }
        
        double distanceRes = Double.MAX_VALUE;
        int loopIndex = 0;
        
        for(int i = 0; i < tabDef.length; i++)
        {
        	double lonA = Double.parseDouble(LON);
        	double lonB = Double.parseDouble(tabDef[i][4]);
        	double latA = Double.parseDouble(LAT);
        	double latB = Double.parseDouble(tabDef[i][5]);
        	
        	double x = (lonB - lonA) * Math.cos( (latA + latB) / 2);
        	double y = latB - latA;
        	double d = Math.sqrt( (Math.pow(x, 2) + Math.pow(y, 2)) * 6371);
        	if(d < distanceRes)
        	{
        		distanceRes = d;
        		loopIndex = i;
        	}
        }

        System.out.println(tabDef[loopIndex][1]);
    }
}

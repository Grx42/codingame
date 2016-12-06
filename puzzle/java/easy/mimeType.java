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
        int N = in.nextInt(); // Number of elements which make up the association table.
        int Q = in.nextInt(); // Number Q of file names to be analyzed.
        
        HashMap liste = new HashMap();
        
        for (int i = 0; i < N; i++) {
            String EXT = in.next().toLowerCase(); // file extension
            String MT = in.next(); // MIME type.
            liste.put(EXT, MT);
        }
        in.nextLine();
        for (int i = 0; i < Q; i++) {
            String FNAME = in.nextLine().toLowerCase(); // One file name per line.
            if(FNAME.lastIndexOf(".") < FNAME.length() && FNAME.contains("."))
            {
            	String ext = FNAME.substring(FNAME.lastIndexOf(".") + 1);
            	if(liste.containsKey(ext))
                {
                	System.out.println(liste.get(ext));
                }
            	else
            		System.out.println("UNKNOWN");
            }
            else
            	System.out.println("UNKNOWN");
        }
    }
}

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);

		int nbFloors = in.nextInt(); // number of floors
		int width = in.nextInt(); // width of the area
		int nbRounds = in.nextInt(); // maximum number of rounds
		int exitFloor = in.nextInt(); // floor on which the exit is found
		int exitPos = in.nextInt(); // position of the exit on its floor
		int nbTotalClones = in.nextInt(); // number of generated clones
		int nbAdditionalElevators = in.nextInt(); // ignore (always zero)
		int nbElevators = in.nextInt(); // number of elevators
		
		int[] elevatorsCoords = new int[(nbElevators > 0) ? nbElevators : 1];
		
		boolean[] alreadyBlockedOnThisFloor = new boolean[nbElevators + 1];
		alreadyBlockedOnThisFloor[0] = false;
		boolean blockNextRound = false;
		
		for (int i = 0; i < nbElevators; i++)
		{
			int elevatorFloor = in.nextInt(); // floor on which this elevator is found
			int elevatorPos = in.nextInt(); // position of the elevator on its floor
			elevatorsCoords[elevatorFloor] = elevatorPos;
			alreadyBlockedOnThisFloor[elevatorFloor] = false;
		}
		
		// game loop
		while (true)
		{
			int cloneFloor = in.nextInt(); // floor of the leading clone
			int clonePos = in.nextInt(); // position of the leading clone on its floor
			String direction = in.next(); // direction of the leading clone: LEFT or RIGHT
			
			int cloneFloorForArray = (cloneFloor != -1) && (cloneFloor < nbFloors - 1) ? cloneFloor : 0;
			boolean cloneSameFloorAsExit = cloneFloor == exitFloor;
			boolean rightIsTheWay = (cloneSameFloorAsExit ? clonePos < exitPos : clonePos < elevatorsCoords[cloneFloorForArray]);
			boolean leftIsTheWay = (cloneSameFloorAsExit ? clonePos > exitPos : clonePos > elevatorsCoords[cloneFloorForArray]);
			
			System.err.println(direction);
			if(cloneFloor == -1
			   || (rightIsTheWay && direction.equals("RIGHT"))
			   || (leftIsTheWay && direction.equals("LEFT"))
			   || (alreadyBlockedOnThisFloor[cloneFloor])
			   || (clonePos == elevatorsCoords[cloneFloorForArray])
			){
				System.out.println("WAIT");
			}
			else
			{
				if((rightIsTheWay && direction.equals("LEFT")) || (leftIsTheWay && direction.equals("RIGHT")))
				{
					alreadyBlockedOnThisFloor[cloneFloor] = true;
					System.out.println("BLOCK");
				}
				else
					System.out.println("WAIT");
			}
		}
	}
}

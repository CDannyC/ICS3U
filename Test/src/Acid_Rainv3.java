/*
 * Daniel Condarcuri
 * 02/02/22
 * Unit 3 Activity 7 Question 1 - Acid Rain
 * Description: User enters a ph value and says whether it will kill the fish or not
 */
import java.util.Scanner;
public class Acid_Rainv3 
{
	public static void main(String[] args) 
	{
		//Variable Declaration & Initializations
		System.out.println("'ACID RAIN CONCERN' PROGRAM\n");
		System.out.println("Acid Rain is detrimental to several environment,\nmost notably the aquatic environment.\n"
				+ "It is caused by rotting vegetation and volcanic eruptions,\nbut the most influential factor is human"
				+ " activity such as burning fossil fuel.\n");
		System.out.println("\nThis program is designed to determine rge risk on fish within water systems.");
		Scanner myObj = new Scanner(System.in);
	    System.out.println("\nType in a pH-value and see what happens to the fish.(number between 0 - 14)");
	    Float PH = Float.parseFloat(myObj.nextLine());	    
	    if (PH < 6.5)
	    {
	    	System.out.println(PH + " IS TOO ALKALINE - FISH IN STREAMS, RIVERS AND LAKES WILL NOT SURVIVE");
	    }
	    else if (PH <= 7.5)
	    {
	    	System.out.println(PH + " NEUTRAL - FISH IN STREAMS, RIVERS AND LAKES WILL SURVIVE");
	    }
	    else
	    {
	    	System.out.println(PH + " IS TOO ACIDIC - FISH IN STREAMS, RIVERS AND LAKES WILL NOT SURVIVE");
	    }
	}//end main
}//end class
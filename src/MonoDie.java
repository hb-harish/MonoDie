import java.util.Random;

public class MonoDie {
	
	public static void main( String[] args )
    {
        int die1, die2;
        Random rnd = new Random();
        
        die1 = 1 + rnd.nextInt(6);
        die2 = 1 + rnd.nextInt(6);
        int sum = die1 + die2;
        int i =1;
           	
        System.out.println("User Rolls  " + die1 + " " + die2);
        
    	while (die1==die2 && i<=3)
    	{
    		if (i==3)
    		{
    			System.out.println("Go to Jail");
    			break;
    		}
    		System.out.println("Move " + sum + " Spaces and roll again getting...");
    		die1 = 1 + rnd.nextInt(6);
            die1 = 1 + rnd.nextInt(6);
            sum = die1 + die2;
            System.out.println("User Rolls  " + die1 + " " + die2);
            i = i+1;
    		
    	}
    	
    	if (i!=3)
    		System.out.println("Move " + sum + " Spaces and stop");
    	
        
        
    }

}

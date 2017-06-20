import java.util.*;


public class Randomness{
    public static void main(String[] args)
    {
    	//Randomness Debugging
        output("Generate 10 random integers between 0 and 6");
        Random rnd = new Random();
        
        for (int i = 1; i <= 10; ++i)
        {
          int randomInt = rnd.nextInt(7);
          output("Generated number: " + randomInt);
        }
    
        output("Done.");
    }
  
  //Randomness Debugging
  private static void output(String aMessage)
  {
    System.out.println(aMessage);
  }
}

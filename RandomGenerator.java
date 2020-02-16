import java.util.Random;
import java.lang.Math;

public class RandomGenerator {
 public static void main(String args[]) 
    { 
        // create instance of Random class 
        Random rand = new Random(); 
  
        // Generate random integers in range 0 to 100
        int rand_int1 = rand.nextInt(100); 
  
        // Print random integers 
        System.out.println("Random Integers: "+rand_int1);        
  
        // Generate Random doubles 
        double rand_dub1 = rand.nextDouble(); 
		
		//math
		Math.sqrt(rand_dub1);
		System.out.println("the square root of the number is " + Math.sqrt(rand_int1));
		//power of 2
		Math.pow(rand_dub1, 2);
		System.out.println("the square of the chosen number is" + Math.pow(rand_int1, 2));
		//power of 3
		Math.pow(rand_dub1, 3);
		System.out.println("the number to the power of 3 is " + Math.pow(rand_int1, 3));
		//natural log
		System.out.println("the log of the number is " + Math.log(rand_int1));
		//log 10
		 System.out.println("The log 10 0f the number is " + Math.log10(rand_int1));
       
    } 
} 
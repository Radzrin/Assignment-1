import java.util.Scanner;

public class Question1{

    public static void main(String[] args) {
        System.out.println("Road trips are expensive");		
		double km;
        double liters;
        double price = 1.16;
		

        Scanner in = new Scanner(System.in);
        System.out.println("How many km will be traveled ?");
        km = in.nextDouble();
        System.out.println("You entered string " + km);

        System.out.println("what is the average distance that the vehicle runs with 1 liter of gas?");
        liters = in.nextDouble();
        System.out.println("this vehicle uses this much liters of fuel per km " + km / liters);

		System.out.printf("the price for the trip should be %.2f %n", km/liters * price);
		
	}
}
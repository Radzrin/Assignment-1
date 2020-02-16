import java.util.Scanner;

public class Question2 {
	
	public static void main(String[] args) {
	

		double price;
		double taxes = 0.15;
		 double priceFinal;
		 final double finish;

		Scanner sc = new Scanner(System.in);
		System.out.println("What is the price of the item you want to buy?");
		price  = sc.nextInt();

		priceFinal = price * taxes;
		finish = priceFinal + price;

		System.out.printf("the price should be %.2f %n", + finish);
	}
	
}	

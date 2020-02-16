import java.util.Scanner;

public class Question3 {
  public static void main(String[] args) {
	
	  //variables
	int num1;
	int num2;
	int num3;
	int result;
	  
		System.out.println("Enter any 3 integers ");
		Scanner in = new Scanner(System.in);
		num1 = in.nextInt();
		num2 = in.nextInt();
		num3 = in.nextInt();
		result=num1+num2+num3;
		System.out.println("The result after addition is "+result);
	
	
  }
}

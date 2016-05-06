/**Name:Erin
 *Id:U10108079
 *Exercise:HW8_number_pr
 */

import java.math.BigDecimal;
import java.util.Scanner;

public class PromoteAccuracy{
	public static void main(String []args){

		// Create a Scanner
		Scanner input = new Scanner(System.in);

		//Enter the first number
		System.out.print("Enter the first number：");
		String firstStringNumber = input.next();
		BigDecimal firstNumber = new BigDecimal(firstStringNumber);

		//Enter the second number
		System.out.print("Enter the second number：");
		String secondStringNumber = input.next();
		BigDecimal secondNumber = new BigDecimal(secondStringNumber);

		//Choose the calculation which you want to do
		System.out.println("Choose the calculation which you want to do：  1. " + firstNumber + "+" + secondNumber + "  2. " + firstNumber + "-" + secondNumber + "  3. " + firstNumber + "*" + secondNumber + "  4. " + firstNumber + "/" + secondNumber );
		int calculation = input.nextInt();

		//Print the result of the calculation
		switch(calculation){
		case 1:	System.out.println(firstNumber + "+" + secondNumber + "=" + firstNumber.add(secondNumber));
			break;
		case 2:	System.out.println(firstNumber + "-" + secondNumber + "=" + firstNumber.subtract(secondNumber));
			break;
		case 3:	System.out.println(firstNumber + "*" + secondNumber + "=" + firstNumber.multiply(secondNumber));
			break;
		case 4:	System.out.println(firstNumber + "/" + secondNumber + "=" + firstNumber.divide(secondNumber));
			break;
		default:System.out.println("Error!!");
			break;
		}
	}
}

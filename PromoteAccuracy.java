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

	}
}

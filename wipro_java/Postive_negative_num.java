
package wipro_java;

import java.util.Scanner;

public class Postive_negative_num {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int number = Scanner.nextInt();

        if (number > 0) {
            System.out.println(number+ "The number is Positive.");
        } else if (number < 0) {
            System.out.println(number+"The number is Negative.");
        } else {
            System.out.println(number+"The number is Zero.");
        }

  
    }
}

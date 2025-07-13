package wipro_java;
import java.util.Scanner; 
public class Non_negative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first non-negative integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second non-negative integer: ");
        int num2 = scanner.nextInt();
        boolean result = lastDigit(num1, num2);
        System.out.println("Same last digit? " + result);
        scanner.close();
    }
    public static boolean lastDigit(int a, int b) {
        return (a % 10) == (b % 10);
    }
}
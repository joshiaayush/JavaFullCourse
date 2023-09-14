package practice.codechef;
import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double a = input.nextDouble();

        System.out.println("Enter the second number:");
        double b = input.nextDouble();

        System.out.println("Enter the operation (+, -, *, /):");
        char operator = input.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }

        System.out.println(a + " " + operator + " " + b + " = " + result);
    }
}

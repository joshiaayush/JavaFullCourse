package practice.functions;
import java.util.Scanner;
public class Multiplication {
    public static float multiply(float a, float b){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        float a = sc.nextFloat();
        System.out.println("Enter number :");
        float b = sc.nextFloat();

        System.out.println("Multiplication of two numbers is : "+multiply(a,b));
    }
}

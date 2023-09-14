package practice.functions;
import java.util.Scanner;
public class CircumferenceOfCircle {
    public static void circumference(int r){
        System.out.println(2*Math.PI*r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of radius of circle :");
        int r = sc.nextInt();

        circumference(r);
    }
}

package practice.functions;
import java.util.Scanner;
public class GreatestOfTwoNumbers {
    public static void compare(int i, int j){
        if(i<j){
            System.out.println(i+" is less than "+j);
        }
        else if(i==j){
            System.out.println(i+" is equal than "+j);
        }
        else {
            System.out.println(i+" is greater than "+j);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number ");
        int i = sc.nextInt();
        System.out.println("Enter second number ");
        int j = sc.nextInt();

        compare(i,j);
    }
}

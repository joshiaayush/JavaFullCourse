package practice.functions;
import java.util.Scanner;
public class AdditionOfTwoNumbers {

    public static float add(float i, float j){
        float sum = i+j;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float i = sc.nextFloat();
        float j = sc.nextFloat();

        float sum = add(i,j);
        System.out.println(sum);

    }
}

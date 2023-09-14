package practice.functions;
import java.util.Scanner;
public class AverageOfNumbers {
    public static float average(float a, float b, float c){
        float avg = (a+b+c)/3;
        System.out.println("Average of input is :"+avg);
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers :");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        average(a,b,c);
    }
}

package practice.functions;
import java.util.Scanner;
public class PrintMyName {
    public static void Functions(String name){
        System.out.println(name);
    }
    public static void Functions(int i){
        System.out.println(i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int i = sc.nextInt();

        Functions(name);
        Functions(i);
    }
}

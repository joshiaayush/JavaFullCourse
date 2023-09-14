package practice.strings;
import java.util.Scanner;
public class Concatenation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name :");
        String name = sc.nextLine();
//        System.out.println("Enter your Surname :");
//        String surname = sc.nextLine();
//        System.out.println("Enter your address :");
//        String address = sc.nextLine();
//
//        System.out.println(name+surname+address);
//        System.out.println(name.length());
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i)+" ");
        }
    }
}

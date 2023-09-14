package practice.strings;
import java.util.*;
public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name :");
        String name = sc.nextLine();
        System.out.println("Enter your Surname :");
        String surname = sc.nextLine();
        System.out.println("Enter your address :");
        String address = sc.nextLine();

        System.out.println("Your name is :"+name+" Surname is :"+surname+" Address is :"+address);
    }

}

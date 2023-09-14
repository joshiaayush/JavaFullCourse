package practice.strings;
import java.util.Scanner;
public class RemoveSpecialCharactersInAGivenString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "A@GY%HG%$#$JHU";

        //Approach - 1
        String plainString = str.replaceAll("[^a-zA-Z0-9]","");
        //[^a-zA-Z0-9] this means that except all those remove all and make that place empty
        System.out.println(plainString);

    }
}

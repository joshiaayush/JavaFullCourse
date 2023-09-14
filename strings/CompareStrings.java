package practice.strings;
import java.util.Scanner;
public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //compare
        String name1 = "Aayush";
        String name2 = "Aayush";
/*  Compare to function checks for three conditions
1. s1 > s2 then returns +ve value
2. s1 == s2 then return 0
3. s1 < s2 then return -ve value

Don't use '==' for comparison because many taste cases are not cleared
 */
        if(name1.compareTo(name2)==0){
            System.out.println("Strings are equal");
        }
        else System.out.println("Strings are not equal");
    }
}

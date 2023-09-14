package practice.strings;
import java.util.*;
public class SubString {
    public static void main(String[] args) {
        //Strings are Immutable
        String sentence = "123456789";
        String o = sentence.substring(0,7);
        String i = sentence.substring(1,8);
        String name = sentence.substring(2,9);
        int n = Integer.parseInt(sentence);
        System.out.println(o);
        System.out.println(i);
        System.out.println(name);
        System.out.println(n-123456788);
    }
}

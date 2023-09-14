package practice.strings;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String str = "   JO  S H I  ";
        String removedWhiteSpaces = str.replaceAll(" ","");
        System.out.println(removedWhiteSpaces);
        String removedWhiteSpaces1 = str.replaceAll("\\s","");
        //The term "\\s" represents a unicode value as a white space
        System.out.println(removedWhiteSpaces1);
    }
}

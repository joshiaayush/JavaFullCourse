package practice.strings;

public class StringBuilders {
    public static void main(String[] args) {
        //Building a StringBuilder
        StringBuilder str = new StringBuilder("Aayush");
        System.out.println(str);

        //Retrieving the character at a particular index
        System.out.println(str.charAt(2));

        //Setting character at needed location
        str.setCharAt(0,'a');

        //Printing the string
        System.out.println(str);

        //Inserting a character at any location
        str.insert(0,'A');
        System.out.println(str);

        //Deleting a character in a stringBuilder
        str.delete(0,1);
        System.out.println(str);

        //Appending at the end of the string
        str.append(' ');
        str.append('J');//str = str + 'J'
        str.append('o');
        str.append('s');
        str.append('h');
        str.append('i');
        System.out.println(str);

        //Printing length of StringBuilder
        System.out.println(str.length());
    }
}

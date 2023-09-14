package practice.operators;

public class Bitwise {
    public static void main(String[] args) {
        int a = 10;
        int b = -1;

        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        //Left shift operator
        System.out.println(a<<1);
        System.out.println(a<<2);
        System.out.println(a<<3);

        //Right shift operator
        System.out.println(a>>1);
        System.out.println(a>>2);
        System.out.println(a>>3);
        System.out.println(a>>4);
        System.out.println(a>>5);

        //Unsigned Right shift operator
        System.out.println(Integer.toBinaryString(b));
        System.out.println(b>>>28);
        System.out.println(Integer.toBinaryString(b>>>1));
    }
}

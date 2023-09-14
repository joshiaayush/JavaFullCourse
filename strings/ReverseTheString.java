package practice.strings;
public class ReverseTheString {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Aayush");

        for (int i = 0; i < str.length()/2; i++) {
            int front = i;
            int back = str.length()-1-i;

            char frontChar = str.charAt(front);
            char backChar = str.charAt(back);

            str.setCharAt(front,backChar);
            str.setCharAt(back,frontChar);
        }
        System.out.println(str);

        //Approach - 1
        /*
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        char []ch = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(ch[i]+" ");
        }
         */

        //Approach - 2
        /*
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        char []ch = str.toCharArray();

        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(ch[i]+" ");
        }
         */

        //Approach-3
        /*
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        char []ch = str.toCharArray();

        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.charAt(i));
        }

         */

        //Approach -4
        /*
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();


        StringBuffer br = new StringBuffer(str);
        System.out.print(br.reverse());
         */

        //Approach -5
        /*
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();


        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());
         */
    }
}

package practice.patterns;

public class Pattern12 {
    public static void main(String[] args) {
        int n= 3;
        /*
        *                       *
        *                     * * *
        *                       *
        *
        *
        * */
        for (int i = 1 ; i <=n ; i++) {
            for (int j = i; j <=n ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

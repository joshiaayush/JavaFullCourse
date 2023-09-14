package practice.patterns;
//Inverted Half Pyramid With Numbers
public class Pattern9 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for (int i = 2; i <= n ; i++) {    //Here i = 2 is written because to start printing numbers directly from 1 2 instead of 1
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

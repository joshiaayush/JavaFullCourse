package practice.patterns;
import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int num;
//        int sum = 0;
//        char choice ;
//
//        do{
//            System.out.println("Enter value :");
//            num = sc.nextInt();
//            sum+=num;
//            System.out.println("Do you want to continue ");
//            choice = sc.next().charAt(0);
//        }while(choice == 'Y' || choice == 'y');
//
//        System.out.println("Sum :"+sum);

        int num = (int) (Math.random()*100)+1;
        System.out.println(num);
        int guess,attempt=0;
        do{
            System.out.println("Enter a number :");
            guess = sc.nextInt();
            attempt++;
            if(guess>num){
                System.out.println("NUmber is smaller :");

            }else if(guess<num){
                System.out.println("NUmber is greater");

            }else System.out.println("Equal and your attempts are :"+attempt);


        }while(num!=guess);
    }
}



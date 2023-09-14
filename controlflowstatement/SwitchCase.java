package controlflowstatement;
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        double num1 = sc.nextInt() ;
        System.out.println("Enter second number :");
        double num2 = sc.nextInt();
        System.out.println("Enter a operator(+,-,*,/)");
        char c = sc.next().charAt(0);

        switch(c){
            case '+':
                System.out.println("Addition is : "+(num1+num2));
//                switch(i){
//                    case 1:
//                        System.out.println("In inner loop");
//                    case 2:
//                        System.out.println("In inner loop 2");
//                    default:
//                        System.out.println("In inner default loop");
//                }
                break;
            case '-':
                System.out.println("Subtraction is : "+(num1-num2));
                break;
            case '*':
                System.out.println("Multiplication is : "+num1*num2);
                break;
            case '/':
                System.out.println("Division is : "+(num1/num2));
                break;
            default:
                System.out.println("Invalid!!!!!");
        }
    }

}

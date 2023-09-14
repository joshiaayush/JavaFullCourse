package practice.functions;
import java.util.Scanner;
public class VoterEligibility {
    
    public static void eligibility(int age){

        if (age>18){
            System.out.println("You are eligible...");
        }
        else{
            System.out.println("You are not eligible ....");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = sc.nextInt();
        
        eligibility(age);
    }
    
}

package classproblems;
import java.util.Objects;
import java.util.Scanner;
public class BankingSystem {
    public static void main(String[] args) {
        boolean confirm = false;
        char repeat = 0;

        //User account details
        String username = "Aayush";
        String accountNumber = "12345678901";
        String Password = "Password";
        double Balance = 10000;


        /*Taking input form user for username and password and validating the password
         If valid user then -> confirm==true
         Else invalid user and breaking out of all program by displaying the output as incorrect password*/


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Username :");
        String str = sc.nextLine();

        if (Objects.equals(str, username)){
            System.out.println("Enter Password :");

            String pass = String.valueOf(sc.nextLine());
            if(pass.equals(Password)){
                confirm = true;
                System.out.println("Password Confirmed");
            }
            else {
                System.out.println("Wrong Password....");
            }
        }else System.out.println("Wrong user name...");


            //Cont. block
        do {
                //Input process block
                if(confirm) {

                    //Asking the user for his action
                    System.out.println("What action would you like to perform :");
                    System.out.println("1.View Balance");
                    System.out.println("2.Deposit");
                    System.out.println("3.Withdraw");
                    System.out.println("For viewing balance press 1");
                    System.out.println("For Deposit press 2");
                    System.out.println("For withdraw press 3");

                    //Taking input in the form of characters
                    char c = sc.next().charAt(0);

                    switch (c) {
                        case '1':
                            System.out.println("Your balance is :" + Balance);
                            break;
                        case '2':
                            try{System.out.println("Enter amount :");
                                float depositAmount = sc.nextFloat();
                                Balance += depositAmount;
                                System.out.println("Deposit Successful");
                                System.out.println("Your available balance is :" + Balance);}
                            catch (Exception e){
                                System.out.println("Enter a numeric amount");
                            }

                            break;
                        case '3':
                            try{System.out.println("Enter amount :");
                                int withdrawAmount = sc.nextInt();
                                if (withdrawAmount <= Balance) {
                                    Balance -= withdrawAmount;
                                    System.out.println("Transaction Successful....");
                                    System.out.println("Your available balance is :" + Balance);
                                } else System.out.println("Your balance is low");}
                            catch (Exception e){
                                System.out.println("Enter a numeric amount");
                            }
                            break;
                        default:
                            System.out.println("Enter a valid number(1,2,3)");
                    }
                System.out.println("Do you want to continue ? (y/n)");
                repeat = sc.next().charAt(0);

            }

        }while (repeat == 'y' || repeat == 'Y');

        System.out.println("Thank You !");

    }
}
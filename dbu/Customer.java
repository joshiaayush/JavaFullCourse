package practice.dbu;
import java.util.*;
public class Customer {
    private String name;
    private int Cake_order;
    private int Prize;

    public Customer() {
        // TODO Auto-generated constructor stub
    }
    /**
     * @param name
     * @param cake_order
     * @param prize
     */
    public Customer(String name, int cake_order, int prize) {
        this.name = name;
        Cake_order = cake_order;
        Prize = prize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCake_order() {
        return Cake_order;
    }

    public void setCake_order(int cake_order) {
        Cake_order = cake_order;
    }

    public int getPrize() {
        return Prize;
    }

    public void setPrize(int prize) {
        Prize = prize;
    }

    @Override
    public String toString() {
        return "Customer [name=" + name + ", Cake_order=" + Cake_order + ", Prize=" + Prize + "]";
    }

    public static void main(String[] args) {
        ArrayList Customer=new ArrayList<>();

        Scanner scanner=new Scanner(System.in);
        int count=1;

        while(true) {
            System.out.println("ENTER THE CUSTOMER DETAILS:" +(count++));
            System.out.println("ENTER THE CUSTOMER NAME:" );
            String nameString=scanner.next();

            System.out.println("ENTER THE CUSTOMER CAKE_ORDER:");
            int order=scanner.nextInt();

            System.out.println("ENTER THE CAKE_PRIZE:");
            int prize=scanner.nextInt();

            Customer cust=new Customer(nameString,order,prize);
            Customer.add(cust);

            System.out.println("DO YOU ADD MORE CUSTOMER: ");
            System.out.println("yes or no");

            String choiceString=scanner.next();

            if(choiceString.equalsIgnoreCase("no")){
                break;

            }

        }

        System.out.println("CUSTOMERS DETAILS ");
        System.out.println("********************************************");

        for(Object R:Customer) {
            System.out.println(R);
        }

    }

}

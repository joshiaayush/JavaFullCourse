package controlflowstatement;
//Greatest of four numbers
public class IfElse {
    public static void main(String[] args) {
        int a = 50, b = 10, c = 30, d= 40;

        if(a>b && a>c && a>d){
            System.out.println("a is greater");
        }
        else if (b>c && b>d){
            System.out.println("b is greater");
        }
        else if(c>d){
            System.out.println("c is greater");
        }
        else System.out.println("d is greater");
    }
}

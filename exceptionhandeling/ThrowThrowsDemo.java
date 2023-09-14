package exceptionhandeling;

public class ThrowThrowsDemo {
    public static void main(String[] args) throws Exception {
        int age = 19;

        if(age>= 18){
            System.out.println("You can vote");
        }
        else {
            throw new Exception("You can not vote");
        }

        System.out.println("Exit");
    }
}

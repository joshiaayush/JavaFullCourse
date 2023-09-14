package exceptionhandeling;

import java.io.IOException;

public class MethodOverriding {

    public void show()throws RuntimeException {
        System.out.println("In show");
    }
}

class MethodOverriding1 extends MethodOverriding{
    public void show() //throws Exception
    {
        System.out.println("In show");
    }
}

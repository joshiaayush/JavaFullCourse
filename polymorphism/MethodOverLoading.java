package polymorphism;

public class MethodOverLoading {
    public int add(int i, int j){
       System.out.println(i+j);
        return i+j;
    }

    public float add(float i, int j){
        System.out.println(i+j);
        return i + j;
    }

    public double add(double i, int j){
        System.out.println(i+j);
        return i + j;
    }

    public static void main(String[] args) {
        MethodOverLoading obj = new MethodOverLoading();

        obj.add(12,3);
        obj.add(12.3,4);
        obj.add(23.4f, 4);
    }
}

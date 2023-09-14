package inheritance;
class Rectangle{
    public int length ;
    public int width;
   Rectangle(int l){
       System.out.println("This is parameterized");
       this.length = l;
   }
   public double area(){
       return length*width;
   }

}
class Cuboid extends Rectangle{
    private final int length;
    public int height;

    Cuboid(int l, int w, int h){
        super(l);
        this.length =l;
        this.width =w;
        this.height =h;
    }
    public double Area(){
        return 2*(this.length*this.width +this.length*this.height + this.width*this.height);
    }
}
public class Problem_2 {
    public static void main(String[] args) {
        Cuboid obj = new Cuboid(12,2,3);
    }
}

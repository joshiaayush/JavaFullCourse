package encapsulation;
//Wrapping of data into single unit
public class EncapsulationDemo {
    private int id;
    private String name;
    private String address;
    public void setId(int id){
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {
        EncapsulationDemo obj = new EncapsulationDemo();
        obj.setId(12);
        obj.setAddress("Pune");
        obj.setName("Aayush");
        System.out.println("Employee id is : "+obj.id);
        System.out.println("Employee name is :"+obj.name);
        System.out.println("Employee address is : "+obj.address);
    }
}

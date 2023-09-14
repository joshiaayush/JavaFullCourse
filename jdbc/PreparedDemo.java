package jdbc;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedDemo {
    public static void main(String[] args) {
        int id; String name; String address;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter id name address");
        id = sc.nextInt();
        name = sc.next();
        address = sc.next();

        try{
            String str = "insert into student (id,name,address) values (?,?,?)";
            PreparedStatement preparedStatement = Conn.getConn().prepareStatement(str);
            preparedStatement.setInt(1,id);
            preparedStatement.setString(2,name);
            preparedStatement.setString(3,address);

            int i = preparedStatement.executeUpdate();
            System.out.println("record is inserted successfully "+i);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

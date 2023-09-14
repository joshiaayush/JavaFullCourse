package jdbc;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BatchStatement {
    public static void main(String[] args) throws SQLException {
        Statement statement = Conn.getConn().createStatement();

        String insert = "insert into student(id,name,address,age) values(?,?,?,?)";
        PreparedStatement preparedStatement = Conn.getConn().prepareStatement(insert);

        for (int i = 1; i <= 2; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter id name address age :");

            preparedStatement.setInt(1,sc.nextInt());
            preparedStatement.setString(2,sc.next());
            preparedStatement.setString(3,sc.next());
            preparedStatement.setInt(4,sc.nextInt());
        }
        preparedStatement.executeBatch();
        System.out.println("Records uploaded successfully.......");
    }
}

package conj;

import java.sql.*;
import java.util.Scanner;


public class jdbc {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

            Statement stmt = con.createStatement();
            int count = stmt.executeUpdate("truncate table persons");

            int n;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of new entries:");
            n = sc.nextInt();

            // Using prepared statement for insertion
            String insertQuery = "INSERT INTO persons VALUES (?, ?, ?,?)";
            try (PreparedStatement preparedStatement = con.prepareStatement(insertQuery)) {
                for (int i = 0; i < n; i++) {
                    System.out.println("Enter values for entry " + (i + 1));
                    int in = sc.nextInt();
                    String fn = sc.next();
                    String ln = sc.next();

                    // Assuming 'add' is an integer; change the type accordingly if needed
                    String add = sc.next();

                    preparedStatement.setInt(1, in);
                    preparedStatement.setString(2, fn);
                    preparedStatement.setString(3, ln);
                    // Assuming 'add' is an integer; change the type accordingly if needed
                    preparedStatement.setString(4, add);

                    int count2 = preparedStatement.executeUpdate();
                }
            }

            ResultSet rs = stmt.executeQuery("SELECT * FROM persons");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

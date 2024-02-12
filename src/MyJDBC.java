import java.sql.*;

public class MyJDBC {
    public static void main(String[] args) throws SQLException {

        // Form a connection to the database
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema", "root", "Twins2012");
        Statement statement = connection.createStatement();
        ResultSet set = statement.executeQuery("select * from people");

        while(set.next()){
            System.out.println(set.getString("firstName"));
        }

    }
}

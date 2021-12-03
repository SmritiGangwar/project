import java.sql.*;
class Student {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");  //cj=connector java

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/GLAE21", "root", "");

    }
}
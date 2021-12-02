import java.sql.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class hello{
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/E2data","root","");
        PreparedStatement ps = con.prepareStatement("insert into info values (?,?)");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine();

        Pattern p_no = Pattern.compile("(0|91)?[96][0-9]{9}");
        Pattern email = Pattern.compile("[a-zA-Z0-9._]+@(gmail|yahoo|rediffmail)+.com");

        Matcher m = email.matcher(str);
        Matcher n = p_no.matcher(str);
        //  int c=0,ctr=0;
        String s1 = null ,s2 = null;

        try
        {
            while(m.find())
            {
                s1 = m.group();
            }
            while(n.find())
            {
                s2 = n.group();
            }
            if (s1.equals(null)||s2.equals(null))
            {
                throw new Exception("invalid");
            }
            else
            {
                ps.setString(1,s1);
                ps.setString(2,s2);
                ps.executeUpdate();
            }
        }catch (Exception e)
        {
            //    e.printStackTrace();
            System.out.println(e);
        }

        con.close();

    }
}
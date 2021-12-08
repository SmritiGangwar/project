import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter mail Id : ");
        String str = sc.nextLine();
        Pattern p_no = Pattern.compile("(0|91)?[96][0-9]{9}");
        Pattern email = Pattern.compile("[a-zA-Z0-9._]+@(gmail|yahoo|rediffmail)+.com");

        Matcher m = email.matcher(str);
        Matcher n = p_no.matcher(str);
        while(m.find())
        {
            System.out.println(m.group());

        }
        while(n.find())
        {
            System.out.println(n.group());
        }
    }
}
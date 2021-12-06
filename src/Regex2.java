import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter names : ");
        String target = sc.nextLine();
        Pattern P = Pattern.compile("\\w+[j|J]");
        Matcher M = P.matcher(target);
        while(M.find()) {
            System.out.println(M.group());
        }
    }
}
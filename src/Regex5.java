import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex5 {
    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);
        System.out.println("Enter names : ");
        String target = scc.nextLine();
        Pattern P = Pattern.compile("\\W+");
        Matcher M = P.matcher(target);
        while(M.find()) {
            System.out.println(M.group());
        }
    }
}
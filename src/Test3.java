
import java.util.Scanner;
public class Test3 {

    Scanner s = new Scanner(System.in);
    String patientName = s.nextLine();

    double height = s.nextDouble();

    double weight = s.nextDouble();

    double BMI = (weight / (height * height));

    public static void main(String[] args) {

        Test3 obj = new Test3();

        System.out.println(obj.BMI);
    }
}
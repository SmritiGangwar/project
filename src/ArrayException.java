import java.util.Scanner;

public class ArrayException {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
            int a = s.nextInt();
            int b = s.nextInt();
            int arr[]={12,34,56,78,90};
            int index = s.nextInt();

            System.out.println(a/b);
            System.out.println(arr[index]);
        }
        catch(ArrayIndexOutOfBoundsException obj1)
        {
            System.out.println(obj1);
        }
        catch(ArithmeticException obj1)
        {
            System.out.println(obj1);
        }
        catch(Exception obj1)
        {
            System.out.println(obj1);
        }
    }
}


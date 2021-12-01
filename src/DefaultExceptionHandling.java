public class DefaultExceptionHandling {
    public static void main(String[] args) {
        try{
            throw new ArithmeticException("/ by zero");   //for explicit handling.
        }
        catch(ArithmeticException obj)
        {
            System.out.println(obj);
        }
    }
}

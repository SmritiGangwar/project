interface test{
    public void square();
}
class arithmetic implements test{
    public void square(){
        System.out.println("Definition");
    }
}
public class Test {
    public static void main(String[] args) {
        arithmetic obj = new arithmetic();
        obj.square();
    }
}

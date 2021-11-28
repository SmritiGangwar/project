import org.w3c.dom.ls.LSOutput;

class Test4 extends Thread{
    public void run()
    {
        System.out.println(10/0);
    }
}
class Test2 extends Thread{
    int[] arr={1,2,3,3};
    public void run()
    {
        System.out.println(arr[6]);
    }
}
class Test5 extends Thread{

}

public class ExceptionInThread {
    public static void main(String[] args) {
        Test4 obj1=new Test4();
        Test5 obj2=new Test5();
        System.out.println(obj1);
    }

}
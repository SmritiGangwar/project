class Mythread extends Thread
{
    public void run()
    {
        //for(int i=0; i<10; i++)
        //  System.out.println("My Thread"+i);
        System.out.println(10/0);
    }
}
public class MultiThreaded {
    public static void main(String[] args) {
        Mythread obj = new Mythread();
        //or Thread = new Mythread();
        obj.start();
        for(int i=0; i<10;i++)
            System.out.println("Main Thread"+1);  //Different value at every run
    }
}

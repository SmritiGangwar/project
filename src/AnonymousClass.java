public class AnonymousClass {
    public static void main(String[] args) {

        Thread obj1 = new Thread(new Runnable() {   //instead of 'Thread(new Runnable()' : 'Thread(() ->'  Lambda
            @Override
            public void run() {
                Thread.currentThread().setName("E custom");
                for(int i=0; i<10;i++) {
                    System.out.println(Thread.currentThread().getName());
                }
            }
        });//Anonymous object
        obj1.start();
        for(int i=0;i<10;i++)
            System.out.println("Main Thread");
    }
}

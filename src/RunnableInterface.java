class Testthread implements Runnable{

    @Override
    public void run() {
        Thread.currentThread().setName("E custom Thread");
        for(int i=0; i<10;i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}


class RunnableInterface {
    public static void main(String[] args) {
        Thread obj1 = new Thread(new Testthread());   //Anonymous object
        obj1.start();
        for(int i=0;i<10;i++)
            System.out.println("Main Thread");
    }
}

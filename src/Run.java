class Run extends Thread{
    public void run(){
        System.out.println("running...");
    }
    public static void main(String args[]){
        Run t1=new Run();
        t1.run();
    }
}  
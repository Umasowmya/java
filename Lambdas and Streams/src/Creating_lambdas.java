
public class Creating_lambdas {
    public static void main(String args[]){
        Runnable r1=()->{
            System.out.println("thread is running");
        };

        Thread t = new Thread(r1);
        t.start();
    }
}

package multithreading;

public class MyThread implements Runnable{
    @Override
    public void run() {
        while (true) {
            System.out.println("hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        Thread thread=new Thread(new MyThread());
        thread.start();
    }
}

package multithreading;

public class ThreadDemo extends Thread{

    @Override
    public void run() {
        while(true){
            System.out.println("thread is running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        ThreadDemo thread=new ThreadDemo();
        thread.start();
    }
}

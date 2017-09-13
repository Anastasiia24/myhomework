package threadMy;

public class MyThread implements Runnable {                                           // надо было назвать myRun
    @Override
    public void run() {
        System.out.println(this.getClass().getName()+"  thread  "+Thread.currentThread().getName());
    }
}

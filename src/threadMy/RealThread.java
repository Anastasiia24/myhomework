package threadMy;

public class RealThread extends Thread {
    @Override
    public void run() {
        System.out.println(this.getClass().getName()+"  thread  "+Thread.currentThread().getName());
    }
}

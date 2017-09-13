package threadMy;

public class MyMain {
    public static void main(String[] args) {
        System.out.println(MyMain.class.getName()+"  thread  "+Thread.currentThread().getName());

        Thread thread= new Thread(new MyThread());   //mythread это myrunnable
        thread.start();

        RealThread rth=new RealThread();
        rth.start();

    }
}

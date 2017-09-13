package threadMy;

public class SleepingThread extends Thread{

    long delay;

    public SleepingThread(long delay){
        this.delay=delay;
    }


    @Override
    public void run(){
        try{
            sleep(delay);
            System.out.println("Class:  "+this.getClass().getName()+"  thread: "+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("exeption eee");
        }
    }
}

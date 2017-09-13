package threadMy;

public class JoiningThread extends Thread {

    Thread other;

    public JoiningThread(Thread other){
        this.other=other;
            }

    public void run(){
        try{
            this.other.join();
            System.out.println("Class:  "+this.getClass().getName()+"  thread: "+Thread.currentThread().getName());

        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("interrupted");
        }
    }
}

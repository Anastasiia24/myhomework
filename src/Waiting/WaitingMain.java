package Waiting;

public class WaitingMain {
    public static void main(String[] args) throws InterruptedException {
        System.out.print("hi, ");
        Thread th=new Thread(new WaitingRun());
        th.start();

        try {
            th.join(5000);
            if (th.isAlive()) {
                th.interrupt();
                System.out.println("you are too slow");

            }
            else {
                System.out.println(", nice to meet you");
            }
        }
        catch (InterruptedException e){
            e.printStackTrace();

        }




    }
}

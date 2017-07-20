import java.util.Scanner;

public class brick {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1 side");
        int x=sc.nextInt();
        Scanner sc1= new Scanner(System.in);
        System.out.println("Enter 2 side");
        int y=sc1.nextInt();
        Scanner sc2= new Scanner(System.in);
        System.out.println("Enter 3 side");
        int z=sc2.nextInt();
        Scanner sc3= new Scanner(System.in);
        System.out.println("Enter diameter");
        int d=sc3.nextInt();
        int r=0;

        double a=Math.sqrt(x*x+z*z);
        double b=Math.sqrt(x*x+y*y);
        double c=Math.sqrt(y*y+z*z);
        if((b<d && a>d && c>d ) || (a<d && b>d && c>d) || (c<d && a>d && b>d))
        {System.out.println("the book will enter by one side");}
        else if(a<d && b<d && c<d) {System.out.println("the book will enter by 3 sides");}
        else {System.out.println("no one");}
    }
}

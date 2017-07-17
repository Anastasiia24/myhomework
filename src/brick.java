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
        if((x<=d && y<=d && z>d) || (x<=d && z<=d && y>d) || (y<=d && z<=d && x>d))
        {System.out.println("the book will enter by one side");}
        else if(x<d && y<d && z<d) {System.out.println("the book will enter by 3 sides");}
        else {System.out.println("no one");}
    }
}

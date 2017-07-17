package MasMin;

import java.util.Scanner;

/**
 *
 */
public class MasMinim {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        Scanner sc1=new Scanner(System.in);
        int b=sc1.nextInt();
        int c=0;
        while(a>=b) {
            a -= b;
            c++;
        }
        System.out.println("Quotient: "+c);
        System.out.println("Remainder of the division: "+a);
            }
}

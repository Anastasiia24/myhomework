package tpib;

import java.util.Scanner;

public class Tribonachi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int r;
        if(x==1 || x==2) {r=1;}
        else {r= tribon(x-3,1,1,2);}
        System.out.println(r);
    }
        public static int tribon(int x, int a, int b, int c){
           if(x>0){
               return tribon(x-1, b, c, a+b+c);
           }
           else {return c;}


    }

}

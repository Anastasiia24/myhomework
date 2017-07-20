package tpib;

import java.util.Scanner;

public class Tribonachi {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(tribon(x-1,1,1,2));
    }
    
    public static int tribon(int x, int a, int b, int c){
               if(x>0){
               return tribon(x-1, b, c, a+b+c);
           }
           else {return a;}


    }

}


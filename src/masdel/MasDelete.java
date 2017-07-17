package masdel;

import java.util.Scanner;

public class MasDelete {
    public static void main(String[] args) {
        int[] array = new int[12];


        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 16));
            System.out.print(array[i]+"   ");
        }

        System.out.println("input index");
        Scanner cs=new Scanner(System.in);
        int index=cs.nextInt();

        for(int i=0; i<array.length-1;i++){
               if(i<index){System.out.print(array[i]+"   ");}
               else {System.out.print(array[i+1]+"   ");}

}

    }
}

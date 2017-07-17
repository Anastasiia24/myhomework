package masminim;

import java.util.Arrays;

public class masminimum {
    public static void main(String[] args) {
        int[] array = new int[12];
        int[] min = new int[3];


            for (int i = 0; i < array.length; i++) {
                array[i] = ((int) (Math.random() * 16));
                System.out.print(array[i] + "   ");
            }
            System.out.println("");
            Arrays.parallelSort(array);



            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + "   ");
            }

        System.out.println(" ");


        System.out.print((min[0]=array[0])+"  ");
         int r=1;
                 for (int i = 1; i < array.length; i++) {
                        if ((array[i] != array[i-1]) && r!=3) {
                            System.out.print((min[r] = array[i])+"  ");
                                            r++;
                                            }


                    }



    }
}

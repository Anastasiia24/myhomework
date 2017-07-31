import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Box {
    public static void main(String[] args) {


   int[] arr={4, 5, 8, 3, 2, 5, 7, 9};
        System.out.println(sum(arr));
        System.out.println(size(arr));
        System.out.println(average(arr));
        System.out.println(maxEl(arr));
        System.out.println(multiply(arr));

    }



    public static int sum(int[] mas){
        int s=0;
        for (int i = 0; i < mas.length; i++) {
            s+=mas[i];
            }
        return s;
    }

    public static int size(int[] mas){
        return mas.length;
        }

    public static double average(int[] mas){
        double a=sum(mas);
        double b=size(mas);
        return a/b;
    }

    public static int maxEl(int[] mas){
        int maxel=0;
        for (int i = 0; i < mas.length; i++) {
            if(mas[i]>maxel){maxel=mas[i];}
        }
        return maxel;
    }

    public static int multiply(int[] mas){
        int mult=1;
        for (int i = 0; i <mas.length ; i++) {
            mult*=mas[i];
        }
        return mult;
    }
}

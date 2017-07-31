package ThirdElFromtheEnd;

import java.util.ArrayList;
import java.util.Iterator;

public class MainClass {

    public static void main(String[] args) {

    ArrayList<Integer> arr = new ArrayList<>(7);

        for (int i = 0; i < 7; i++) {
            arr.add(i,i + 5);
            System.out.print(arr.get(i)+"  ");
        }
        System.out.println(" ");
        System.out.println("List size is: "+arr.size());

        Iterator<Integer> iter=arr.iterator();
        GetElem gTE=new GetElem(iter);
        System.out.println("The third element from the end is: "+arr.get(gTE.getThirdElem(arr)));

    }
}

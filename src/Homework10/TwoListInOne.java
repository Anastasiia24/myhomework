package Homework10;

import java.util.ArrayList;
import java.util.List;

public class TwoListInOne {




        public static void main(String[] args) {

            List<Integer> list1 = new ArrayList<>();
            List<Integer> list2 = new ArrayList<>();



            for (int i = 0; i < 20; i++) {
                list1.add(i*2);
            }

            for (int i = 0; i < 20; i++) {
                list2.add(i*5);
            }

            System.out.println(list1);
            System.out.println(list2);

            System.out.println(Merger(list1,list2));


        }



        static List<Integer> Merger(List l1, List l2)
    {
        List list = new ArrayList();

        int l = 0;

        if (l1.size() > l2.size()) { l = l1.size();}
        else {l = l2.size();}

        for (int i = 0; i < l; i++) {

            list.add(l1.get(i));
            list.add(l2.get(i));
        }
        return list;
    }



}




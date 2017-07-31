package ThirdElFromtheEnd;

import java.util.ArrayList;
import java.util.Iterator;

public class GetElem {
    Iterator<Integer> iterator;

    public GetElem(Iterator iterator){
        this.iterator=iterator;
    }

    public int getThirdElem(ArrayList<Integer> list){
        int count=0;
        int thirdel = 0;
        for (int i = 0; i < list.size(); i++) {
            count++;
        }



        for (int i = 0; i < list.size(); i++) {
            if(i==count-3) {
               thirdel=i;
            }
        }
        return thirdel;
    }
}

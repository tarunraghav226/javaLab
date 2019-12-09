package question1;

import question1.sport.Sport;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Sport> hashSet =new HashSet<>();
        String name="football ";
        int size=6;

        ArrayList<Sport> arrayList =new ArrayList<>();

        for(int i=0;i<10;i++){
            Sport sport =new Sport(name+i,size+i);
            hashSet.add(sport);
        }

        int i=0;

        for(Sport sport:hashSet) {
            if(i==5)
                break;
            arrayList.add(sport);
            i++;
        }

        for(Sport sp:hashSet)
            System.out.println(sp);
    }
}

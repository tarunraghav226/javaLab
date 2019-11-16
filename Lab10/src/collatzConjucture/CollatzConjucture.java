package collatzConjucture;

import java.util.ArrayList;
public class CollatzConjucture {
    public ArrayList<Integer> getCollatzConjucture(int number){
        ArrayList<Integer> list=new ArrayList<Integer>();
        while(number!=1){
            if(number%2==0){
                list.add(number/2);
                number/=2;
            }
            else{
                list.add(3*number+1);
                number=3*number+1;
            }
        }
        return list;
    }

    public void displayList(ArrayList<Integer> list){
        if(list.size()==0){
            System.out.println("no element");
            return;
        }
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}

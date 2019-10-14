import java.util.Arrays;

public class StringDemo{
    public static void main(String[] args){
        String[] names= new String[5];
        for (int i = 0; i < names.length; i++) {
            names[i]=new String("Tarun version--> 1."+i);
        }
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        Arrays.fill(names,"Tarun");
        System.out.println(Arrays.toString(names));
    }
}
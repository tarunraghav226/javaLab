import java.util.ArrayList;
import java.util.Scanner;
import collatzConjucture.CollatzConjucture;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CollatzConjucture co =new CollatzConjucture();
        ArrayList<Integer> list= co.getCollatzConjucture(scan.nextInt());
        co.displayList(list);
    }
}

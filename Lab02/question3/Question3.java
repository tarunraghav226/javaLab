import java.util.Scanner;

public class Question3{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int val1= scan.nextInt();
        int val2 = scan.nextInt();
        System.out.println(val1+" + "+val2+" = "+(val1+val2));
        System.out.println(val1+" - "+val2+" = "+(val1-val2));
        System.out.println(val1+" * "+val2+" = "+(val1*val2));
        System.out.println(val1+" / "+val2+" = "+(val1/val2));
        System.out.println(val1+" % "+val2+" = "+(val1%val2));
        scan.close();
    }
}
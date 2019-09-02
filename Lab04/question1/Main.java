import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Person obj =new Person("tarun",18,'M');
        Scanner scan = new Scanner(System.in);
        System.out.print(obj.toString());
        scan.close();
    }
}
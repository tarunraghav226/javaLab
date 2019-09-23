import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Mail obj =new Mail(scan.next(),scan.next(),scan.next());
        System.out.println(obj.toString());
        scan.close();
    }
}
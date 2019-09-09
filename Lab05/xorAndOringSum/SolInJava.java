import java.util.Scanner;

class SolInJava{
    public static void main(String [] args){
        int a,b;
        Scanner scan = new Scanner(System.in);
        a=scan.nextInt();
        b=scan.nextInt();
        if((a^b)==(a|b))
            System.out.println("True");
        else    
            System.out.println("False");
        scan.close();
    }
}
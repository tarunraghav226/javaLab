import java.util.Scanner;

public class question1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userName = scan.nextLine().trim();
        System.out.println("Welcome ,"+userName+"!");
        scan.close();
    }
}
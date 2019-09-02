import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        String name;
        char gender;
        int age;

        Scanner scan = new Scanner(System.in);
        name=scan.nextLine();
        age=scan.nextInt();
        gender=scan.next().charAt(0);
        
        Person obj =new Person(name,age,gender);
        System.out.print(obj.toString());
        scan.close();
    }
}
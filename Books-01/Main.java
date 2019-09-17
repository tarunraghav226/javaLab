import java.io.*;
import java.util.*;

//definition class
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Solution.noOfBooks=scan.nextInt();
        scan.nextLine().trim();
        Solution[] book=new Solution[Solution.noOfBooks];
        
        for(int i=0;i<Solution.noOfBooks;i++){
            String bName=scan.nextLine();
            String aName=scan.nextLine();
            String isbn=scan.nextLine();
            book[i]=new Solution(bName,aName,isbn);        
}
        
        for(int i=0;i<Solution.noOfBooks;i++){
            System.out.println(book[i].toString());
        }

        scan.close();
    }
}
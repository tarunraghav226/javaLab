

public class Mail{
    private String name;
    private String company;
    private String age;
    Mail(String n,String a,String c){
        name = n;
        company = c;
        age = a;
    }

    public String toString(){
        return String.format("%10s_%2s@%s.com",name.toLowerCase(),age,company);
    }
}
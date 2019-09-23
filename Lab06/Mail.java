

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
        return name.toLowerCase()+"_"+age+"@"+company+".com";
    }
}
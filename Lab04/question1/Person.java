import java.util.Scanner;

public class Person{

    private String name;
    private int age;
    private char gender;

    //methods of Person class 

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public char getGender(){
        return gender;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public void setGender(char gender){
        this.gender=gender;
    }

    public Person(String name,int age,char gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    @Override
    public String toString(){
        StringBuilder str = new StringBuilder(); 
        str.append("Myself "+getName()+". I am "+getAge()+" years old . I am a");
        if (gender=='m')
            str.append(" Male");
        else 
            str.append(" Female");
        return str.toString();
    }
}
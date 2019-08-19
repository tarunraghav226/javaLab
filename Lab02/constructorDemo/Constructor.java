public class Constructor{
    private int number;
    private String name;
    Constructor(int number,String name){
        this.number=number;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
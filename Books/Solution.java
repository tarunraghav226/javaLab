//execution class
class Solution {
    
    //class variable
    static int noOfBooks;
    
    //instance variable
    private String bookName;
    private String authorName;
    private String ISBN;
    
    //Constructor
    Solution(String bName,String aName,String ISBN){
        bookName=bName;
        authorName=aName;
        this.ISBN=ISBN;
    }

    //getters
    public String getAuthorName(){
        return authorName;
    }

    public String getBookName(){
        return bookName;
    }

    public String getISBN(){
        return ISBN;
    }

    //overriding toString method
    @Override
    public String toString(){
        return "-----------------------------"+"\n"+
               "Book Name:    "+getBookName()+"\n"+
               "Author Name:    "+getAuthorName()+"\n"+
               "ISBN:    "+getISBN()+"\n"+ 
               "-----------------------------"+"\n";
    }
}


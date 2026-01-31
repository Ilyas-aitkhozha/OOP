package practice2;

public class Book {
    private String title;
    private String author;
    private Double price;
    static int count = 0;

    public Book(String title, String author, Double price){
        this.title = title;
        this.author = author;
        this.price = price;
        count++;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public Double getPrice(){
        return price;
    }
    public Double setDiscount(double num){
        price = price - (price*num/100);
        return price;}
    public String getFullInfo(){
        return "Book: "+title+", Author:"+author+"\nPrice:"+price;
    }
}


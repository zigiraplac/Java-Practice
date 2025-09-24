public class Book {


    private String title;
    private String author;
    private String isbn;
    private boolean isBorrowed;


    public Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        isBorrowed= false;
    }

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getIsbn(){
        return isbn;
    }
    public boolean isBorrowed(){
        return isBorrowed;
    }


    public void setTitle(String title){
        this.title=title;
    }

    public void setAuthor(String author){
        this.author=author;
    }

    public void setIsbn(String isbn){
        this.isbn=isbn;
    }

    public void borrowBook(){
       isBorrowed=true;

    }

    public void returnBook(){
        isBorrowed=false;
    }

    @Override
    public String toString(){
        return "Title: " + this.title + ", Author: " + this.author + ", ISBN: " + this.isbn + ", Borrowed: " + this.isBorrowed;
    }
}

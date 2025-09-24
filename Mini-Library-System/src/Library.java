import java.util.ArrayList;
public class Library {
    private ArrayList<Book> books;

    public Library(){
        books= new ArrayList<Book>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public Book findBook(String isbn){
        for(Book book:books){
            String match = book.getIsbn();
            if(match.equals(isbn)){
                return book;
            }
        }
        return null;
    }

    public boolean borrowBook(String isbn){
        Book book= findBook(isbn);
         book.borrowBook();
         return book.isBorrowed();
    }
    public boolean returnBook(String isbn){
        Book book = findBook(isbn);
        book.returnBook();
        return book.isBorrowed();
    }

    public void listBooks(){
            for(Book book: books){
                System.out.println(book);
            }
    }
}

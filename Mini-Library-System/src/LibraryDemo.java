public class LibraryDemo {
    public static void main(String[] args){
        Library Lib1= new Library();

        Book book1= new Book("Atomic Habits","James Clear", "ISBN111");
        Book book2= new Book("Do it Today","Klassen Jay", "ISBN122");
        Book book3= new Book("Never Surrender","LTG William G. BOYKIN", "ISBN133");
        Lib1.addBook(book1);
        Lib1.addBook(book2);
        Lib1.addBook(book3);

        if(Lib1.borrowBook(book1.getIsbn())){
            System.out.println("Book borrowed successfully: " + book1.getIsbn());
        }else{
            System.out.println("Failed To Borrow !!");
        }
        System.out.println("Library Books: ");
        Lib1.listBooks();

//        I'm expecting to have it as false that's why (!)
        if(!Lib1.returnBook(book1.getIsbn())){
            System.out.println("Book returned successfully: " + book1.getIsbn());
        }else{
            System.out.println("Failed To return !!");
        }

        System.out.println("Library Books: ");
        Lib1.listBooks();
    }
}

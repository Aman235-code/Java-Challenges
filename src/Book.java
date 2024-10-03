package src;

class Book {
    static int totalNoOfBooks;

    String author;
    String  title;
    String ISBN;
    boolean isBorrowed;

    static {
        totalNoOfBooks = 0;
    }

    {
        totalNoOfBooks++;
    }

    Book(String author, String title, String ISBN){
        this.author = author;
        this.title = title;
        this.ISBN = ISBN;
    }

    Book(String ISBN){
        this("Unknown","Unknown",ISBN);
    }

    static  int getTotalNoOfBooks(){
        return totalNoOfBooks;
    }

    void borrowBook(){
        if(isBorrowed){
            System.out.println("Book is already borrowed");
        }
        else {
            this.isBorrowed = true;
            System.out.println("Enjoy " + this.title);
        }
    }

    void returnBook(){
        if(isBorrowed){
            this.isBorrowed = false;
            System.out.println("Please leave a review");
        }
        else{
            System.out.println("This book is already in library");
        }
    }

    public static void main(String[] args) {
        Book designOfThings = new Book("Design","Author","1");
        Book myBook = new Book("2");
        System.out.println(Book.getTotalNoOfBooks());
        designOfThings.borrowBook();
        myBook.borrowBook();
        designOfThings.borrowBook();
        designOfThings.returnBook();
        designOfThings.returnBook();
    }
}

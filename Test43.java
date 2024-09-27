class Test43 {
    public static void main(String[] args) {
        
        Library library = new Library();

        
        Book book1 = new Book("maths", "chandika", 1949);
        Book book2 = new Book("chemistry", "sameera", 1960);
        Book book3 = new Book("physics", "jayakodi", 1925);

        
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        
        library.displayBooks();

        
        library.borrowBook("maths");

        
        library.borrowBook("buddhist");

        
        library.displayBooks();
    }
}

class Book {
    String title;
    String author;
    int yearOfPublication;

    
    public Book(String title, String author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

   
    public void displayDetails() {
        System.out.println("Book Title: " + title + ", Author: " + author + ", Year of Publication: " + yearOfPublication);
    }
}

class Library {
    
    Book[] booksArray = new Book[5];
    int bookCount = 0; 

    
    public void addBook(Book book) {
        if (bookCount < booksArray.length) {
            booksArray[bookCount] = book;
            bookCount++;
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    
    public void displayBooks() {
        System.out.print("Books currently in the library:");
        for (int i = 0; i < booksArray.length; i++) {
            if (booksArray[i] != null) {
                booksArray[i].displayDetails();
            }
        }
    }

   
    public void borrowBook(String title) {
        for (int i = 0; i < booksArray.length; i++) {
            if (booksArray[i] != null && booksArray[i].title.equalsIgnoreCase(title)) {
                System.out.println("Book borrowed: " + booksArray[i].title);
                booksArray[i] = null; 
                return;
            }
        }
        System.out.println("Book not available: " + title);
    }
}

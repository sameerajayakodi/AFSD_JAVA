public class LibraryManager {
    private Book[] books = new Book[100];
    private int bookCount = 0;

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
            System.out.println(book.getTitle() + "added to the list");
        }else {
            System.out.println("Library is full");
        }
    }

    public void updateBook(int id, String title, String author, int year) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getId() == id) {
                books[i].setTitle(title);
                books[i].setAuthor(author);
                books[i].setYear(year);
                System.out.println("Book updated!");
            }else{
                System.out.println("Book not found");
            }
        }
    }

    public void removeBook(int id) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getId() == id) {
                books[i] = null;
                bookCount--;
                System.out.println("Book removed!");
            }
        }
    }
    public void displayAllBooks() {
        for (int i = 0; i < bookCount; i++) {
            if (bookCount > 0) {
                System.out.println(books[i].getTitle() + " " + books[i].getAuthor() + " " + books[i].getYear());
            }else{
                System.out.println("Books not found");
            }
        }
    }
    public void searchBooksByAuthor(String author) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getAuthor().equals(author)) {
                System.out.println(books[i].getTitle() + " " + books[i].getAuthor() + " " + books[i].getYear());

            }else {
                System.out.println("Book not found");
            }
        }
    }




}

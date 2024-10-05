import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isLogged = false;
        int bookId ;
        String title ;
        String author ;
        int year;
        System.out.println("Welcome to the Library Management System");
        String username = "admin";
        String password = "admin";



        for (int i = 0; i < 4; i++) {
            System.out.print("Enter your username: ");
            String input = sc.nextLine();
            System.out.print("Enter your password: ");
            String input2 = sc.nextLine();

            if (input.equals(username) && input2.equals(password)) {
                System.out.println("Login successful!");
                isLogged = true;
                break;
            }
            System.out.println("Invalid username or password, try again!");
        }

        if (!isLogged) {
            System.out.println("Exit application...");
            return;
        }


        LibraryManager libraryManager = new LibraryManager();

        while (true) {

            System.out.println("-----Choose an option-----");
            System.out.println("1. Add Book");
            System.out.println("2. Update Book");
            System.out.println("3. Remove Book");
            System.out.println("4. Display All Books");
            System.out.println("5. Search Books by Author");
            System.out.println("6. Exit");

            System.out.print("Enter your option: ");
            int option = sc.nextInt(6);


            switch (option) {
                case 1:

                    System.out.print("Enter the book Id: ");
                    bookId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter the title: ");
                    title = sc.nextLine();
                    System.out.print("Enter the author: ");
                    author = sc.nextLine();
                    System.out.print("Enter the year: ");
                    year = sc.nextInt();
                    sc.nextLine();

                    Book book = new Book(bookId, title, author, year);
                    libraryManager.addBook(book);
                    break;

                case 2:
                    System.out.print("Enter the book Id: ");
                    bookId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter the new title: ");
                    title = sc.nextLine();
                    System.out.print("Enter the new author: ");
                    author = sc.nextLine();
                    System.out.print("Enter the new year: ");
                    year = sc.nextInt();
                    sc.nextLine();
                    libraryManager.updateBook(bookId, title, author, year);
                    break;

                case 3:
                    System.out.print("Enter the book Id to remove: ");
                    bookId = sc.nextInt();
                    sc.nextLine();
                    libraryManager.removeBook(bookId);
                    break;

                case 4:
                    libraryManager.displayAllBooks();
                    break;

                case 5:
                    System.out.print("Enter the book author to search by author: ");
                    sc.nextLine();
                    author = sc.nextLine();

                    libraryManager.searchBooksByAuthor(author);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }
        }
    }
}
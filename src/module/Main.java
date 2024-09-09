package module;
import module.Books;
import module.Booksorder;
import module.Customer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Genre g1 = new Genre("Fiction");
        Genre g2 = new Genre("Biography");
        Genre g3 = new Genre("Science Fiction");
        Genre g4 = new Genre("Drama");
        Genre g5 = new Genre("History");
        Genre g6 = new Genre("Self motivation");

        Books book1 = new Books("To Kill a Mockingbird", "Harper Lee", g1, 650.3F);
        Books book2 = new Books("The Diary of a Young Girl ", "Anne Frank", g2, 559.78F);
        Books book3 = new Books("Hamlet ", "William Shakespeare.", g4, 1000.01F);
        Books book4 = new Books("Dune", "Frank Herbert", g3, 234.44F);

        List<Books> onSale = new ArrayList<>();
        onSale.add(book1);
        onSale.add(book2);
        onSale.add(book3);

        List<Booksorder> bookOrderList = new ArrayList<>();

        System.out.println("Do you want to order any books? reply with true or false");
        boolean b = scanner.nextBoolean();
        scanner.nextLine();

        Customer customer = null;
        if (b) {
            System.out.println("Please enter your details:");
            System.out.print("Name: ");
            String customerName = scanner.nextLine();
            System.out.print("ID: ");
            int customerID = scanner.nextInt();
            System.out.print("Email: ");
            scanner.nextLine();
            String customerEmail = scanner.nextLine();

            customer = new Customer(customerName, customerID, customerEmail);

            System.out.println("Books on sale are: ");

            for (int i = 0; i < onSale.size(); i++) {
                Books book = onSale.get(i);
                System.out.println("No " + (i + 1) + " " + book.getBook_name());
            }

            System.out.println("To get details press 1 else press 2");
            int i = scanner.nextInt();
            System.out.println("Press Enter to continue...");
            scanner.nextLine();
            if (i == 1) {
                book1.getBookDetails();
                System.out.println();
                book2.getBookDetails();
                System.out.println();
                book3.getBookDetails();
                System.out.println();
            }

            boolean ordering = true;
            while (ordering) {
                System.out.println("Which book do you want to order? Press its number");
                int whichBook = scanner.nextInt();
                System.out.println("Press Enter to continue...");
                scanner.nextLine();
                System.out.println("How many do you want to order?");
                int howMany = scanner.nextInt();
                System.out.println("Press Enter to continue...");
                scanner.nextLine();

                if (whichBook == 1) {
                    bookOrderList.add(new Booksorder(book1.getBook_name(), book1.getAuthor(), book1.getPrice(), howMany));
                } else if (whichBook == 2) {
                    bookOrderList.add(new Booksorder(book2.getBook_name(), book2.getAuthor(), book2.getPrice(), howMany));
                } else if (whichBook == 3) {
                    bookOrderList.add(new Booksorder(book3.getBook_name(), book3.getAuthor(), book3.getPrice(), howMany));
                } else {
                    System.out.println("Enter a valid book number");
                }

                System.out.println("Do you want other books? True or False");
                String otherBookStr = scanner.nextLine();
                boolean otherBook = Boolean.parseBoolean(otherBookStr);
                if (!otherBook) {
                    ordering = false;
                }
            }

            Order order = new Order(bookOrderList, 1);
            System.out.println("Customer Name: " + customer.getName());
            System.out.println("Customer ID: " + customer.getCustomerID());
            System.out.println("Customer Email: " + customer.getEmail());
            System.out.println("Total amount: " + order.calculateTotalAmount());
        } else {

        }
    }
}
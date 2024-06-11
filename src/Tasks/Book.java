package Tasks;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Название: " + title + ", Автор: " + author + ", ISBN: " + isbn;
    }
}

class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Книга добавлена: " + book);
    }

    public void removeBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                books.remove(book);
                System.out.println("Книга удалена: " + book);
                return;
            }
        }
        System.out.println("Книга с ISBN " + isbn + " не найдена.");
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("Библиотека пуста.");
        } else {
            System.out.println("Книги в библиотеке:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Война и мир", "Лев Толстой", "12345");
        Book book2 = new Book("Преступление и наказание", "Федор Достоевский", "54321");

        library.addBook(book1);
        library.addBook(book2);
        System.out.println("");
        library.displayBooks();

        library.removeBook("12345");
        System.out.println("");
        library.displayBooks();
    }
}

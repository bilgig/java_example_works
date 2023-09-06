package streams.book_name_query;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class BookMain {
    public static void main(String[] args) {
        List<Book> books=new ArrayList<>();
        books.add(new Book("Suç ve Ceza","Fyodor Dostoyevski"));
        books.add(new Book("Sefiller","Victo Hugo"));
        books.add(new Book("Kürk Mantolu Madonna","Sabahattin Ali"));
        books.add(new Book("Çalıkuşu","Reşat Nuri Güntekin"));
        String author="Fyodor Dostoyevski";
        books.stream()
                .filter(book->book.getAuthor().equals(author))
                .map(book->book.getTitle())
                .forEach(System.out::println);

    }

}

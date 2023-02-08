package colecoes.java;

import colecoes.java.model.Book;

import java.util.List;

public class ArrayListExample20 {
    public static void main(String[] args) {
        //Creating list of Books
        List<Book> list = List.of(new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8), new Book(102, "Data Communications and Networking", "Forouzan", "Mc Graw Hill", 4), new Book(103, "Operating System", "Galvin", "Wiley", 6));

        for (Book b : list) {
            System.out.println(b.getId() + " " + b.getName() + " " + b.getQuantity() + " " + b.getPublisher() + " " + b.getAuthor());
        }
    }
 }

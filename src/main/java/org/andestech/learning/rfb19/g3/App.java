package org.andestech.learning.rfb19.g3;

import java.util.Collections;
import java.util.Comparator;

public class App 
{
    public static void main(String[] args )
    {

        Book book1 =
                new Book(1891,"GG-8676","Лев Толстой","Хуань");

        Book book2 =
                new Book(1872,"GT-8464876","Лев Толстой","Го КаЭс");

        Book book3 =
                new Book(1869,"GG-864876","Лев Толстой","Война и Мир");

        Book book4 =
                new Book(1889,"GT-823464876","Лев Толстой","Крейцерова соната");

        Book book5 =
                new Book(1819,"GDR-6","Лев Толстой","Абраша и Моисей");

        Book book6 =
                new Book(1859,"ыВААавты-6","Басютин","Мармышки");

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);

        //System.out.println(library.getBookList().get(0).getTitle());

        Collections.sort( library.getBookList(), new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });

        for (int i=0; i < library.getBookList().size(); i++){
            System.out.println(library.getBookList().get(i).getTitle());
        }

    }
}

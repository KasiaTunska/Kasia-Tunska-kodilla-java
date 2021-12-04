//String LastElementKey;
  //      LastElementKey= String.valueOf(j);

import java.util.*;
import java.lang.*;


class Book {

    private String author;
    private String title;

    public Book (String author, String title) {
        this.author= author;
        this.title=title;
    }
    public String getAuthor() {
        return this.author;
    }

    public String getTitle() {
        return this.title;
    }


    @Override
    public boolean equals(Object o) {
        final Book e = (Book) o;
        return this.author.equals(e.getAuthor()) && this.title.equals(e.getTitle());
    }


    @Override
    public String toString() {
        return author + "\"" + title + "\"";
    }

    @Override
    public int hashCode() {
        return author.hashCode() + title.hashCode();
    }
}

class LinkedListAndHashMap {

    public static void main (String[] args)  {

        LinkedList<Book> bookList = new LinkedList<>();
        for(int i =0; i < 800000; i++) {
            bookList.add(new Book("author" + i, "title" + i));
        }


        int i = bookList.size();


        System.out.println("The Booklist contains " + bookList.size() + " books.");

        long begin = System.nanoTime();
        bookList.remove(bookList.size() -1);
        long end = System.nanoTime();

        System.out.println("Removing element from the end takes: " + (end - begin) + " ns.");

        begin = System.nanoTime();
        bookList.remove(0);
        end = System.nanoTime();

        System.out.println("Removing element from the beginning takes: " + (end - begin) + " ns.");


        begin = System.nanoTime();
        bookList.add(new Book("author" + i, "title" + i));
        end = System.nanoTime();

        System.out.println("Adding element at the end takes: " + (end - begin) + " ns.");

        begin = System.nanoTime();
        bookList.add(0, new Book("author" + i, "title" + i));
        end = System.nanoTime();

        System.out.println("Adding element at the beginning takes: " + (end - begin) + " ns.");


        System.out.println("  --------------------------------------------------------------  ");

        HashMap<String, Book> bookHashMap = new HashMap<>();
        String Key;

        for(int j = 0; j < 800000; j++) {
            bookHashMap.put("abc"+ j, new Book("author" + i, "title" + i));
            if(j==800000 -1)
        }


        System.out.println("The bookHashMap contains " + bookHashMap.size() + " books.");

    begin = System.nanoTime();
        bookHashMap.remove(key:"abc799999");               //String.valueOf
    end = System.nanoTime();

        System.out.println("Removing element from the end takes: " + (end - begin) + " ns.");

    begin = System.nanoTime();
        bookHashMap.remove(key:"abc0");
    end = System.nanoTime();

        System.out.println("Removing element from the beginning takes: " + (end - begin) + " ns.");

    int j = bookHashMap.size();
    begin = System.nanoTime();
        bookHashMap.put(key:"abc800000");
    end = System.nanoTime();

        System.out.println("Adding element at the end takes: " + (end - begin) + " ns.");

    begin = System.nanoTime();
        bookHashMap.put(key:"abc");
    end = System.nanoTime();

        System.out.println("Adding element at the beginning takes: " + (end - begin) + " ns.");

 }
}


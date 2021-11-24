package com.company;


public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("Neuromancer", "William Gibson", 1984, 271, EState.normal, ECover.paper);

        Book book2 = new Book("Artemis Fowl", "Ion Colfer", 2001, 280, EState.brandNew, ECover.glossy);
        // создание обьектов типа book
        Library library = new Library();
        library.addBook(book1);
        System.out.println(library);
        library.addBook(book2);
        System.out.println();
        System.out.println(library);
        library.changeState(library.getIndexOf(book1), EState.old);
        System.out.println();
        System.out.println(library);
        System.out.println();
        System.out.println(library.search("owl"));
        System.out.println();
        System.out.println(library.search("bson"));
        System.out.println();
        System.out.println(library.search(2001));
        System.out.println();
        library.removeBook(0);
        System.out.println(library);
        // продемострированна работа с библиотекой

    }
}


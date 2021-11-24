package com.company;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> library = new ArrayList<>();


    public Library(List<Book> library) {
        this.library = library;
    }

    public Library() {
    }

    /**
     * функция для получения индекса обьекта
     * @param book ссылка на обьект
     * @return индекс
     */
    public int getIndexOf(Book book) {
        int result = library.indexOf(book);
        return result;
    }

    /**
     * фунцкия  для добавления книги
     * @param book книга для добавления
     */
    public void addBook(Book book) {
        library.add(book);

    }

    /**
     * функция для удаления книги по индексу
     * @param index индекс книги
     */
    public void removeBook(int index) {
        library.remove(index);
    }

    /**
     * функция для изменения состояния книги
     * @param index индекс книги
     * @param state новый статус
     */
    public void changeState(int index, EState state) {
        library.get(index).setState(state);
    }

    /**
     * функция поиска по библиотеке
     * @param parameter параметр поиска
     * @return результаты поиска
     */
    public String search(String parameter) {


        for (int i = 0; i < this.library.size(); i++) {
            List<Book> temp = new ArrayList<>();
            if (library.get(i).getName().toLowerCase().contains(parameter.strip().toLowerCase()) || library.get(i).getAuthor().contains(parameter.strip())) {
                temp.add(library.get(i));
                return library.indexOf(library.get(i)) + temp.toString();
            }
        }
        return "Book not found";

    }

    /**
     * та же функция поиска только для численых параметров
     * @param parameter параметр поиска
     * @return резульаты поиска
     */
    public String search(int parameter){
        List<Book> temp = new ArrayList<>();
        for (int i = 0; i <library.size() ; i++) {
            if (library.get(i).getYear()==parameter){
                temp.add(library.get(i));
                return library.indexOf(library.get(i)) + temp.toString();
            }
        }
    return "Book not found";
    }
    @Override
    public String toString() {
        return "Library{" +
                "library=" + library +
                '}';
    }
}
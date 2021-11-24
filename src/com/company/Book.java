package com.company;


public class Book {
    private String name;
    private String author;
    private int year;
    private int pages;
    private EState state;
    private ECover cover;

    public Book(String name, String author, int year, int pages, EState state, ECover cover) {
        this.setName(name);
        this.setAuthor(author);
        this.setYear(year);
        this.setPages(pages);
        this.setState(state);
        this.setCover(cover);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.strip();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author.strip();
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year > 0 ? year : -1;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages > 0 ? pages : -1;
    }

    public EState getState() {
        return this.state;
    }

    public void setState(EState state) {
        this.state = state;
    }

    public ECover getCover() {
        return this.cover;
    }

    public void setCover(ECover covers) {
        this.cover = covers;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", pages=" + pages +
                ", state=" + state +
                ", cover=" + cover +
                '}' + '\n';
    }
}

package ru.mirea.task2.entity;

public class Book {

    public String name;
    public String author;
    public int prise;

    public Book(String name, String author, int prise) {
        this.name = name;
        this.author = author;
        this.prise = prise;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    @Override
    public String toString() {
        return "Book with name '" + name +
                ", author " + author +
                ", prise '" + prise;
    }
}

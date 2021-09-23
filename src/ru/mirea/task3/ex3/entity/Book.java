package ru.mirea.task3.ex3.entity;

public class Book {
    public Author author;
    public String title;
    public int yearOfWriting;

    public Book(Author author, String title, int yearOfWriting) {
        this.author = author;
        this.title = title;
        this.yearOfWriting = yearOfWriting;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfWriting() {
        return yearOfWriting;
    }

    public void setYearOfWriting(int yearOfWriting) {
        this.yearOfWriting = yearOfWriting;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", title='" + title + '\'' +
                ", yearOfWriting=" + yearOfWriting +
                '}';
    }
}

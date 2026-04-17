package org.example;

public class Book {
    private int id;
    private String title;
    private String isbn;
    private boolean isCheckedOut;
    private String checkedOutTo;

    public Book(int id, String isbn, String title) {
        this.id = id;
        this.title = title;
        this.isbn = isbn;
        this.isCheckedOut = false;
        this.checkedOutTo = "";

}
    public void checkOut(String name) {
        isCheckedOut = true;
        checkedOutTo = name;
    }

    public void checkIn() {
        isCheckedOut = false;
        checkedOutTo = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }


    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    @Override
    public String toString() {
        return " ID: " + id + " isbn: " + isbn + " title " + title;


    }

}



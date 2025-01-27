package com.library_management_system;

// Abstract class representing a library item
abstract class LibraryItem {
    protected String itemId;
    protected String title;
    protected String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Abstract method to be implemented by subclasses
    public abstract int getLoanDuration();

    // Concrete method to display item details
    public void getItemDetails() {
        System.out.println("ID: " + itemId + ", Title: " + title + ", Author: " + author);
    }
}

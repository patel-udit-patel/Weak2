package com.library_management_system;

// Main class to test the Library Management System
public class LibraryManagement {
    public static void main(String[] args) {
        LibraryItem book = new Book("B101", "Java Programming", "James Gosling");
        LibraryItem magazine = new Magazine("M201", "Tech Today", "John Doe");
        LibraryItem dvd = new DVD("D301", "Inception", "Christopher Nolan");

        book.getItemDetails();
        System.out.println("Loan Duration: " + book.getLoanDuration() + " days\n");

        magazine.getItemDetails();
        System.out.println("Loan Duration: " + magazine.getLoanDuration() + " days\n");

        dvd.getItemDetails();
        System.out.println("Loan Duration: " + dvd.getLoanDuration() + " days\n");

        // Demonstrating reserving items
        Reservable reservableBook = new Book("B102", "Python Basics", "Guido van Rossum");
        reservableBook.reserveItem();
        System.out.println("Is book available? " + reservableBook.checkAvailability() + "\n");

        Reservable reservableDVD = new DVD("D302", "Avatar", "James Cameron");
        reservableDVD.reserveItem();
        System.out.println("Is DVD available? " + reservableDVD.checkAvailability());
    }
}

package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book[] availableBooks = {
                new Book(1, "9781250301697", "The Silent Patient"),
                new Book(2, "9780441013593", "Dune"),
                new Book(3, "9780547928227", "The Hobbit"),
                new Book(4, "9781451673319", "Fahrenheit 451"),
                new Book(5, "9780061122415", "The Alchemist"),
                new Book(6, "9780804139021", "The Martian"),
                new Book(7, "9781501142970", "It"),
                new Book(8, "9780486411095", "Dracula"),
                new Book(9, "9780375842207", "The Book Thief"),
                new Book(10, "9780307387899", "The Road"),
                new Book(11, "9780156027328", "Life of Pi"),
                new Book(12, "9780385737951", "The Maze Runner"),
                new Book(13, "9780812550702", "Ender's Game"),
                new Book(14, "9780307588371", "Gone Girl"),
                new Book(15, "9781508475319", "Sherlock Holmes"),
                new Book(16, "9780307743657", "The Shining"),
                new Book(17, "9780786838653", "Percy Jackson: The Lightning Thief"),
                new Book(18, "9780544336261", "The Giver"),
                new Book(19, "9780553593716", "A Game of Thrones"),
                new Book(20, "9780066238500", "The Chronicles of Narnia")
        };
        while (true) {

            System.out.println("\n=== BOOK STORE HOME SCREEN ===");
            System.out.println("1. Show Available Books");
            System.out.println("2. Show Checked Out Books");
            System.out.println("3. Check in a book");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.println("Available books");
                for (int i = 0; i < availableBooks.length; i++) {
                    if (availableBooks[i].isCheckedOut() == false) {
                        System.out.println(availableBooks[i]);
                    }
                }
                System.out.println("write the id of the book you want ");
                int id = scanner.nextInt();
                scanner.nextLine();

                System.out.println("What is your name? ");
                String name = scanner.nextLine();

                for (int i = 0; i < availableBooks.length; i++) {

                    if (availableBooks[i].getId() == id) {
                        if (availableBooks[i].isCheckedOut() == false) {
                            availableBooks[i].checkOut(name);
                            System.out.println("you checked out a book");
                        }

                    }

                }


            }
            if (choice == 2) {
                System.out.println("Checked out books");
                for (int i = 0; i < availableBooks.length; i++) {
                    if (availableBooks[i].isCheckedOut() == true) {
                        System.out.println(
                                "id: " + availableBooks[i].getId() +
                                        "  isbn: " + availableBooks[i].getIsbn() + " title " + availableBooks[i].getTitle() +
                                        "  Checked out to " +
                                        availableBooks[i].getCheckedOutTo());
                    }
                }
            }

            if (choice == 3){
                System.out.println("Check in a book");
                System.out.println("What is the ID of the book you want to chek in");
                int id = scanner.nextInt();
                scanner.nextLine();
                for (int i = 0; i < availableBooks.length; i++){

                    if (availableBooks[i].getId() == id){
                        if (availableBooks[i].isCheckedOut() == true){
                            availableBooks[i].checkIn();
                            System.out.println("Book checked in");
                        }

                    }
                }
            }


        }




    }
}

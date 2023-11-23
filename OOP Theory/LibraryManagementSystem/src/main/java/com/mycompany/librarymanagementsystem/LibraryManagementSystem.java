
package com.mycompany.librarymanagementsystem;


public class LibraryManagementSystem {

    public static void main(String[] args) {
        //obj of Library
        Library myLibrary = new Library("CT Library","Gulshan-e-Iqbal block 6");

        //three obj of books
        Book book1 =  new Book("It ends with us ","Collen Hoover","13387","Romance");
        Book book2 = new Book("Fundamentals of Physics","Halliday Resnick","97349","Science");
        Book book3 = new Book("Diary of a Wimpy Kid","Jeff Kinney","29390","young adult fiction");
        
       //four objs of librarians
       Librarian librarian1 = new Librarian("Aimen", 1400321);
       Librarian librarian2 = new Librarian("Muskan", 1400320);
       Librarian librarian3 = new Librarian("Huzaifa", 1200319);
       Librarian librarian4 = new Librarian("Raza", 1400318);
       
       //two objs of members
       Member member1 = new Member("Hasan", 134571);
       Member member2 = new Member("Ali", 133574);
       
       //assigning books
       myLibrary.addBook(book1);
       myLibrary.addBook(book2);
       myLibrary.addBook(book3);

       //assigning Libraries
       myLibrary.addLibrarian(librarian1);
       myLibrary.addLibrarian(librarian2);
       myLibrary.addLibrarian(librarian3);
       myLibrary.addLibrarian(librarian4);

       //printing books and librarians
       myLibrary.displayBooks();
       myLibrary.displayLibrarians();
       
       //borrowed books
       member1.borrowedBooks(book1);
       member2.borrowedBooks(book3);
    }
}

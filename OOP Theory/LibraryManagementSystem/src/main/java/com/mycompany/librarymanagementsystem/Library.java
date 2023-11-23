
package com.mycompany.librarymanagementsystem;

import java.util.ArrayList;

public class Library{
    //attributes
    private String name,address;
    private ArrayList<Book> listOfBooks = new ArrayList<Book>();
    private ArrayList<Librarian> listOfLibrarians = new ArrayList<Librarian>();
    
    //Constructor
    public Library() {
    }

    public Library(String name, String address) {
        this.name = name;
        this.address = address;
    }
    
    //getters

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
    //setters

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    //methods
    public void addBook(Book book){
        listOfBooks.add(book);
    }
    public void removeBook(Book book){
        listOfBooks.remove(book);
    }
    public void addLibrarian(Librarian librarian){
        listOfLibrarians.add(librarian);
    }
    public void removeLibrarian(Librarian librarian){
        listOfLibrarians.remove(librarian);
    }
    public void displayLibrarians(){
        System.out.println("======== Librarians ========");
        for(int i=0;i<listOfLibrarians.size();i++){
            System.out.println("* Librarian : "+(i+1)+"\n"
                    + "Librarian name : "+listOfLibrarians.get(i).getName()+"\n"
                    + "Librarian Id : "+listOfLibrarians.get(i).getEmployeeId());            
        }
    }
    public void displayBooks(){
        System.out.println("======== Books ========");
        for(int i = 0;i<listOfBooks.size();i++){
            System.out.println("* Book "+(i+1)+"\n Book title : "+listOfBooks.get(i).getTitle()+
                    "\n Book author : "+listOfBooks.get(i).getAuthor()+"\n"
                     + "Book ISBN : "+listOfBooks.get(i).getIsbn()+"\n"
                    +"Book Genre : "+listOfBooks.get(i).getGenre());
        }
    }
}



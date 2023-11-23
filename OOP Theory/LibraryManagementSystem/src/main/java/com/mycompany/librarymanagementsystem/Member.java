
package com.mycompany.librarymanagementsystem;


public class Member{
    private String name;
    private int memberId;
    //Constructor

    public Member() {
    }

    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }
    //getters

    public String getName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }
    //setters

    public void setName(String name) {
        this.name = name;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }
    //methods
    public void borrowedBooks(Book book){
        System.out.println("======== Borrowed Book ========+ \n Book title : "+book.getTitle()+
                    "\n Book author : "+book.getAuthor()+"\n"
                     + "Book ISBN : "+book.getIsbn()+"\n"
                    +"Book Genre : "+book.getGenre());
    }
}

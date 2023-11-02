
package com.mycompany.mavenproject2;

class Book{
    private String title, author;
    private double price;
    
    //setters
    public void setTitle(String title){
        this.title = title;
    } 
    public void setAuthor(String author){
        this.author = author;
    }
    public void setPrice(double price){
        this.price = price;
    }
    
    //getters
    public String getTitle(){
        return title;
    }
        public String getAuthor(){
        return author;
    }
            public double getPrice(){
        return price;
    }
            //constructor
            Book(){
                title = "Developing Java Software";
                author = "Russel Winderand";
                price = 79.75;
            }
            
    @Override
            public String toString(){
                return ("Name : "+title+"\n"+"Author : "+author+"\n"+"Price : "+price);
            }
}

package com.hansunping_firstStage;

public class Homework03 {
    public static void main(String[] args) {
        Book book = new Book(149.1f);
        book.updatePrice();
        System.out.println(book.price);
    }
}

class Book {
    float price;
    public Book(float price){
        this.price = price;
    }

    public void updatePrice() {
        if (this.price > 150) {
            this.price = 150.0f;
        }else if (this.price > 100){
            this.price = 100.0f;
        }
    }
}

package ru.alfabank.day11;

public class Book {
    static void main() {
        Book book = new Book("fghf", 787);
        book.setPrice(-900);
    }
    String title;
    int price;

    public Book(String title, int price) {
    }
    public void setPrice(int price) {
        if (price < 0) {
           // throw new RuntimeException("wrong  price");
            throw new BookDataExeption("WRONG PRICE");
        }
        this.price = price;
    }
}

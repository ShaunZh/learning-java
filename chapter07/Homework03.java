/*
 * @Description: 
 * @Author: Hexon
 * @Date: 2021-12-15 00:04:02
 * @LastEditors: Hexon
 * @LastEditTime: 2021-12-15 00:08:26
 */
public class Homework03 {
  public static void main(String[] args) {
    Book book = new Book(60);
    book.updatePrice(160);
    System.out.println("book price is: " + book.price);
  }

}

class Book {
  double price;

  public Book(double price) {
    this.price = price;
  }

  public void updatePrice(double price) {
    if (price > 150) {
      this.price = 150;
    } else if (price > 100) {
      this.price = 100;
    }
  }
}

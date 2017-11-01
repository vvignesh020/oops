package in.vamsoft.day5.trainning;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Book {
  int no;
  String bname;
  String author;
  double price;

  public int getNo() {
    return no;
  }

  public void setNo(int no) {
    this.no = no;
  }

  public String getBname() {
    return bname;
  }

  public void setBname(String bname) {
    this.bname = bname;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public Book(int no, String bname, String author, double price) {
    super();
    this.no = no;
    this.bname = bname;
    this.author = author;
    this.price = price;
  }

  @Override
  public String toString() {
    return "Book [no=" + no + ", bname=" + bname + ", author=" + author + ", price=" + price + "]\n";
  }
  

}

public class LambdaStart {
  public static void main(String[] args) {
    Book b1 = new Book(1, "linux", "jk", 158.20);
    Book b2 = new Book(2, "oracle", "bala", 180.50);
    Book b3 = new Book(3, "ubuntu", "leo", 258.20);
    Book b4 = new Book(4, "joker", "siva", 198.60);
    Book b5 = new Book(5, "arts", "harish", 188.70);
    List<Book> books = Arrays.asList(b1, b2, b3, b4, b5);
    Collections.sort(books, (Book obj1, Book obj2) -> {
      return obj1.getBname().compareTo(obj2.getBname());
    });

    System.out.println(books);

    Collections.sort(books, (obj1, obj2) -> obj1.getAuthor().compareTo(obj2.getAuthor()));
    System.out.println(books);
    Collections.sort(books,
        (obj1, obj2) -> ((Integer) obj2.getNo()).compareTo((Integer) obj1.getNo()));
    System.out.println(books);
  }

}

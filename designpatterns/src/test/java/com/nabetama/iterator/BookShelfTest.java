package com.nabetama.iterator;

import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BookShelfTest {

  @Test
  public void testAppendBook() {
    BookShelf bookShelf = new BookShelf(new ArrayList<>());
    bookShelf.addBook(new Book("foo"));

    Iterator<Book> it = bookShelf.iterator();
    Book book = it.next();
    Assertions.assertEquals("foo", book.getName());
  }

  @Test
  public void testAppendBookMultipleTimes() {
    BookShelf bookShelf = new BookShelf(new ArrayList<>());
    bookShelf.addBook(new Book("foo"));
    bookShelf.addBook(new Book("bar"));
    bookShelf.addBook(new Book("baz"));

    Iterator<Book> it = bookShelf.iterator();
    while (it.hasNext()) {
      Book book = it.next();
      Assertions.assertNotEquals(null, book);
      System.out.print(book);
    }
  }
}

package com.nabetama.iterator;

import java.util.List;

public class BookShelf implements Aggregate {

  private List<Book> books;

  public BookShelf(List<Book> books) {
    this.books = books;
  }

  public Book getBook(int idx) {
    return books.get(idx);
  }

  public void addBook(Book book) {
    books.add(book);
  }

  public int getLength() {
    return books.size();
  }

  @Override
  public Iterator<Book> iterator() {
    return new BookShelfIterator(this);
  }
}

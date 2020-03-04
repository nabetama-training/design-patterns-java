package com.nabetama.iterator;

public class BookShelfIterator implements Iterator<Book> {

  private BookShelf bookShelf;

  private int index;

  public BookShelfIterator(BookShelf bookShelf) {
    this.bookShelf = bookShelf;
  }

  @Override
  public boolean hasNext() {
    return index < bookShelf.getLength();
  }

  @Override
  public Book next() {
    Book book = bookShelf.getBook(index);
    index++;
    return book;
  }
}

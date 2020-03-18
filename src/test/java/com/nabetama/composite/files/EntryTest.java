package com.nabetama.composite.files;

import static org.junit.jupiter.api.Assertions.*;

import com.nabetama.builder.product.Director;
import java.util.EnumMap;
import org.junit.jupiter.api.Test;

class EntryTest {

  @Test
  void test() {
    Directory rootDir = new Directory("root");
    Directory binDir = new Directory("bin");
    Directory tmpDir = new Directory("tmp");
    Directory usrDir = new Directory("usr");

    rootDir.add(binDir);
    rootDir.add(tmpDir);
    rootDir.add(usrDir);

    binDir.add(new File("vim", 10000));
    binDir.add(new File("emacs", 20000));

    assertEquals("root", rootDir.getName());
    assertEquals(30000, rootDir.getSize());
    assertEquals("vim/File{name='vim', size=10000}emacs/File{name='emacs', size=20000}", binDir.printList());
  }

  @Test
  void fileTreatmentException() {
    File vim = new File("vim", 10000);
    File emacs = new File("emacs", 20000);

    assertThrows(FileTreatmentException.class, () -> vim.add(emacs));
  }

  @Test
  void testFile() {
    File vim = new File("vim", 10);

    assertEquals("", vim.printList());
    assertEquals("/File{name='vim', size=10}", vim.printList(""));
    assertEquals("vim", vim.getName());
  }
}
package controller;

import model.Filereader;
import view.Console;

public class App {
  
  
  public static void main(String[] args) {
    Filereader fileReader = new Filereader();
    Console console = new Console();
    Creator creator = new Creator(console, fileReader);
    creator.createEnOrDecryption();
  }
}

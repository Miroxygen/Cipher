package controller;

import model.Chiffer;
import model.Filereader;
import model.SubstitutionChiffer;
import model.TransPositionChiffer;
import view.Console;

public class Creator {
  private Console console;
  private Filereader filereader;
  private Chiffer chiffer;
  private String fileName;
  private String key;
  
  Creator(Console c, Filereader fr) {
    console = c;
    filereader = fr;
  }

  public void createEnOrDecryption() {
    console.displayStartMessage();
    view.Console.StartMessage action = console.getAction();
    fileName = console.getFileName();
    key = console.getKey();
    switch (action) {
      case Sub:
        chiffer = new SubstitutionChiffer();
        System.out.println("S");
        break;
      case Trans:
        chiffer = new TransPositionChiffer();
        System.out.println("T");
        break;
    }
    doChiffer();
  }

  public void doChiffer() {
    view.Console.EncryptOrDecypt action = console.getInput();
    switch (action) {
      case Encrypt:
        chiffer.encode();
        break;
      case Decrypt:
        chiffer.decode();
        break;
    }
  }
}

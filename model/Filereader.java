package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Filereader {
  public String textData;
  

  public void readFile(String fileName) {
    try {
      File myObj = new File("../textfile/" + fileName);
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        textData = textData + myReader.nextLine();
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("File not found.");
      e.printStackTrace();
    }
  }

  public String getFileTextAsString() {
    return textData;
  }
}

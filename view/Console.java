package view;

public class Console {
  final char sub = 'S';
  final char trans = 'T';

  public static enum StartMessage {
    Sub,
    Trans
  }

  public void displayStartMessage() {
    System.out.println("|| Welcome to this encryption app. ||");
    System.out.println("|| Press " + sub + " for creating a substituttion cipher ||");
    System.out.println("|| Press " + trans + " for creating a transposition cipher ||");
  }


  

  /**
   * Returns pressed characters from the keyboard.

   * @return the pressed character.
   */
  public int getInput() {
    try {
      int c = System.in.read();
      while (c == '\r' || c == '\n') {
        c = System.in.read();
      }
      return c;
    } catch (java.io.IOException e) {
      System.out.println("" + e);
      return 0;
    }
  }
}
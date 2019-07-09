package edu.cnm.deepdive.blackjackdemo.model;

public enum Suit {

  CLUBS,
  DIAMONDS,
  HEARTS,
  SPADES;

  public String abbreviation() {
    switch (this)  {
      case CLUBS:
        return "C";
      case DIAMONDS:
        return "D";
      case HEARTS:
        return "H";
      case SPADES:
        return "S";
    }
    return null;
  }

  public Color getColor() {
    switch (this) {
      case CLUBS:
      case SPADES:
        return Color.BLACK;
      default:
        return Color.RED;
    }
  }

  public enum Color {
    RED, BLACK
  }

}

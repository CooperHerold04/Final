import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach; 
import java.util.*;  
import java.lang.*;

public class Piece {
  public enum Color {RED, BLACK}
  public enum Type {REGULAR, KING}

  private Color color;
  private Type type;

public Piece(Color color) {
  this.color = color;
  this.type = Type.REGULAR;
}

public Color getColor() {return color;}
public Type getType() {return type;}

public void promoteToKing() {
  this.type = Type.KING;
}

public boolean isKing() {
  return this.type == Type.KING;
}

@Override

public String toString() {
  return color == Color.RED ? (isKing() ? "R" : "r") : (isKing() ? "B" : "b");
}
}

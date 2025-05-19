import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach; 
import java.util.*;  
import java.lang.*;

public class Move{
  public int startRow, startCol;
  public int endRow, endCol;

public Move(int sr, int sc, int er, int ec) {
  this.startRow = sr;
  this.startCol = sc;
  this.endRow = er;
  this.endCol = ec;

  @Override

public String toString() {
    return "(" + startRow + "," + startCol + ") -> (" + endRow + "," + endCol + ")";
  }
}

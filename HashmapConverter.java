import java.util.HashMap;

public class HashmapConverter {

  HashMap<String, String> binConvert;

  public HashmapConverter() {

    binConvert = new HashMap<String, String>();
    fillMapLowers();
    fillMapNumbers();
    fillMapSpecial();
    fillMapUppers();

  }

  public HashMap<String, String> getBinConvert() {
    return binConvert;
  }

  public void setBinConvert(HashMap<String, String> binConvert) {
    this.binConvert = binConvert;
  }

  public void fillMapLowers() {

    // binary that starts with 011 is Lowercase

    binConvert.put("a", "01100001");
    binConvert.put("b", "01100010");
    binConvert.put("c", "01100011");
    binConvert.put("d", "01100100");
    binConvert.put("e", "01100101");
    binConvert.put("f", "01100110");
    binConvert.put("g", "01100111");
    binConvert.put("h", "01101000");
    binConvert.put("i", "01101001");
    binConvert.put("j", "01101010");
    binConvert.put("k", "01101011");
    binConvert.put("l", "01101100");
    binConvert.put("m", "01101101");
    binConvert.put("n", "01101110");
    binConvert.put("o", "01101111");
    binConvert.put("p", "01110000");
    binConvert.put("q", "01110001");
    binConvert.put("r", "01110010");
    binConvert.put("s", "01110011");
    binConvert.put("t", "01110100");
    binConvert.put("u", "01110101");
    binConvert.put("v", "01110110");
    binConvert.put("w", "01110111");
    binConvert.put("x", "01111000");
    binConvert.put("y", "01111001");
    binConvert.put("z", "01111010");

  }

  public void fillMapUppers() {

    // binary that starts with 010 is uppercase (with the addition of ? and _)

    binConvert.put("A", "01000001");
    binConvert.put("B", "01000010");
    binConvert.put("C", "01000011");
    binConvert.put("D", "01000100");
    binConvert.put("E", "01000101");
    binConvert.put("F", "01000110");
    binConvert.put("G", "01000111");
    binConvert.put("H", "01001000");
    binConvert.put("I", "01001001");
    binConvert.put("J", "01001010");
    binConvert.put("K", "01001011");
    binConvert.put("L", "01001100");
    binConvert.put("M", "01001101");
    binConvert.put("N", "01001110");
    binConvert.put("O", "01001111");
    binConvert.put("P", "01010000");
    binConvert.put("Q", "01010001");
    binConvert.put("R", "01010010");
    binConvert.put("S", "01010011");
    binConvert.put("T", "01010100");
    binConvert.put("U", "01010101");
    binConvert.put("V", "01010110");
    binConvert.put("W", "01010111");
    binConvert.put("X", "01011000");
    binConvert.put("Y", "01011001");
    binConvert.put("Z", "01011010");

    binConvert.put("@", "01000000");
    binConvert.put("_", "01011111");
  }

  public void fillMapNumbers() {

    // binary starting with 001 are numbers

    binConvert.put("0", "00110000");
    binConvert.put("1", "00110001");
    binConvert.put("2", "00110010");
    binConvert.put("3", "00110011");
    binConvert.put("4", "00110100");
    binConvert.put("5", "00110101");
    binConvert.put("6", "00110110");
    binConvert.put("7", "00110111");
    binConvert.put("8", "00111000");
    binConvert.put("9", "00111001");

  }

  public void fillMapSpecial() {

    // binary starting with 001 are special characters (excluding ? and _)

    binConvert.put("!", "00100001");
    binConvert.put("\"", "00100010");
    binConvert.put("#", "00100011");
    binConvert.put("$", "00100100");
    binConvert.put("%", "00100101");
    binConvert.put("&", "00100110");
    binConvert.put("\'", "00100111");
    binConvert.put("(", "00101000");
    binConvert.put(")", "00101001");
    binConvert.put("*", "00101010");
    binConvert.put("+", "00101011");
    binConvert.put(",", "00101100");
    binConvert.put("-", "00101101");
    binConvert.put(".", "00101110");
    binConvert.put("/", "00101111");
    binConvert.put("?", "00111111");
    binConvert.put(" ", "00100000");

  }

}

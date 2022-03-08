package overriding;

public class main {
    public static void main(String[] args) {
      cicak inheritance = new cicak();
      System.out.print(inheritance.makan());
      System.out.println(inheritance.berkembangbiak());
      System.err.println();
      sapi inheritance2 = new sapi();
      System.out.print(inheritance2.makan());
      System.out.println(inheritance2.berkembangbiak());

    }
}

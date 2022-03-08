package overriding;

public class cicak extends hewan {

  public String makan(){
      System.out.println(super.makan());
    return "Cicak makan laron";
  }
  public String berkembangbiak(){
      System.out.println();
   return "Cicak berkembangbiak dengan cara bertelur";
  }  
}

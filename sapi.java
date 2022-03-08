package overriding;

public class sapi extends hewan {

   public String makan(){
       System.out.println(super.makan());
    return "Sapi makan daging";
   }
   public String berkembangbiak(){
       System.out.println(super.berkembangbiak());
    return "Sapi berkembangbiak dengan cara beranak";
   } 
}

import java.util.*;
/*Katia Bellido
24/octubre/2018
*/
public class Bisiesto{
  public static void main(String[] args) {
    //variables
    Scanner keyboard= new Scanner(System.in);
    int number=0, bisiesto=0;
    Boolean bi=null;

    //intrucciones

    System.out.println("Mete un año que creas que sea bisiesto");
    bisiesto=keyboard.nextInt();

    if ((bisiesto%4)==0) {
      bisiesto=number;
      if ((bisiesto%100)==0) {
        if ((bisiesto%400)==0) {
          bi=true;
        }
        else if ((bisiesto%400)!=0) {
          bi=false;
        }
      }
      else{
        bi=false;
      }
    }
    else {
      bi=false;
    }
    System.out.println("es año bisiesto= "+bi);
  }
}

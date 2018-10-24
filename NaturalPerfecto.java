import java.util.*;
/*Katia Bellido
24/octubre/2018
*/
public class NaturalPerfecto{
  public static void main(String[] args) {
    //variables
    Scanner keyboard= new Scanner(System.in);
    int numero=0, perfecto=0, counter=0, suma=0, q=0;


    //instrucciones
    System.out.println("Mete un número que creas que es perfecto");
    numero=keyboard.nextInt();
    perfecto=numero;
    for (counter=2; numero>1; counter++) {
      if ((perfecto%counter)==0) {
        numero=(perfecto/counter);
        suma=suma+numero;
      }//termina if
    }//termina for
    if (suma==perfecto) {
      System.out.println("Es un numero natural perfecto");
    }//termina if
    else {
      System.out.println("No es un numero natural perfecto");
    }//termina else
  }//termina main
}//termina clase

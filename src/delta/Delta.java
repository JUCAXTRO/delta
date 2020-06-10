/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delta;
import java.util.Scanner;

/**
 *
 * @author Usuário
 */
public class Delta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double delta , x1 ,x2;
      Scanner num = new Scanner(System.in);
     
      System.out.println("Digite um número");
      double a = num.nextDouble();
      System.out.println("Digite um número");
      double b = num.nextDouble();
      System.out.println("Digite outro número");
      double c = num.nextDouble();
      
      delta = Math.pow(b, 2) * 4 * a * c;
      x1 = (-b)+ Math.sqrt(delta)/ 2*  a;
      x2 = (-b)- Math.sqrt(delta)/ 2 * a;
      
      if(a!=0){
          if (delta>0)
            {
              System.out.println("x1:"+x1);
              System.out.println("x2:"+x2);
            }
          else
            if (delta==0)
                {
                    System.out.println("x1"+x1);
                }
                else
                    {
                        System.out.println(" A equação não possui resultados reais");
                    }
        }
         else
            System.out.println(" A equação não possui resultados reais");
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.util.Scanner;


public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       int a = 6;
       Scanner input = new Scanner (System.in);
       System.out.println("Informe Dados: ");
       a = input.nextInt();
       System.out.println("Informação inserida é  " + a);
      
       switch (a)
   {
       case 1:
       System.out.println("Informação Inserida é 1");
       break;
       
       case 2:
       System.out.println("Informação inserida é 2");
       break;
       
       case 3:
       System.out.println("Informação Inserida é 3");
       break;
       
      }
    }
    
}

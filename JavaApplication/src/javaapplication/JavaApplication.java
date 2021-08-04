/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

/**
 *
 * @author jean.zimmermann
 */
public class JavaApplication {
             
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //JavaApplication Val = new JavaApplication();
        String strl = "Ola mundo";
        int[] Listnum = {1, 2, 3, 4, 5};
        int resp = 6;
        int a = 1;
        int b = 2;
        

        int c = 3;
        int d = 4;
        int e = a + b;
        int f = a + c;
        int g = a + d;
        System.out.println(strl);
        System.out.println ("1+2 = " + e);
        System.out.println ("1+3 = " + f);
        System.out.println ("1+4 = " + g);
        System.out.printf("Soma das variaveis a e b = %d \n",a+b);
        
            if(Listnum[0] + Listnum[2] == resp){
                System.out.print("resposta correta " + (Listnum[6] - Listnum[0]));
            }
            else{
                System.out.print("resposta incorreta");
            }
    }
    
}

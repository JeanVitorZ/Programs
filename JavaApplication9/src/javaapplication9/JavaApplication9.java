/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.io.*;


public class JavaApplication9  {


    public static void main(String[] args) {
        
        NewClass a = new NewClass();
        a.name = "teste";
        a.idade = 32;
        String arq = "infor.dat";
        
        ObjectOutputStream oS = new ObjectOutputStream(new FileOutputStream(arq));
    }
    
}

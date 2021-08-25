/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.io.*;
import javax.swing.JOptionPane;


public class JavaApplication9  {


    public static void main(String[] args) {
        
        NewClass a = new NewClass();
        a.name = "teste";
        a.idade = 32;
        String arq = "infor.dat";
        try{
        ObjectOutputStream oS = new ObjectOutputStream(new FileOutputStream(arq));
        oS.writeObject(a);
        oS.close();
        }catch(FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }catch(IOException e) {
             JOptionPane.showMessageDialog(null, e.getMessage());    
        }       
        
         try{
        ObjectInputStream iS = new ObjectInputStream(new FileInputStream(arq));
        NewClass resp = (NewClass)iS.readObject();
        System.out.println("Recebendo Dados: " + resp.name + " e idade: " + resp.idade);
        iS.close();
        }catch(IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }catch(ClassNotFoundException e) {
             JOptionPane.showMessageDialog(null, e.getMessage());}
        
    }
        
    
}

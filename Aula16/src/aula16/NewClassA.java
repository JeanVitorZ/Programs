/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula16;

import javax.swing.JOptionPane;

/**
 *
 * @author jean.zimmermann
 */
public class NewClassA implements Funções{
   


    @Override
    public void regDados() {
     
     JOptionPane.showMessageDialog(null, "Ola...");
        
    }

    @Override
    public void verDados() {
      
      JOptionPane.showMessageDialog(null, "Aqui esta vazio");
        
    }
    
}

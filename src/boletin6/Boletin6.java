
package boletin6;

import javax.swing.JOptionPane;

public class Boletin6 {

  
    public static void main(String[] args) {
      Conta conta=new Conta();
      conta.setSaldo();
      conta.calcularIngreso();
      conta.calcularReintegro();
      conta.setNome();
      conta.visualizar();

    }
    
}

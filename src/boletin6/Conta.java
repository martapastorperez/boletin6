
package boletin6;

import javax.swing.JOptionPane;

public class Conta {
//atributos
    private String nomeCliente, numeroConta; 
    private double saldo;
    public Conta (){

    }
    //constructores
    public Conta (String nome, String num, double sald){
        nomeCliente=nome;
        numeroConta=num;
        saldo=sald;
    }
    //metodos de acceso
    public boolean calcularIngreso (){
         double cantidad =Double.parseDouble(JOptionPane.showInputDialog("Introducir cantidad ingreso"));
            if(cantidad>0){
             System.out.println("El dinero total é de " +(saldo+cantidad));
             return true;
         }
             else 
             return false ;
       
         }
    
      public boolean calcularReintegro (){
      double cantidad=Double.parseDouble(JOptionPane.showInputDialog("Introducir cantidad reintegro"));
       double calcularReintegro= saldo-cantidad;
       if(calcularReintegro>0){
           System.out.println("La cantidad é de "+(saldo-cantidad));
           return true;         
         }
           else
           return false; 
         }
      public double setSaldo(){
          JOptionPane.showInputDialog("Introducir saldo ");
          return saldo;
      }
     public String setNome(){
       JOptionPane.showInputDialog("Introducir nome");
      return nomeCliente;
    }
        public String setConta(){
            JOptionPane.showInputDialog("Introducir número de conta");
            return numeroConta;
        }
      public void visualizar(){
          System.out.println("Nome do cliente "+nomeCliente+ " o número de conta é "+numeroConta+ " o saldo é de "+saldo);
      }
      public void transferencia(){
       double importe=Double.parseDouble(JOptionPane.showInputDialog("Introducir importe de transferencia"));
       if (saldo>importe){
           System.out.println("O saldo é de "+(saldo+-importe));
       }
       else
              System.out.println("Non se pode facer a transferencia ");
      }
      
        
        
        
        
        
        
        
        
        
        
        
        
    
}

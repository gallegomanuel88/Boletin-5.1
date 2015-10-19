/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol5.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author galle
 */
public class Satelite {
    //atributos
     private double meridiano ;
     private double paralelo ;
     private double distanciaTerra ;
   
     //contructor
 public Satelite ( ) {

  meridiano = paralelo = distanciaTerra = 0 ;
}
public Satelite ( double m, double p , double d )  {

meridiano = m ;
paralelo = p;
distanciaTerra = d ;

}
//metodos
public double getMeridiano(){
    return meridiano;
}
public double getParalelo (){
    return paralelo;
}
public double getDistanciaTerra (){
    return distanciaTerra;
}
public void verPosicion ( ) {

JOptionPane.showMessageDialog(null,"o satelite atopase  no paralelo "+ paralelo + ", meridiano " + meridiano+ ", a unha distancia da terra " + distanciaTerra );
}
}

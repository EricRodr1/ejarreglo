/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicioarreglo;
import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author Eric Rodriguez
 */
public class Ejercicioarreglo {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        
        int nentrada;
        
        nentrada = Integer.parseInt(JOptionPane.showInputDialog("Favor ingresar los caracteres que necesita"));
        char[] letras = new char[nentrada];
        
        System.out.println("Favor ingrese los caracteres");
        
        for (int i = 0; i < nentrada; i++) {
            System.out.println((i+1)+" "+"Favor ingresar el caracter");
            letras[i]=entrada.next().charAt(0);
            
        }
        System.out.println("Los caracteres ingresados son: ");
        for (int i = 0; i < nentrada; i++) {
            System.out.println(letras[i]);
            
        }
    }
}

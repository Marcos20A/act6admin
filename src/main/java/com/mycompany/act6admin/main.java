/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.act6admin;

import java.util.Scanner;
import javax.swing.JOptionPane;
        
public class main {
    
    public static void main(String[] args) {
        
        //Area de un cuadrado
        
        int lado = 0, area = 0;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese el lado del cuadrado: ");
        lado = lectura.nextInt();
        area = lado * lado; 
        System.out.println("El area del cuadrado es de: " + area);
        
        //Diametro de un circulo
        System.out.println("Ingrese el radio del circulo: ");
        double radio=lectura.nextDouble();
        
        double diametro = 2*radio;
        
        System.out.println("El diametro del circulo es de: " + diametro);
        
        //verificar si hay una letra mayuscula 
        System.out.println("Ingrese una tecla mayuscula o minuscula");
        char letra = lectura.next().charAt(0);
        
        if(Character.isUpperCase(letra)){
            System.out.println("La letra que ingreso es mayuscula ");
        }else{
            System.out.println("La letra que ingreso es minuscula ");
        }
        //verficacion numero primo
        int num; 
        int b = 0;
        System.out.println("Ingrese un numero a verificar ");
        num = lectura.nextInt();
        
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                b++;
            }
        }
        
        if(b == 2){
            System.out.println("Es numero primo");
        }else{
            System.out.println("no es un numero primo");
        }
        
        //verificar si un texto tiene uno o mas numeros
        System.out.println("Ingresa un texto con letras y numeros");
        Scanner lec = new Scanner(System.in);
        String entrada = lec.nextLine();
        
        //String minu="";
       // String mayu="";
        String nume="";
        String let="";
        String espa="";
        
       // int nmayu = 0;
        //int nminu = 0;
        int nnume = 0;
        int nlet = 0;
        int nspa = 0;
        
        for(int i = 0; i<entrada.length();i++){
            if(Character.isLetter(entrada.charAt(i))){
                nlet++;
                let+=entrada.charAt(i)+" - ";
            }
           /* if(Character.isLowerCase(entrada.charAt(i))){
                nminu++;
                minu+=entrada.charAt(i)+" - ";
            }
            if(Character.isUpperCase(entrada.charAt(i))){
                nmayu++;
                mayu+=entrada.charAt(i)+" - ";
            
            }
            */
            if(Character.isDigit(entrada.charAt(i))){
                nnume++;
                nume+=entrada.charAt(i)+" - ";
            }
            if(Character.isSpaceChar(entrada.charAt(i))){
                nspa++;
                espa+=entrada.charAt(i)+" - ";
            
            }
            
        }
        System.out.println("Letras("+ nlet + "): "+let);
        System.out.println("Numeros("+ nnume+ "): "+nume);
    }
}

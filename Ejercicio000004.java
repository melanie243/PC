/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio000004;


import static java.lang.Math.random;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author melanieserpa
 */
public class Ejercicio000004 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner scanner = new Scanner(System.in);
   Random randon = new Random();
   System.out.println("Lanzando los dados ");

   char respuestaUsuario;
do {

    int dadoA=randon.nextInt(1,6);
    
    int dadoB=randon.nextInt(1,6);
    
    System.out.println("Los valores son:" + dadoA);
    System.out.println("Los valores son:" + dadoB);

     System.out.println("DESEA VOLVER A TIRAR); (Y/N):");
     respuestaUsuario= scanner.next().charAt(0);
     } while(respuestaUsuario == 'y'|| respuestaUsuario == 'y');


    }
    }

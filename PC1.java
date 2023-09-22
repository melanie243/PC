/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pc1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author melanieserpa
 */
public class PC1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Random rn = new Random();
        String rpta = "y"; 
        while (rpta == "y"){
            
            System.out.println("Tirando dados...");
            ArrayList<Integer> lista = new ArrayList<Integer>();
            for (int i = 0; i < 2; i++){
                lista.add(rn.nextInt(6)+1);
            }
            System.out.println("Sus valores son: ");
            System.out.println(lista.get(0) + " " + lista.get(1));
            System.out.println("Desea volver a tirar los dados (y = yes)");
            Scanner leer = new Scanner(System.in);
            String rptaV = leer.nextLine();
            if (rptaV.compareTo("y") == 0){
                rpta = "y";
            }
            else{
                rpta = "n";
            }
        }
    
    }
    
}

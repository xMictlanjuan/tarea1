/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_tarea1;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author JUAN PABLO
 */
public class Ejercicio1_tarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner (System.in);
        //empezamos pidiendo datos al usuario 
        System.out.println("Digite el numero de filas: ");
        int n = sc.nextInt();
        System.out.println("Digite el numero de columnas: ");
        int m = sc.nextInt();
        int [][] matriz = new int [n][m];
        for (int i=0;i<matriz.length; i++){
        for (int j=0;j<matriz.length; j++){
           matriz[i][j]=random.nextInt(100);   
        } 
        }
        String respuesta = "";
        for (int i=0;i<=matriz.length; i++) {
            for (int j=0; j<=matriz.length; j++) {
                respuesta = respuesta +" "+ matriz[i][j];
            }
            respuesta = respuesta + "\n";
        }
        System.out.println(respuesta);
    }
    
}

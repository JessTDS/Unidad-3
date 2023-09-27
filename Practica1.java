/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1;

import java.util.Scanner;

public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero");
        int numero = scanner.nextInt();
        
        boolean esPar = numero % 2 ==0;
        
        if (esPar){
            System.out.println("El numero es par");
    } else {
            System.out.println("El numero es impar");
        }
    }
    
}

package Fibonacci;

import java.util.Scanner;

public class Fibonacci {

   
    public static void main(String[] args) 
    {
        Scanner nubecita = new Scanner(System.in);
        int a= 0, b =1, c, n;
        System.out.println("Ingresar la cantidad de numeros para la serie de Fibonacci");
        n = nubecita.nextInt();
        nubecita.close();
        
        
        
        System.out.println("Esta es la serie de Fibonacci con " + n + " numeros: ");
        
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            c = a + b;
                    a = b;
           b=c;
            
            
        }
    }
    
}

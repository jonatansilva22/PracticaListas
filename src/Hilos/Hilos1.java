//Jonatan Silva
package Hilos;

import java.util.Scanner;
public class Hilos1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Introduce un numero:");
        num = sc.nextInt();

        for (int i = 0; i < num; i++){
            System.out.println("Total de numeros: " +num);
            System.out.println("Ingrese un numero para calcular factorial: ");
            int n;
            n = sc.nextInt();
            Thread hilo = new Thread(new Factorial(n));
            hilo.start();
        }
    }
}
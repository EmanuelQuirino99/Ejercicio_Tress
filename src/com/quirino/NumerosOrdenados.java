package com.quirino;
import java.util.Scanner;

public class NumerosOrdenados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2 , n3, mayor, menor, inter;
        System.out.print("Ingresa primer número ");
        n1 = sc.nextInt();
        System.out.print("Ingresa segundo número ");
        n2 = sc.nextInt();
        System.out.print("Ingresa tercer número ");
        n3 = sc.nextInt();
        mayor = menor = inter = n1;
        if (n2 > mayor) {
            mayor = n2;
        }
        if (n3 > mayor) {
            mayor = n3;
        }
        if (n2 < menor) {
            menor = n2;
        }
        if (n3 < menor) {
            menor = n3;
        }
        if ((n1 > menor) && (n1 < mayor)) {
            inter = n1;
        }
        if ((n2 > menor) && (n2 < mayor)) {
            inter = n2;
        }
        if ((n3 > menor) && (n3 < mayor)) {
            inter = n3;
        }
        System.out.println("Menor: " + menor);
        System.out.println("Intermedio: " + inter);
        System.out.println("Mayor: " + mayor);
    }
}


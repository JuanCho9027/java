package co.com.ps.b4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TrabajoEnClase3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> palabras = new ArrayList<>();

        System.out.println("Ingrese las palabras deseadas: ");
        String palabra = scanner.nextLine().trim();

        int contador = 0;
        for (String p:palabras){
            if (p.length() > 4){
                contador++;
            }
        }

        System.out.println("Cantidad de palabras con más de cuatro letras: " + contador);
        scanner.close();

    //METODO MAS CORTO PARA ENCONTRAR Y CONTAR LAS PALABRAS
        List<String> pala= Arrays.asList("Hola","Mundo","Stream","Ejemplo");
        pala.stream().filter(palab->palab.length()>4).forEach(System.out::println);
    }
}

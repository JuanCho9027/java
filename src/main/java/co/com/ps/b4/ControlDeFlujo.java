package co.com.ps.b4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ControlDeFlujo {
    public static void main(String[] args){
        //While
        int contador=0;
        while (contador<5){
            System.out.println("Contador (While): "+contador);
            contador++;
        }
        //Do While
        contador=0;
        do{
            System.out.println("Contador (Do-While): "+contador);
            contador++;
        }while (contador<5);
        //For
        for (int i=0; i<5;i++){
            System.out.println("Iteracción (for): "+i);
        }
        //String
        List<String> palabras= Arrays.asList("Hola","Mundo","Ejemplo","Practica","Trabajos");
        List<String> palabrasFiltradas=palabras.stream()
                .filter(palabra->palabra.length()>5)
                        .toList();
        System.out.println("Palabras filtradass (Stream): "+palabrasFiltradas);

        List<String> lista=new ArrayList<>();
        lista.add("c1");
        lista.add("c2");
        lista.add("c3");
        lista.add("c4");
        lista.add("c5");
        lista.add("c6");

        for (int i=0; i<lista.size();i++){
            System.out.println(lista.get(i));
        }
    }
}
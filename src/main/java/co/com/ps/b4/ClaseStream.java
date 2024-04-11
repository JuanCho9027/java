package co.com.ps.b4;

import java.util.Arrays;
import java.util.List;

public class ClaseStream {
    public static void main(String[] args){
        List<String>palabras= Arrays.asList("Hola","Mundo","Stream","Ejemplo");
        palabras.stream().filter(palabra->palabra.length()>4).forEach(System.out::println);

        //CONVERTIR PALABRAS EN MAYUSCULAS
        List<String>palabras2=Arrays.asList("Programando","En","Java");
        var palabrasEnMayusculas=palabras2.stream().map(String::toUpperCase).toList();
        palabrasEnMayusculas.stream().forEach(System.out::println);

        //QUITAR NÚMEROS REPETIDOS
        List<Integer>numero=Arrays.asList(1,2,3,2,2,2,3,3,4,3,4,4,5,4,4,6,7,76,5,5,7,7);
        numero.stream().distinct().forEach(System.out::println);
    }
}

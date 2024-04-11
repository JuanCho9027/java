package co.com.ps.b3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Colombiano colombiano=new Colombiano("2323522","Daniver","Torres","C.C","B+");
        System.out.println(colombiano.getNombre());
        colombiano.setNombre("MarioCorrea");
        System.out.println(colombiano.getNombre());
        //System.out.println(colombiano.getNombre());

//  <------------------------------------------------------------------->

        int age=33;
        double fraction=1.9;
        boolean isTrue=false;
        short number=60;
        char letter='a';

        //Wrapper: Son objetos que pueden tener atributos, metodos y constructor
        //Los primitivos son mas eficientes
        Integer ages=88;
        Boolean isFalse=false;

        Date date=new Date ();
        LocalDate localdate=LocalDate.now();
        System.out.println(age);

//  <------------------------------------------------------------------->

/*        int mum=10;
        if (num > 0){
            System.out.println("El número es positivo");
        } else {
            System.out.println("El número es negativo");
        }*/

//  <------------------------------------------------------------------->

        int dia=3;
        String nombreDia="";
        switch (dia){
            case 1:
                nombreDia="Lunes";
                break;
            case 2:
                nombreDia="Martes";
                break;
            case 3:
                nombreDia="Miercoles";
                break;
            case 4:
                nombreDia="Jueves";
                break;
            case 5:
                nombreDia="Viernes";
                break;
            case 6:
                nombreDia="Sabado";
                break;
            case 7:
                nombreDia="Domingo";
                break;
        }
        System.out.println("El día "+dia+" es: "+nombreDia);

        //Arreglos, tamaño del arreglo
        List<String> lista=new ArrayList<>();
        String[] miArreglo=new String[2];
        String[] miArreglo2={"Hola","Mundo"};
        miArreglo2[0]="Hi";
    }
}

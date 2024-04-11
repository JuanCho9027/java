//Toda clase JAVA inicia con MAYUSCULA y esta 'Main' es la clase principal
//Clase: Plantilla para la declaración de objetos
//Utilizando el shortcout 'main' se agrega automaticamente

package co.com.ps.b1;

import java.time.LocalDate;
import java.util.Date;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hi World");
        System.out.println("Mi first print in JAVA");
        int age=33;
        double fraction=1.9;
        boolean isTrue=false;
        short number=60;
        char letter='a';
        Date date=new Date ();
        LocalDate localdate=LocalDate.now();
        System.out.println(age);
    }
}

package co.com.ps.b2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        // Clase (Persona), nombre variable, Constructor
        Persona person=new Persona(); //Constructor (metodo para construir nuestra clase a partir de datos predeterminados)
    //    Persona person1=new Persona();
    //    Persona person2=new Persona();
        person.name="Daniver";
        person.age=33;
    //    person.sex="Male";
        person.tall=1.80f;  //Se pone la 'f' para indicar o que lo tome como punto.flotante
        person.id="35415445";

        person.walk(3);
        person.dance();
        Persona.sing(); //El método estatico se llama a traves de la clase
        System.out.println(LocalDate.now());
        Persona person1=new Persona("Daniver", 30,"3244364",1.90f);
        Persona person2=new Persona("Juan",20,"342534636",1.87f);
        Persona person1=new Persona("Maria", 70,"32344364",1.70f);
        Persona person2=new Persona("Jose",25,"34252136",1.67f);
        System.out.println(person1);
    }
}

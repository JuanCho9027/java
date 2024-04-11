//Main-METODO PRINCIPAL para llamar el metodo 'Persona'

//Constructor (metodo para construir nuestra clase a partir de datos predeterminados)
package co.com.ps.b2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        //Clase (Persona), nombre (objeto) variable, Constructor
        Persona person=new Persona();

        person.name="";
        person.age=33;
        person.sex="Male";
        person.tall=1.80f;  //Se pone la 'f' para indicar o que lo tome como punto.flotante
        person.id="35415445";

        person.walk(3);
        person.dance();
        Persona.sing(); //El método estatico se llama a traves de la clase
        System.out.println(LocalDate.now());
        Persona person1=new Persona("Daniver",20,"Masculino","8327497");
        Persona person2=new Persona("Carlos", 30,"Masculino","4538664");
        Persona person3=new Persona("Juana",20,"Femenino","5625454");
        Persona person4=new Persona("Maria", 70,"Femenino","34241434");
        Persona person5=new Persona("Jose",25,"Masculino","54254545");
        System.out.println(person1.name+" "+person1.age);
    }
}

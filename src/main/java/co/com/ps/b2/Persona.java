//Atributos: Caracteristicas que puede tener un objeto en la vida real
//Abstracción: Capacidad de extraer informacion y representarla en una CLASE
//METODO O FUNCION: Hacer algo (Canta, bailar, leer)
package co.com.ps.b2;

public class Persona {
    String colorSkin;
    int age;
    float tall;
    String sex;
    String name;
    String id;
    String phone;

    //CONSTRUTORES: Metodo especifico que sirve para construir la clase a partir de datos predeterminados
    //Desde el 'main' estoy llamando dos constructores
    Persona(){

    }
    Persona(String name, int age, String sex, String id){
        this.name=name;
        this.age=age;
        this.sex=sex;
        this.id=id;
    }
    //METODOS O FUNCION (Retornar un valor-respuesta)
    //Con el VOID no devuelve nada, es estatico 'static'
    //Este metodo recibe un entero y retorna el mismo entero
    public static void sing(){
        System.out.println("I'm singing");
    }
    public void dance(){
        System.out.println("I'm dancing");
    }
    public int walk(int blocks){
        //int footblocks=blocks
        return blocks*100;
    }
}

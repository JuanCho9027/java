package co.com.ps.b3;
//Atributos
public class Colombiano {
    private String cedula; //Solamente lo puede ver la clase
    String nombre;
    String apellido;
    String tipoDocumento;
    String tipoSangre;

    //Constructor
    //Clic derecho >> generate >> Constructor (Señalar todos los campos)
    public Colombiano(String cedula, String nombre, String apellido, String tipoDocumento, String tipoSangre) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDocumento = tipoDocumento;
        this.tipoSangre = tipoSangre;
    }
    //Getter and Setter (Consultar valores privados - Modificar valores privados)
    //Clic derecho > Generate > Getter and Setter
    //Encapsulamiento: Todos los datos de la clase deben estar encapsulados, otros metodos no tienen potestad de manipular informacion
    //Metodos
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
}

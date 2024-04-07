package co.com.ps.b3;

public class Colombiano {
    private String cedula; //Solamente lo puede ver la clase
    String nombre;
    String apellido;
    String tipoDocumento;
    String tipoSangre;

    public Colombiano(String cedula, String nombre, String apellido, String tipoDocumento, String tipoSangre) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDocumento = tipoDocumento;
        this.tipoSangre = tipoSangre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
}

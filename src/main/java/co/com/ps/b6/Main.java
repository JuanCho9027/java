package co.com.ps.b6;

public class Main {
    public static void main(String[] args) {
        try {
            int resultado=dividir(10,0);
            System.out.println(resultado);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("La aplicacion termino con exito");
    }
    public static int dividir(int a, int b){
        return a/b;
    }
}

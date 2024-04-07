package co.com.ps.b3;

public class Main {
    public static void main(String[] args){
        Colombiano colombiano=new Colombiano("2323522","Daniver","Torres","C.C","B+");
        System.out.println(colombiano.getNombre());
        colombiano.setNombre("MarioCorrea");
        System.out.println(colombiano.getNombre());
        //System.out.println(colombiano.getNombre());
    }

}

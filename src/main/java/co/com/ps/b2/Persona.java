package co.com.ps.b2;

public class Persona {
    String colorSkin;
    int age;
    float tall;
    String sex;
    String name;
    String id;
    String phone;

    Persona(String name, int age, String id, float tall){
        this.name=name;
        this.age=age;
        this.id=id;
        this.tall=tall;
    }
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

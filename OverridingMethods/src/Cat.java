import java.util.Objects;

public class Cat extends Animal{
    protected String raza;

    public Cat(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    public void scratch(){
        System.out.println("scratching");
    }

    @Override
    public void sleep(){
        System.out.println("The cat is sleeping on the couch.");
    }

}
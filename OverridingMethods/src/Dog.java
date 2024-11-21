import java.util.Objects;

public class Dog extends Animal{
    protected String raza;
    public void bark(){
        System.out.println("Barking");
    }

    public Dog(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    @Override
    public void eat(){
        System.out.println("The dog is eating dog kibbles.");
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Dog )return this.nombre.equals(((Dog) o).nombre);
        if (o == null || getClass() != o.getClass()) return false;
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(raza);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "raza='" + raza + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
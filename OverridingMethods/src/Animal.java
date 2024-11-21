public class Animal {
    protected String nombre;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    protected int edad;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void eat(){
        System.out.println("eating");
    }

    public void sleep(){
        System.out.println("sleeping");
    }

    public static void main(String[] args) {
        Animal animal1 = new Cat("Michi", 5, "Persa");
        Animal animal2 = new Dog("Firulais", 3, "Caniche");
        Animal animal3 = new Dog("Firulais", 7, "Labrador");

        animal1.sleep();
        animal2.eat();
        System.out.println(animal2.equals(animal3));
        System.out.println(animal2.hashCode());
        System.out.println(animal2);
    }

}


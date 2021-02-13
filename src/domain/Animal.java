package domain;

public class Animal {

    protected String name;

    protected int weight;

    public void animal() {
        name="generic animal";
        weight=1;
    }

    public void eat() {
        System.out.println("Animals eating");
    }

    public void speak() {
        System.out.println("Animals speaking");
    }

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + ", weight=" + weight + '}';
    }

    
}

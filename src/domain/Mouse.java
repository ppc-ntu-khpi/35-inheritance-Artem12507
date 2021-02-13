package domain;

public class Mouse extends Predator {

    private String kind;

    public Mouse(String name, int weight, String kind) {
        this.kind=kind;
        this.weight=weight;
        this.name=name;
    }

    public Mouse() {
        this("France", 1, "Bars");
    }

    public Mouse(String name) {
        this(name,1,"Bars");
    }

    public void play() {
        System.out.println("Mouse don't playing");
    }

    @Override
    public void hunt() {
        System.out.println("Mouse don't hunting");
    }


    @Override
    public void speak() {
        System.out.println("Peow, peow");
    }

    @Override
    public void eat() {
        System.out.println("Mouse eat all!!");
    }

    @Override
    public void animal() {
        super.animal(); //To change body of generated methods, choose Tools | Templates.
    }

    public void run() {
        System.out.println("Mouse running!");
    }
}

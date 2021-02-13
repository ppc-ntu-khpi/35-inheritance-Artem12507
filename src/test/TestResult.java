package test;

import domain.Mouse;

public class TestResult {

    public void main(String[] args) {
        Mouse mouse = new Mouse("Jerry");
        System.out.println(mouse);
        mouse.eat();
        mouse.hunt();
        mouse.play();
        mouse.run();
        mouse.speak();
    }
}

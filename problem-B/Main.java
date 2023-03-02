import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        d.eat();
        d.walk();


        c.eat();
        c.walk();


        a.eat();
        a.walk();

        e.eat();
        e.walk();


        p.play();
        System.out.println(p.getName()); // Fluffy
        p.setName("Larry");
        System.out.println(p.getName()); // Mittens

        Animal f = new Spider();
        f.walk();




    }
}

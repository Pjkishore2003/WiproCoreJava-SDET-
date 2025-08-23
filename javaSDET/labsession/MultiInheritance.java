package labsession;

class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(name + " is barking");
    }
}
class Puppy extends Dog {
    public Puppy(String name) {
        super(name);
    }

    public void play() {
        System.out.println(name + " is playing");
    }
}

public class MultiInheritance {
    public static void main(String[] args) {
        Puppy puppy = new Puppy("Buddy");
        puppy.eat();   // From Animal
        puppy.bark();  // From Dog
        puppy.play();  // From Puppy
    }
}

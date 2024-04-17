import java.util.ArrayList;
import java.util.List;

public class Ex7 {
    public static void main(String[] args) {
        List<Pet> pets = new ArrayList<>();
        pets.add(new Cat("Tom", 3, "Cat"));
        pets.add(new Dog("Spike", 5, "Dog"));
        pets.add(new Cat("Jerry", 2, "Cat"));
        pets.add(new Dog("Tyke", 1, "Dog"));

        for (Pet p : pets) {
            if (p.type.equals("Cat")) {
                System.out.println("Cat: " + p.name + " is " + p.age + " years old");
            } else if (p.type.equals("Dog")) {
                System.out.println("Dog: " + p.name + " is " + p.age + " years old");
            }
        }
    }
}

class Pet {
    String name;
    int age;
    String type;
}

class Cat extends Pet {
    public Cat(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }
}

class Dog extends Pet {
    public Dog(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }
}
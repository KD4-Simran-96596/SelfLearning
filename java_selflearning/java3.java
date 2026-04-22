abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void makeSound();
}

class Lion extends Animal {
    public Lion(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println(name + " (Lion) roars");
    }
}

class Tiger extends Animal {
    public Tiger(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println(name + " (Tiger) growls");
    }
}

class Elephant extends Animal {
    public Elephant(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println(name + " (Elephant) trumpets");
    }
}
class Zoo {
    private Animal[] animals;
    private int count;

    public Zoo(int size) {
        animals = new Animal[size];
        count = 0;
    }

    public void addAnimal(Animal a) {
        if (count < animals.length) {
            animals[count++] = a;
            System.out.println("Animal added to zoo");
        } else {
            System.out.println("Zoo is full!");
        }
    }

    public void showAnimals() {
        System.out.println("\nZoo Animals:");
        for (int i = 0; i < count; i++) {
            animals[i].makeSound();
        }
    }
}

public class ZooTest {
    public static void main(String[] args) {

        Zoo zoo = new Zoo(5); // HAS-A relationship

        zoo.addAnimal(new Lion("Simba"));
        zoo.addAnimal(new Tiger("Sheru"));
        zoo.addAnimal(new Elephant("Appu"));

        zoo.showAnimals();
    }
}

class Main {
    public static void main(String[] args) {

        // Dog instance
        Dog dog1 = new Dog();
        dog1.setType("Pitbull Dog");
        dog1.setName("Destroyer");
        dog1.intro();

        // Cat instance
        Cat cat1 = new Cat();
        cat1.setType("Persian Cat");
        cat1.setName("Chef");
        cat1.intro();

        System.out.println("=================");

        // Polymorphism
        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[0].setType("Machine Dog");
        animals[0].setName("Android01");

        animals[1] = new Cat();
        animals[1].setType("Machine Cat");
        animals[1].setName("Xeon P012");

        animals[2] = new Dog();
        animals[2] = animals[1];

        for (Animal animal : animals) {
            animal.intro();
        }

        System.out.println("=================");

        // Polymorphism Arguments
        Vet vet = new Vet();
        vet.giveAShot(dog1);
        vet.giveAShot(cat1);

        System.out.println("=================");

        Hippo hippo = new Hippo();
        hippo.setType("Hybrid Animal");
        hippo.setName("Pipo");
        // Overloading
        hippo.intro();
        hippo.intro("Hello I'm " + hippo.getName());

    }
}

// Super Call
class Animal {
    private String type;
    private String name;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Behavior
    public void intro() {
        System.out.println("This is " + this.name + " and it is a " + this.type);
    }

    public void makeNoise() {
        System.out.println("The " + this.type + " Name: " + this.name + " is making noise ...");
    }
}

// SubClass of SuperClass (Animal)
class Dog extends Animal {}
class Cat extends Animal {}

class Hippo extends Animal {
    @java.lang.Override
    public void intro() {
        super.intro();
        System.out.println("EXTENDED: This is Hippo Intro Method");
    }

    // Overloading
    public void intro(String arg) {
        System.out.println("OVERLOADING: This is a new overloading Intro with message " + arg);
    }
}


class Vet {
    // Polymorphism Arguments
    public void giveAShot (Animal animal) {
        System.out.println("Vet is giving a shot to " + animal.getName());
        animal.makeNoise();
    }
}
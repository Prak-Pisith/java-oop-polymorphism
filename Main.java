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
        Animal[] animals = new Animal[2];
        animals[0] = new Dog();
        animals[0].setType("Machine Dog");
        animals[0].setName("Android01");

        animals[1] = new Cat();
        animals[1].setType("Machine Cat");
        animals[1].setName("Xeon P012");

        for (Animal animal : animals) {
            animal.intro();
        }

    }
}

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
}

class Dog extends Animal {}
class Cat extends Animal {}
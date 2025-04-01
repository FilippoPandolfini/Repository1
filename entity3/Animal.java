package entity3;

public abstract class Animal {
    String name;
    String makeSound;

    public Animal(String name, String makeSound) {
        this.name = name;
        this.makeSound = makeSound;
    }
    public String getName() {
        return name;
    }

    public String getMakeSound() {
        return makeSound;
    }

    public abstract void makeSound();

    // public void makeSound() {}

    //public abstract void makeSound();
}
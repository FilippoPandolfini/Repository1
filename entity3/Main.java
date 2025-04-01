package entity3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("cane", "BAU") {
            @Override
            public void makeSound() {

            }
        };
        Animal animal2 = new Animal("gatto", "MEOW") {
            @Override
            public void makeSound() {

            }
        };
        Animal animal3 = new Animal("mucca", "MUUU") {
            @Override
            public void makeSound() {

            }
        };
        Animal animal4 = new Animal("coccodrillo", "???") {
            @Override
            public void makeSound() {

            }
        };

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Di quale animale vuoi conoscere il verso? \n" +
                "1 " + animal.getName() + " 2 " + animal2.getName() +
                " 3 " + animal3.getName() + " 4 " + animal4.getName());
        int choice = scanner.nextInt();

        if (choice == 3) {
            System.out.println("La " + animal3.getName() + " fa " + animal3.getMakeSound());
        } else if (choice == 4) {
            System.out.println("Il " + animal4.getName() + " fa " + animal4.getMakeSound() +
                    " ... A quanto pare non lo sappiamo!");
        } else {
            System.out.println("Il " + animal.getName() + " fa " + animal.getMakeSound());
        }

         */
        System.out.println("Il " + animal.getName() + " fa " + animal.getMakeSound());
        System.out.println("Il " + animal2.getName() + " fa " + animal2.getMakeSound());
        System.out.println("La " + animal3.getName() + " fa " + animal3.getMakeSound());
        System.out.println("Il " + animal4.getName() + " fa " + animal4.getMakeSound());
    }
}

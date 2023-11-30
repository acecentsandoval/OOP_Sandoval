import java.util.Scanner;

// Animal Abstract Class
abstract class Animal {
    public abstract void eat();

    public abstract void sleep();

    public abstract void makeSound();
}

// Bird Class
class Bird extends Animal {
    public void eat() {
        System.out.println("Birds love to eat seeds.");
    }

    public void sleep() {
        System.out.println("and sleep for 10-12 hours a day");
    }

    public void makeSound() {
        System.out.println("Tweet tweet!");
    }
}

// Cat Class
class Cat extends Animal {
    public void eat() {
        System.out.println("Cats love to eat Fish ");
    }

    public void sleep() {
        System.out.println("and sleep an average of 15 hours a day");
    }

    public void makeSound() {
        System.out.println("Meow");
    }
}

// Dog Class
class Dog extends Animal {
    public void eat() {
        System.out.println("Dogs love to eat beef and fork ");
    }

    public void sleep() {
        System.out.println("and sleep for 8 and 13.5 hours per day");
    }

    public void makeSound() {
        System.out.println("Arff Arf!");
    }
}

public class RunAnimal {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        while (true) {
            System.out.print(" Press B for Bird \n Press C for Cat \n Press D for Dog");
            System.out.print("\nChoose an Animal or type 'exit' to quit : ");
            String animal = user.nextLine();

            if (animal.equalsIgnoreCase("b")) {
                Bird bird = new Bird();
                bird.eat();
                bird.sleep();
                bird.makeSound();
            } else if (animal.equalsIgnoreCase("c")) {
                Cat cat = new Cat();
                cat.eat();
                cat.sleep();
                cat.makeSound();
            } else if (animal.equalsIgnoreCase("d")) {
                Dog dog = new Dog();
                dog.eat();
                dog.sleep();
                dog.makeSound();
            } else if (animal.equalsIgnoreCase("exit")) {
                System.out.println("Exit...");
                break;
            } else {
                System.out.println("Not Found. Try Again");
                continue;
            }
            System.out.println();
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon;

/**
 *
 * @author Acecent Sandoval
 */
public class PokemonTrainer {
    String name;
    int health;
    int attack;

    public PokemonTrainer(String name, int health, int attack) {
        this.name = name;
        this.health = health;
        this.attack = attack;
    }

    public void train() {
        this.health -= 4;
        this.attack += 2;
        System.out.println("Decreased 4 health");
        System.out.println("You gained 2 attack.");
    }

    public void rest() {
        this.health += 2;
        System.out.println("You gained 2 health.");
    }

    public void displayStats() {
        System.out.println("\nStatus of your Pokemon");
        System.out.println("Name: " + this.name);
        System.out.println("HEALTH: " + this.health);
        System.out.println("ATTACK: " + this.attack);
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pokemon;

import java.util.*;

public class Pokemon {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println("Enter your Pokemon Name ");
        String name = user.nextLine();
        System.out.println("\nWelcome to Pokemon Battle " + name + "!");
        System.out.println("\n" + name + "!" + " Please Select Type of Your Pokemon!");
        System.out.println("1. Fire \n2. Water \n3. Grass");
        int choice = user.nextInt();

        PokemonTrainer trainer = new PokemonTrainer(name, 100, 20);
        PokemonElement pokemon = null;
        AIOpponent aiOpponent = new AIOpponent();

        if (choice == 1) {
            pokemon = new FirePokemon();
            System.out.println("\nCongrats! \nYou Successfully Created a Fire Pokemon!");
            trainer.displayStats();
        } else if (choice == 2) {
            pokemon = new WaterPokemon();
            System.out.println("\nCongrats! \nYou Successfully Created a Water Pokemon!");
            trainer.displayStats();
        } else if (choice == 3) {
            pokemon = new GrassPokemon();
            System.out.println("\nCongrats! \nYou Successfully Created a Grass Pokemon!");
            trainer.displayStats();
        } else {
            System.out.println("Exit Game");
            System.exit(0);
        }

        do {
            System.out.println("\n1. Train \n2. Rest \n3. Display Stats \n4. Fight \n5. Exit ");
            choice = user.nextInt();
            if (choice == 1) {
                trainer.train();
            } else if (choice == 2) {
                trainer.rest();
            } else if (choice == 3) {
                trainer.displayStats();
            } else if (choice == 4) {
                System.out.println("\n1. VS AI \n2. Back ");
                choice = user.nextInt();

                if (choice == 1) {
                    Random rand = new Random();

                    do {
                        int playerDamage = 0;
                        int aiDamage = 0;

                        System.out.println("Your Health: " + trainer.health);
                        System.out.println("AI Opponent's Health: " + aiOpponent.health);

                        pokemon.displayAbilities();

                        System.out.println("4. Skip");
                        int attackChoice = user.nextInt();

                        if (attackChoice == 4) {
                            System.out.println("You chose to skip.");
                        } else {
                            playerDamage = pokemon.attack(attackChoice);
                        }

                        aiDamage = rand.nextInt(aiOpponent.aiAttack());

                        System.out.println("\nYou dealt " + playerDamage + " damage to the AI Opponent.");
                        System.out.println("AI Opponent attacked and dealt " + aiDamage + " damage to you.\n");

                        aiOpponent.health -= playerDamage;
                        trainer.health -= aiDamage;

                        if (aiOpponent.health <= 0) {
                            System.out.println("/nCongratulations! You defeated the AI Opponent!");
                            System.exit(0);
                        } else if (trainer.health <= 0) {
                            System.out.println("You were defeated by the AI Opponent!");
                            break;
                        }
                    } while (true);
                } else if (choice == 2) {
                    System.out.println(" ");
                }
            }
        } while (choice != 5);
    }
}
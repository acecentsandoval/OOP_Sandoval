/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon;

/**
 *
 * @author Acecent Sandoval
 */
public class FirePokemon implements PokemonElement {

    public void displayAbilities() {
        System.out.println("Choose your move:");
        System.out.println("1. Fire Blast\n2. Ember\n3. Flamethrower");
    }


    public int attack(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Used Fired Blast, Wraaaaaa!");
                return fireBlast();
            case 2:
                System.out.println("Used Ember, EMMMMBEEER!");
                return ember();
            case 3:
                System.out.println("Used Flamethrower, SIIGEEEEE!");
                return flamethrower();
            default:
                return 0; 
        }
    }

    private int fireBlast() {
        int damage = 12; 
        return damage;
    }

    private int ember() {
        int damage = 10; 
        return damage;
    }

    private int flamethrower() {
        int damage = 15; 
        return damage;
    }
}


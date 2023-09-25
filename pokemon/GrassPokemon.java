/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon;

/**
 *
 * @author Acecent Sandoval
 */
public class GrassPokemon implements PokemonElement {

    public void displayAbilities() {
        System.out.println("Choose your move:");
        System.out.println("1. Vine Whip\n2. Razor Leaf\n3. Solar Beam");
    }


    public int attack(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Used Vine Whip, Washeeneney!");
                return vineWhip();
            case 2:
                System.out.println("Used Razor Leaf, BRRRRRR!");
                return razorLeaf();
            case 3:
                System.out.println("Used Solar Beam, BEEIIIM!");
                return solarBeam();
            default:
                return 0; 
        }
    }

    private int vineWhip() {
        int damage = 10; 
        return damage;
    }

    private int razorLeaf() {
        int damage = 12; 
        return damage;
    }

    private int solarBeam() {
        int damage = 20; 
        return damage;
    }
}


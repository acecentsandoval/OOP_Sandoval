/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon;

/**
 *
 * @author Acecent Sandoval
 */
public class WaterPokemon implements PokemonElement {

    public void displayAbilities() {
        System.out.println("Choose your move:");
        System.out.println("1. Water Gun\n2. Bubble\n3. Hydro Pump");
    }


    public int attack(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Used Water Gun. Phew! Phew!");
                return waterGun();
            case 2:
                System.out.println("Used Bubble. blffff!");
                return bubble();
            case 3:
                System.out.println("Used Hydro Pump, Sheeessshh!");
                return hydroPump();
            default:
                return 0;
        }
    }

    private int waterGun() {
        int damage = 10; 
        return damage;
    }

    private int bubble() {
        int damage = 8; 
        return damage;
    }

    private int hydroPump() {
        int damage = 18; 
        return damage;
    }
}


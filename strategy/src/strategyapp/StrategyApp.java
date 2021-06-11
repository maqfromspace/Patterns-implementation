package strategyapp;

import strategyapp.characater.*;
import strategyapp.characater.Character;
import strategyapp.weapon.AxeBehaviour;
import strategyapp.weapon.KnifeBehaviour;
import strategyapp.weapon.SwordBehaviour;

import java.util.Scanner;

public class StrategyApp {
    public static void main(String[] args) {
        Character character = null;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = sc.nextLine();


        System.out.println("Choose type: ");
        System.out.println("1) King");
        System.out.println("2) Knight");
        System.out.println("3) Queen");
        System.out.println("4) Troll");

        boolean correctType = false;
        while (!correctType)
            switch (sc.nextInt()) {
                case 1:
                    character = new King(name);
                    correctType = true;
                    break;
                case 2:
                    character = new Knight(name);
                    correctType = true;
                    break;
                case 3:
                    character = new Queen(name);
                    correctType = true;
                    break;
                case 4:
                    character = new Troll(name);
                    correctType = true;
                    break;
                default:
                    System.out.println("Enter correct type: ");
            }

        System.out.println("Select weapon: ");
        System.out.println("1) Axe");
        System.out.println("2) Knife");
        System.out.println("3) Sword");

        boolean correctWeaponType = false;
        while (!correctWeaponType)
            switch (sc.nextInt()) {
                case 1:
                    character.setWeaponBehaviour(new AxeBehaviour());
                    correctWeaponType = true;
                    break;
                case 2:
                    character.setWeaponBehaviour(new KnifeBehaviour());
                    correctWeaponType = true;
                    break;
                case 3:
                    character.setWeaponBehaviour(new SwordBehaviour());
                    correctWeaponType = true;
                    break;
                default:
                    System.out.println("Enter correct weapon type: ");
            }

        character.goFight();

    }
}

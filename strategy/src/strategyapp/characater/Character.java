package strategyapp.characater;

import strategyapp.weapon.WeaponBehaviour;

public abstract class Character {
    String name;

    public void setWeaponBehaviour(WeaponBehaviour weaponBehaviour) {
        this.weaponBehaviour = weaponBehaviour;
    }

    WeaponBehaviour weaponBehaviour;

    Character(String name) {
        this.name = name;
    }

    public void goFight() {
        System.out.println(name);
        weaponBehaviour.fight();
    }
}

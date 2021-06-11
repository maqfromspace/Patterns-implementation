package strategyapp.weapon;

public class SwordBehaviour implements WeaponBehaviour {
    @Override
    public void fight() {
        System.out.println("Fight with SWORD");
    }
}

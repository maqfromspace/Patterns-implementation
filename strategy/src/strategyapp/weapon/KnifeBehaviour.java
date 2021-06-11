package strategyapp.weapon;

public class KnifeBehaviour implements WeaponBehaviour {
    @Override
    public void fight() {
        System.out.println("Fight with KNIFE");
    }
}

package strategyapp.weapon;

public class AxeBehaviour implements WeaponBehaviour {

    @Override
    public void fight() {
        System.out.println("Fight with AXE");
    }
}

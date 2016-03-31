package springDI;

import interfaces.Extremity;
import interfaces.Weapon;
import interfaces.Zerg;

/**
 * Created by Кома on 30.03.2016.
 */
public class Unit1 implements Zerg {

    private Extremity extremity;
    private Weapon weapon;

    public Unit1() {
    }

    public Unit1(Extremity extremity, Weapon weapon) {
        this.extremity = extremity;
        this.weapon = weapon;
    }

    public void say(){
        System.out.println("i need more wespen gas");
    }


    public void attack() {
        weapon.fire();
    }

    public void move() {
        extremity.move();
    }
}

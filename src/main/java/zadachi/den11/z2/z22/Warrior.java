package zadachi.den11.z2.z22;

import zadachi.den11.z2.z21.interf.PhysAttack;

public class Warrior extends Heros implements PhysAttack {

    public Warrior(String name) {
        super(name);
        physAttack = 30;
        physDefence = 0.8;
        magicalDefence = 0;
        attackScore = 0;
    }

    /**
     *
     */
    @Override
    public void physAttack(Heros h){
         attackScore = physAttack-(physAttack * h.physDefence);
        if(h.health - attackScore <= h.MIN_HEALTH_POINTS){
            h.health = h.MIN_HEALTH_POINTS;
        }else{
            h.health -= attackScore;
        }

    }

    @Override
    public String toString() {
        return "Warrior{" +
                "name='" + name + '\'' +
                ", health=" + health +
                '}';
    }
}
